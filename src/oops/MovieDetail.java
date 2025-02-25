package oops;
import java.util.*;
class movie{
	private String title;
	private String genre;
	private String timing;
	movie(String title,String genre,String timing){
		this.setTitle(title);
		this.setgenre(genre);
		this.settiming(timing);
	}
	public String gettitle(){
		return gettitle();
	}
	public String getgenre(){
		return getgenre();
	}
	public String gettiming(){
		return gettiming();
	}
	public String settitle(String tit) {
		this.setTitle(tit);
		return tit;
	}
	public String setgenre(String gen) {
		this.setTitle(gen);
		return gen;
	}
	public String settiming(String tim) {
		this.setTitle(tim);
		return tim;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
class mv1 extends movie{
	mv1(String title,String genre,String timing){
		super(title,genre,timing);
	}
	public void m1(String tit,String gen,String tim) {
		System.out.println("Name of the Movie :"+tit);
		System.out.println("Genre of the Movie :"+gen);
		System.out.println("Timing of the Movie :"+tim);
	}
	public void m2(String tit,String gen,String tim) {
		System.out.println("Name of the Movie :"+tit);
		System.out.println("Genre of the Movie :"+gen);
		System.out.println("Timing of the Movie :"+tim);
	}
	public void m3(String tit,String gen,String tim) {
		System.out.println("Name of the Movie :"+tit);
		System.out.println("Genre of the Movie :"+gen);
		System.out.println("Timing of the Movie :"+tim);
	}
}
public class MovieDetail {
	public static void main(String[]arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select a Movie :");
		System.out.println("1. Avengers: Endgame");
		System.out.println("2. Deadpool vs Wolverin");
		System.out.println("3. Iron man-3");
		String a=sc.next();
		if(a.equals("Avengers: Endgame")||(a.equals("1"))) {
			mv1 obj=new mv1("Avengers: Endgame","Action","3hr 1m");
			obj.m1("Avengers: Endgame","Action","3hr 1m");
		}
		else if(a.equals("Deadpool vs Wolverin")||(a.equals("2"))) {
			mv1 obj2= new mv1("Deadpool vs Wolverin","Comedy","2hr 7m");
			obj2.m2("Deadpool vs Wolverin","Comedy","2hr 7m");
		}
		else if(a.equals("Iron Man-3")||(a.equals("3"))) {
			mv1 obj3=new mv1("Iron Man-3","Scientific","2hr 5m");
			obj3.m3("Iron Man-3","Scientific","2hr 5m");
		}
		else {
			System.out.println("Wrong Selection");
		}
	}
}