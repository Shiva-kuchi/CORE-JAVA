package com.evergent.corejava.oops;

public class UserLogin 
{
	public void logindata()
	{
		System.out.println("login data");
	}
	public void logindata(String uname,String pass)
	{
		System.out.println("uname:"+uname);
		System.out.println("pass:"+pass);
	}
	public void logindata(String uname,String pass,String capcha)
	{
	    System.out.println("uname:"+uname);
	    System.out.println("pass:"+pass);
	}
	public void show()
	{
		System.out.println("show method");
	}
	public static void main(String[] args) 
	{
		UserLogin login=new UserLogin();
		login.logindata();
		login.logindata("Raj","Raj123");
		login.logindata("Shiva","12345","welcome");
		login.show();
	}

}
