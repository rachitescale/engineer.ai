package com.org.engineerai.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.org.engineerai.POJO.Hits;
import com.org.engineerai.POJO.Mydata;
import com.org.engineerai.R;

import java.util.ArrayList;
import java.util.List;

public class FetchData_Adapter extends RecyclerView.Adapter<FetchData_Adapter.MyViews> {

    Context context;
    List<Mydata>hits;

    public FetchData_Adapter(Context context, List<Mydata> hits) {
        this.context=context;
        this.hits=hits;
    }

    @NonNull
    @Override
    public MyViews onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fetchdata_adapter,parent,false);
        MyViews views=new MyViews(view);
        return views;
    }

    @Override
    public void onBindViewHolder(MyViews holder, int position) {


        holder.tv_Create_at.setText(hits.get(position).getCreated_at());
        holder.tv_Create_at.setText(hits.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return hits.size();
    }

    public class MyViews extends RecyclerView.ViewHolder {
        TextView tv_Create_at,tv_Title;
        public MyViews(View itemView) {
            super(itemView);
            tv_Create_at=itemView.findViewById(R.id.tv_Create_at);
            tv_Title=itemView.findViewById(R.id.tv_Title);

        }
    }
}
