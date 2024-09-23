package com.evergent.corejava.FinalApplication;
import java.util.*;
public class MovieMainController
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        MovieInterface movie=new MovieService();
        String movieName;
        int updateCount;
        String genre;
        String platfrom;
        while(true)
        {
        	System.out.println("---- Welcome to Movie World----");
            System.out.println("1.Add Movie\n2.Search by movieName\n3.display All Movies\n4.filer Movie By Genre\n5.Add to watchList\n6.DisplayWatchList\n7.update the Movie Details\n8.RemoveFromWatchList\n9.removeFromMoviesList\n10.Exit");
            int choice=input.nextInt();
            switch(choice)
            {
                  case 1:
                       System.out.print("Enter the movie name :");
                       movieName=input.next();
                       System.out.print("Enter the movie genre :");
                       genre=input.next();
                       System.out.print("Enter rating :");
                       double rating=input.nextDouble();
                       System.out.print("Enter Format :");
                       String fromat=input.next();
                       System.out.print("Enter the language :");
                       String language=input.next();
                       System.out.print("Enter the Budget in CR:");
                       double budget=input.nextDouble();
                       System.out.print("Enter the Streaming Platfrom :");
                       platfrom=input.next();
                       MovieBean m=new MovieBean();
                       m.setMovieName(movieName);
                       m.setGenre(genre);
                       m.setRating(rating);
                       m.setFormat(fromat);
                       m.setLanguage(language);
                       m.setBudget(budget);
                       m.setStreamingPlatform(platfrom);
                       updateCount=movie.addMovie(m);
                       if(updateCount>0)
                       System.out.println("sucessfully Added movie:"+updateCount);
                       else
                       System.out.println("Unsuccessfull Operation");
                       break;
                 case 2:
                        System.out.print("Enter the movie name :");
                        movieName=input.next();
                        movie.search(movieName);
                        break;
                 case 3:
                       movie.displayAll();
                       break;
                 case 4:
                       movie.genreFilerList();
                       break;
                 case 5:
                       System.out.print("Enter the movie to add your playlist :");
                       movieName=input.next();
                       updateCount= movie.addToWatchList(movieName);
                       if(updateCount>0)
                       System.out.println("Movie "+updateCount+" Is added successfully");
                       else
                       System.out.println("Unsuccessfull Operation");   
                       break;
                 case 6:
                       movie.displayWatchList();
                       break;
                 case 7:
                	  System.out.println("Enter moviename to update genre and platform");
                	  movieName=input.next();
                	  System.out.println("Enter The Updated Genre");
                	  genre=input.next();
                	  System.out.println("Enter The Updated Platform");
                	  platfrom=input.next();
                	  updateCount=movie.updateMovie(movieName,genre,platfrom);
                	  if(updateCount>0)
                	  System.out.println("Updated "+updateCount+" Movie successfully");
                	  else
                	  System.out.println("Unsuccessfull Operation");	  
                	  break;
                 case 8:
                	 System.out.println("Enter Movie name to Deleted");
                	 movieName=input.next();
                	 updateCount=movie.removeFromWatchList(movieName);
                	 if(updateCount>0)
                	 System.out.println(updateCount+" Movie is Deleted sucessfully");
                	 else
                	 System.out.println("Unsuccessfull Operation");	 
                	 break;
                 case 9:
                	 System.out.println("Enter the Movie name:");
                	 movieName=input.next();
                	 updateCount=movie.removeFromMovieList(movieName);
                	 if(updateCount>0)
                	 System.out.println(updateCount+"Movie is Deleted successfully");
                	 else
                	 System.out.println("Unsuccessfull Operation");
                 case 10:
                	  System.out.println("Thank you for Visting Movie World");
                	  System.exit(0);
                	  break;
                 default:
                	    System.out.print("Invaild option");
                	    break;
                
            }
        }
    }
}