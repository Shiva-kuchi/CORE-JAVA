package com.evergent.corejava.FinalApplication;
public class MovieBean
{
    String movieName;
    String genre;
    double rating;
    String format;
    String language;
    double budget;
    String streamingPlatform;
    
	public String getMovieName() 
	{
		return movieName;
	}
	public void setMovieName(String movieName) 
	{
		this.movieName = movieName;
	}
	public String getGenre() 
	{
		return genre;
	}
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}
	public double getRating() 
	{
		return rating;
	}
	public void setRating(double rating)
	{
		this.rating = rating;
	}
	public String getFormat() 
	{
		return format;
	}
	public void setFormat(String format)
	{
		this.format = format;
	}
	public String getLanguage()
	{
		return language;
	}
	public void setLanguage(String language)
	{
		this.language = language;
	}
	public double getBudget()
	{
		return budget;
	}
	public void setBudget(double budget) 
	{
		this.budget = budget;
	}
	public String getStreamingPlatform() 
	{
		return streamingPlatform;
	}
	public void setStreamingPlatform(String streamingPlatform) 
	{
		this.streamingPlatform = streamingPlatform;
	}
}