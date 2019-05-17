package com.videos.project.models;

import java.util.List;

public class Video
{
    private int idVideo;

    private String title;

    private String url;

    private List tagsList;

    private int owner;

    public Video()
    {
    }

    public int getIdVideo()
    {
        return idVideo;
    }

    public void setIdVideo(int idVideo)
    {
        this.idVideo = idVideo;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public List getTagsList()
    {
        return tagsList;
    }

    public void setTagsList(List tagsList)
    {
        this.tagsList = tagsList;
    }

    public int getOwner()
    {
        return owner;
    }

    public void setOwner(int owner)
    {
        this.owner = owner;
    }
}
