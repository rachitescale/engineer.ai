package com.org.engineerai.POJO;

public class Hits {

    private String comment_text;

    private String story_text;

    private String author;

    private String story_id;

    private String[] _tags;

    private String created_at;

    private String created_at_i;

    private String title;

    private String url;

    private String points;

    private _highlightResult _highlightResult;

    private String num_comments;

    private String story_title;

    private String parent_id;

    private String story_url;

    private String objectID;

    public Hits(String created_ats, String titles) {
        this.created_at=created_ats;
        this.title=titles;
    }


    public String getComment_text ()
    {
        return comment_text;
    }

    public void setComment_text (String comment_text)
    {
        this.comment_text = comment_text;
    }

    public String getStory_text ()
    {
        return story_text;
    }

    public void setStory_text (String story_text)
    {
        this.story_text = story_text;
    }

    public String getAuthor ()
    {
        return author;
    }

    public void setAuthor (String author)
    {
        this.author = author;
    }

    public String getStory_id ()
    {
        return story_id;
    }

    public void setStory_id (String story_id)
    {
        this.story_id = story_id;
    }

    public String[] get_tags ()
    {
        return _tags;
    }

    public void set_tags (String[] _tags)
    {
        this._tags = _tags;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getCreated_at_i ()
    {
        return created_at_i;
    }

    public void setCreated_at_i (String created_at_i)
    {
        this.created_at_i = created_at_i;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getPoints ()
    {
        return points;
    }

    public void setPoints (String points)
    {
        this.points = points;
    }

    public _highlightResult get_highlightResult ()
    {
        return _highlightResult;
    }

    public void set_highlightResult (_highlightResult _highlightResult)
    {
        this._highlightResult = _highlightResult;
    }

    public String getNum_comments ()
    {
        return num_comments;
    }

    public void setNum_comments (String num_comments)
    {
        this.num_comments = num_comments;
    }

    public String getStory_title ()
    {
        return story_title;
    }

    public void setStory_title (String story_title)
    {
        this.story_title = story_title;
    }

    public String getParent_id ()
    {
        return parent_id;
    }

    public void setParent_id (String parent_id)
    {
        this.parent_id = parent_id;
    }

    public String getStory_url ()
    {
        return story_url;
    }

    public void setStory_url (String story_url)
    {
        this.story_url = story_url;
    }

    public String getObjectID ()
    {
        return objectID;
    }

    public void setObjectID (String objectID)
    {
        this.objectID = objectID;
    }


}
