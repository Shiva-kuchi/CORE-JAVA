package com.evergent.corejava.Task3;

public class Movie
{
    String MovieName;
    String ozone;
    int Rating;
    String Format;
    String Language;
    int Budget;
    String StreamingPlatform;
    
    public void setMovieName(String MovieName)
    {
          this.MovieName=MovieName;
    }
    public String getMovieName()
    {
          return MovieName;
    }
    public void setOzone(String ozone)
    {
        this.ozone=ozone;
    }
    public String getOzone()
    {
        return ozone;
    }
    public void setRating(int Rating)
    {
        this.Rating=Rating;
    }
    public int getRating()
    {
        return Rating;
    }
    public void setFormat(String Format)
    {
        this.Format=Format;
    }
    public String getFormat()
    {
        return Format;
    }
    public void setLanguage(String Language)
    {
        this.Language=Language;
    }
    public void setBudget(int Budget)
    {
        this.Budget=Budget;
    }
    public void setStreamingPlatform(String Platfrom)
    {
        this.StreamingPlatform=Platfrom;
    }
}