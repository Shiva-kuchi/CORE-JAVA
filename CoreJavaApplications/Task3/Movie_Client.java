package com.evergent.corejava.Task3;

import java.util.*;
public class Movie_Client
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        MovieInterface movie=new MovieImp();
        System.out.println("welcome to movie complex");
        while(true)
        {
            System.out.println("\n1.Add Movie\n2.Search by movieName\n3.display All Movies\n4.filer Movie By Genre\n5.Add to watchList\n6.DisplayWatchList\n");
            System.out.print("Select your option :");
            int choice=input.nextInt();
            switch(choice)
            {
                  case 1:
                       System.out.print("Enter the movie name :");
                       String moviename=input.next();
                       System.out.print("Enter the movie ozoner :");
                       String ozone=input.next();
                       System.out.print("Enter rating :");
                       int rating=input.nextInt();
                       System.out.print("Enter Format :");
                       String fromat=input.next();
                       System.out.print("Enter the language :");
                       String language=input.next();
                       System.out.print("Enter the Budget :");
                       int budget=input.nextInt();
                       System.out.print("Enter the Streaming Platfrom :");
                       String Platfrom=input.next();
                       Movie m=new Movie();
                       m.setMovieName(moviename);
                       m.setOzone(ozone);
                       m.setRating(rating);
                       m.setFormat(fromat);
                       m.setLanguage(language);
                       m.setBudget(budget);
                       m.setStreamingPlatform(Platfrom);
                       movie.addMovie(m);
                       break;
                 case 2:
                        System.out.print("Enter the movie name :");
                        String md=input.next();
                        movie.Search(md);
                        break;
                 case 3:
                       movie.displayAll();
                       break;
                 case 4:
                       movie.ozonerFilerList();
                       break;
                 case 5:
                       System.out.print("Enter the movie to add your playlist :");
                       String addmovie=input.next();
                       movie.addToWatchList(addmovie);
                       break;
                 case 6:
                       movie.displayWatchList();
                       break;
            }
        }
    }
}
