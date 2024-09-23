package com.evergent.corejava.FinalApplication;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class MovieDAO 
{
	    public int createAccount(MovieBean user) 
	    {
	        Connection con=null;
	        PreparedStatement pstmt=null;
	        try 
	        {
	            con = MovieConnection.getConnection();
	            String query = "INSERT INTO movie_details (movie_name,genre,rating,format,language,budget,platform) VALUES (?,?,?,?,?,?,?)";
	            pstmt = con.prepareStatement(query);
	            pstmt.setString(1,user.getMovieName());
	            pstmt.setString(2,user.getGenre());
	            pstmt.setDouble(3,user.getRating());
	            pstmt.setString(4,user.getFormat());
	            pstmt.setString(5,user.getLanguage());
	            pstmt.setDouble(6,user.getBudget());
	            pstmt.setString(7,user.getStreamingPlatform());

	            int updateCount = pstmt.executeUpdate();
	            return updateCount;
	        } 
	        catch(Exception e) 
	        {
	            e.printStackTrace();
	            return 0;
	        }
	    }
	    public int updateUser(String mname,String gen,String plat)
	    {
	        Connection con = null;
	        PreparedStatement pstmt = null;
	        try 
	        {
	            con = MovieConnection.getConnection();
	            String query = "UPDATE movie_details SET genre = ?,platform=? WHERE movie_name = ?";
	            pstmt = con.prepareStatement(query);
	            pstmt.setString(1,gen);
	            pstmt.setString(2, plat);
	            pstmt.setString(3, mname);

	            int updateCount = pstmt.executeUpdate();
	            return updateCount;
	        } 
	        catch(Exception e)
	        {
	            e.printStackTrace();
	            return 0;
	        }
	    }
        public int removeFromMovies(String movieName)
        {	
        	Connection con = null;
	        PreparedStatement pstmt = null;
	        try 
	        {
	            con=MovieConnection.getConnection();
	            String query = "delete from movie_details WHERE movie_name = ?";
	            pstmt = con.prepareStatement(query);
	            pstmt.setString(1,movieName);
	            int updateCount=pstmt.executeUpdate();
	            return updateCount;
	        } 
	        catch(Exception e)
	        {
	            e.printStackTrace();
	            return 0;
	        }
        }
	    public int addWatchList(String movieName)
	    {
	        Connection con = null;
	        PreparedStatement pstmt = null;
	        try 
	        {
	            con = MovieConnection.getConnection();
	            String query = "INSERT INTO add_to_watchList VALUES (?)";
	            pstmt = con.prepareStatement(query);
	            pstmt.setString(1, movieName);   
	            int updateCount = pstmt.executeUpdate();
	            return updateCount;
	        }
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	            return 0;
	        }
	    }

	    public List<String> displayAll() 
	    {
	        Connection con = null;
	        PreparedStatement pstmt = null;
	        List<String> watchHistory = new ArrayList<>();
	        try 
	        {
	            con = MovieConnection.getConnection();
	            String query = "SELECT * from movie_details";
	            pstmt = con.prepareStatement(query);
	            ResultSet rs = pstmt.executeQuery();
	            while (rs.next()) 
	            {
	                watchHistory.add(rs.getString("movie_name"));
	            }
	        } 
	        catch(Exception e) 
	        {
	            e.printStackTrace();
	        }
	        return watchHistory;
	    }
	    public List<String> displayFromWatchList() 
	    {
	        Connection con = null;
	        PreparedStatement pstmt = null;
	        List<String> watchHistory = new ArrayList<>();
	        try 
	        {
	            con = MovieConnection.getConnection();
	            String query = "SELECT * from add_to_watchlist";
	            pstmt = con.prepareStatement(query);
	            ResultSet rs = pstmt.executeQuery();
	            while (rs.next()) 
	            {
	                watchHistory.add(rs.getString("movielist"));
	            }
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	        return watchHistory;
	    }
	    public int removeFromWatchList(String movieName)
	    {
	    	Connection con = null;
	        PreparedStatement pstmt = null;
	        try 
	        {
	            con = MovieConnection.getConnection();
	            String query = "delete from add_to_watchList where movielist=?";
	            pstmt = con.prepareStatement(query);
	            pstmt.setString(1,movieName);   
	            int updateCount = pstmt.executeUpdate();
	            return updateCount;
	        }
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	            return 0;
	        }
	    }
	    public HashMap<String,List<String>> genreFilterList()
	    {
	    	    Connection con=null;
		        PreparedStatement pstmt=null;
		        HashMap<String,List<String>> map=new HashMap<>();
		        try 
		        {
		            con = MovieConnection.getConnection();
		            String query = "SELECT * from movie_details";
		            pstmt = con.prepareStatement(query);
		            ResultSet rs = pstmt.executeQuery();
		            while (rs.next()) 
		            {
		               String movieName=rs.getString("movie_name");
		               String genre=rs.getString("genre");
		               map.putIfAbsent(genre,new ArrayList<>());
		               map.get(genre).add(movieName);
		            }
		        } 
		        catch (Exception e) 
		        {
		            e.printStackTrace();
		        }
	    	return map;
	    }
	 
}
