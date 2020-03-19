package com.org.engineerai.POJO;

public class MyPojo {

    private Hits[] hits;

    private String hitsPerPage;

    private String processingTimeMS;

    private String query;

    private String nbHits;

    private String page;

    private String params;

    private String nbPages;

    private String exhaustiveNbHits;

    public Hits[] getHits ()
    {
        return hits;
    }

    public void setHits (Hits[] hits)
    {
        this.hits = hits;
    }

    public String getHitsPerPage ()
    {
        return hitsPerPage;
    }

    public void setHitsPerPage (String hitsPerPage)
    {
        this.hitsPerPage = hitsPerPage;
    }

    public String getProcessingTimeMS ()
    {
        return processingTimeMS;
    }

    public void setProcessingTimeMS (String processingTimeMS)
    {
        this.processingTimeMS = processingTimeMS;
    }

    public String getQuery ()
    {
        return query;
    }

    public void setQuery (String query)
    {
        this.query = query;
    }

    public String getNbHits ()
    {
        return nbHits;
    }

    public void setNbHits (String nbHits)
    {
        this.nbHits = nbHits;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public String getParams ()
    {
        return params;
    }

    public void setParams (String params)
    {
        this.params = params;
    }

    public String getNbPages ()
    {
        return nbPages;
    }

    public void setNbPages (String nbPages)
    {
        this.nbPages = nbPages;
    }

    public String getExhaustiveNbHits ()
    {
        return exhaustiveNbHits;
    }

    public void setExhaustiveNbHits (String exhaustiveNbHits)
    {
        this.exhaustiveNbHits = exhaustiveNbHits;
    }
}
