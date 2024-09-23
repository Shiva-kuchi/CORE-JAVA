package com.evergent.corejava.FinalApplication;
import java.util.*;
public class MovieService implements MovieInterface
{
      List<MovieBean> movieList;
      List<String> addToWatchList;
      HashMap<String,List<String>> genreList=new HashMap<String,List<String>>();
      ArrayList<String> result=new ArrayList<>();
      boolean isUpdate;
      int updateCount;
      MovieDAO mda=new MovieDAO();

      public MovieService()
      {
         movieList=new ArrayList<MovieBean>();
         addToWatchList=new ArrayList<String>();
         isUpdate=true;
      }
      public int addMovie(MovieBean m)
      {
         
        	 int updateCount=mda.createAccount(m);
             movieList.add(m);
             return updateCount;
      }
      public void search(String name)
      {
    	  result=(ArrayList<String>) mda.displayAll();
    	  if(result.contains(name))
    	  {
    		  System.out.println("Yes Movie is present in database");
    	  }
    	  else
    	  {
    		  System.out.println("No movie is not present in database");
    	  }
      }
      public void displayAll()
      {
    	   result=(ArrayList<String>) mda.displayAll();
    	   if(!result.isEmpty())
    	    System.out.println(result);
    	   else
    		 System.out.println("MovieList is Empty");  
    	 System.out.println();
      }
//      public void category()
//      {
//            if(!isUpdate)
//            {
//                return;
//            }
//            for(Movie movie:movieList)
//            {
//                String genre=movie.getGenre();
//                genreList.putIfAbsent(genre,new ArrayList<>());
//                genreList.get(genre).add(movie);
//            }
//            isUpdate=false;
//      }
      public void genreFilerList()
      {    
            //category();
//            for(Map.Entry<String,List<Movie>> map:genreList.entrySet())
//            {
//                   String moviekey=map.getKey();
//                   List<Movie> Mlist=map.getValue();
//                   System.out.println("Genre is :"+moviekey);
//                   for(Movie m:Mlist)
//                   {
//                      System.out.println(m.getMovieName());
//                   }
//            }
    	  genreList=mda.genreFilterList();
    	  for(Map.Entry<String,List<String>> map:genreList.entrySet())
    	  {
    		  System.out.println("Genre : "+map.getKey());
    		  System.out.println("------------");
    		  for(String movie:map.getValue())
    		  {
    			  System.out.println(movie);
    		  }
    		  System.out.println();
    	  }
    	 // System.out.println(genreList);
      }
      public int addToWatchList(String movie)
      {         
           updateCount= mda.addWatchList(movie);
           return updateCount;      
      }
      public void displayWatchList()
      {
         addToWatchList=mda.displayFromWatchList();
         System.out.println(addToWatchList);
      }
      public int updateMovie(String name,String gen,String pl) 
      {
    	  updateCount=mda.updateUser(name, gen, pl);
    	  return updateCount;  
      }
      public int removeFromWatchList(String mov) 
      {
    	  updateCount=mda.removeFromWatchList(mov);
    	  return updateCount;
      }
      public int removeFromMovieList(String movieName)
      {
    	  updateCount=mda.removeFromMovies(movieName);
    	  return updateCount;
      }
}
