package com.myjava;

public class Movie {
	
	static String TheatreName,TheatreLocation;
	String MovieName,Releasedate;
	int budget;

	public static void main(String[] args) {
		
		TheatreName="prasads pcx";
		TheatreLocation="Khairatabad";
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		Movie m4 = new Movie();
		Movie m5 = new Movie();
		 
		
		 m1.MovieName="Toxic";
		 m1.Releasedate="26-08-2026";
		 m1.budget=700;
		 
		 m2.MovieName="odessey";
		 m2.Releasedate="17-07-2026";
		 m2.budget=1000; 
		 
		 m3.MovieName="salaar";
		 m3.Releasedate="20-12-2023";
		 m3.budget=300;
		 
		 m4.MovieName="paradise";
		 m4.Releasedate="24-08-2026";
		 m4.budget=200;
		 
		 m5.MovieName="varanasi";
		 m5.Releasedate="27-04-2027";
		 m5.budget=300;
		 
		 
		 System.out.print("Theatre Name : "+TheatreName+"\n"+"Theatre Location : "+TheatreLocation+"\n____________________________\n");
		 System.out.print("Movie Name : "+m1.MovieName+"\n"+"Release date : "+m1.Releasedate+"\n"+"Budget : "+m1.budget+"\n____________________________\n");
		 System.out.print("Movie Name : "+m2.MovieName+"\n"+"Release date : "+m2.Releasedate+"\n"+"Budget : "+m2.budget+"\n____________________________\n");
		 System.out.print("Movie Name : "+m3.MovieName+"\n"+"Release date : "+m3.Releasedate+"\n"+"Budget : "+m3.budget+"\n____________________________\n");
		 System.out.print("Movie Name : "+m4.MovieName+"\n"+"Release date : "+m4.Releasedate+"\n"+"Budget : "+m4.budget+"\n____________________________\n");
		 System.out.print("Movie Name : "+m5.MovieName+"\n"+"Release date : "+m5.Releasedate+"\n"+"Budget : "+m5.budget+"\n");
	}

}
