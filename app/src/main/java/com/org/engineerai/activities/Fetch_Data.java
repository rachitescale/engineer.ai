package com.org.engineerai.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.org.engineerai.Interface.FetchInterface;
import com.org.engineerai.POJO.Hits;
import com.org.engineerai.POJO.Mydata;
import com.org.engineerai.POJO.Mydata;
import com.org.engineerai.R;
import com.org.engineerai.adapter.FetchData_Adapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fetch_Data extends AppCompatActivity {

    RecyclerView rv_fetchdata;
    TextView tv_nodata;
    ProgressBar progressbar_viewAll;
    Context context;
    private int page_number = 1;
    boolean isListFinished;

    ArrayList<Mydata> Mydata;
    LinearLayoutManager linearLayoutManager;
    FetchData_Adapter fetchData_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fetchdata);
        context=this;
        Mydata=new ArrayList<>();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rv_fetchdata=(RecyclerView)findViewById(R.id.rv_fetchdata);
        tv_nodata=(TextView)findViewById(R.id.tv_nodata);
        progressbar_viewAll=(ProgressBar) findViewById(R.id.progressbar_viewAll);

        linearLayoutManager=new LinearLayoutManager(context);
        rv_fetchdata.setLayoutManager(linearLayoutManager);
        rv_fetchdata.setAdapter(fetchData_adapter);
        fetchData_adapter=new FetchData_Adapter(context,new ArrayList<Mydata>());
        fetchDataList();

        rv_fetchdata.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (!recyclerView.canScrollVertically(1)) {
                    if (!isListFinished) {
                        progressbar_viewAll.setVisibility(View.VISIBLE);
                        page_number = page_number + 1;
                        fetchDataList();
                    } else {
                        Toast.makeText(Fetch_Data.this, "End of List", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void fetchDataList() {

        FetchInterface fetchInterface = Api_Connection.getClient(context).create(FetchInterface.class);
        Call<List<Mydata>> call = fetchInterface.searchByDate("story", "1");

        call.enqueue(new Callback<List<Mydata>>() {
            @Override
            public void onResponse(Call<List<Mydata>> call, Response<List<Mydata>> response) {

                if(response.body().size()==0){
                    tv_nodata.setVisibility(View.VISIBLE);
                    return;
                }


                for(int index=0;index<response.body().size();index++) {

                    Mydata mydata = (Mydata) response.body().get(index);
                    String Created_ats = mydata.getHits().get(index).getCreated_at();
                    String Titles = mydata.getHits().get(index).getTitle();

                    Mydata.add(new Mydata(Created_ats, Titles));
                    fetchData_adapter = new FetchData_Adapter(context, Mydata);
                    rv_fetchdata.setAdapter(fetchData_adapter);
                    tv_nodata.setVisibility(View.GONE);

                    progressbar_viewAll.setVisibility(View.GONE);
                    if (response.body() != null && response.body().size() > 0) {
                        fetchData_adapter.notifyDataSetChanged();
                        if (response.body().size() < 10)
                            isListFinished = true;
                    } else {
                        isListFinished = true;
                    }
                }

            }

            @Override
            public void onFailure(Call<List<Mydata>> call, Throwable t) {
                tv_nodata.setVisibility(View.VISIBLE);

            }
        });
    }
}
