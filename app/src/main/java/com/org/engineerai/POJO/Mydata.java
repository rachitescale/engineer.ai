package com.org.engineerai.POJO;

import java.util.List;

public class Mydata {

    String created_at,title;
    List<Hits>hits;
    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public Mydata(String created_ats, String titles) {
    }

    public List<Hits> getHits() {
        return hits;
    }

    public void setHits(List<Hits> hits) {
        this.hits = hits;
    }
}
