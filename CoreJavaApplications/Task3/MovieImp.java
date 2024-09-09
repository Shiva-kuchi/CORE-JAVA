package com.evergent.corejava.Task3;

import java.util.*;
public class MovieImp implements MovieInterface
{
      HashSet<Movie> movielist;
      List<Movie> addtowatchlist;
      HashMap<String,List<Movie>> ozonelist;
      boolean isupdate;

      public MovieImp()
      {
         movielist=new HashSet<Movie>();
         addtowatchlist=new ArrayList<Movie>();
         ozonelist=new HashMap<String,List<Movie>>();
         isupdate=true;
      }
      public void addMovie(Movie m)
      {
        movielist.add(m);
        System.out.println("Successfully added Movie :"+m.getMovieName());
      }
      public void Search(String name)
      {
    	 boolean flag=false;
        if(movielist.size()>0)
        {
          for(Movie movie:movielist)
          {
              if(movie.getMovieName().equals(name))
              {
            	  flag=true;
                  System.out.println("Yes movie is present");
                  break;
              }
          }
          if(!flag)
          {
        	  System.out.println("The movie you have enterd is not present");
          }
        }
        else
        {
              System.out.println("Sorry your Movie List is empty");
        }
      }
      public void displayAll()
      {
          if(movielist.size()>0)
          {
               for(Movie m:movielist)
               {
                     System.out.println(m.getMovieName());
               }
          }
          else
          {
              System.out.println("Your movie list is empty");
          }
      }
      public void category()
      {
            if(!isupdate)
            {
                return;
            }
            for(Movie movie:movielist)
            {
                String ozone=movie.getOzone();
                ozonelist.putIfAbsent(ozone,new ArrayList<>());
                ozonelist.get(ozone).add(movie);
            }
            isupdate=false;
      }
      public void ozonerFilerList()
      {
            category();
            for(Map.Entry<String,List<Movie>> map:ozonelist.entrySet())
            {
                   String moviekey=map.getKey();
                   List<Movie> Mlist=map.getValue();
                   System.out.println("ozoner is :"+moviekey);
                   for(Movie m:Mlist)
                   {
                      System.out.println(m.getMovieName());
                   }
            }
      }
      public void addToWatchList(String movie)
      {
    	    boolean flag=false;
            for(Movie list:movielist)
            {
                  if(list.getMovieName().equals(movie))
                  {
                      addtowatchlist.add(list);
                      flag=true;
                      System.out.print("successfully Added to your playlist");
                      break;
                  }
            }
            if(!flag)
            {
            	System.out.println("The movie which you want add to your playlist is not present in the MovieList");
            }
      }
      public void displayWatchList()
      {
          for(Movie mylist:addtowatchlist)
          {
               System.out.println(mylist.getMovieName());
          }
      }
}

