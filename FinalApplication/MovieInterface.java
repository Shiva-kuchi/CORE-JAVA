package com.evergent.corejava.FinalApplication;

public interface MovieInterface
{
    public int addMovie(MovieBean m);
    public void search(String movieName);
    public void displayAll();
    public void genreFilerList();
    public int addToWatchList(String movie);
    public void displayWatchList();
    public int updateMovie(String movieName,String genre,String platfrom);
    public int removeFromWatchList(String mname);
    public int removeFromMovieList(String movieName);
}