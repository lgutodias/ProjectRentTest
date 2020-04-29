package model;
<<<<<<< HEAD

=======
>>>>>>> d0986ff8b4c19d675d222afd5c46bf4a2d40fae2
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UltraVision {

	public static void main(String[] args) {
		
		Music s1 = new Song();
		Music lcv = new LiveConcertVideo();
		
		Video mv = new Movie();
		TV bs = new BoxSet();
		
		TitleInterface p1 = new Song();
		TitleInterface p2 = new LiveConcertVideo();
		TitleInterface p3 = new Movie();
		TitleInterface p4 = new BoxSet();
		
		Musiclover msl = new Musiclover();
		
		if (msl.size() <= 4) {
			msl.add(s1);
			msl.add(lcv);
		}
		
		// Customer rent some titles
		Customer customer = new Customer();
		customer.setMembershipPlan(msl);
		
	} // End main method
} // End class UltraVideo

interface TitleInterface {
	public String getName();
	public void setName(String name);
	public String getGenre();
	public void setGenre(String genre);
}

interface Music extends TitleInterface {
	public String getArtist();
	public void setArtist(String artist);
}

interface Video extends TitleInterface {
	public String getDirector();
	public void setDirector(String director);
}

interface TV extends TitleInterface {
	public String getSeason();
	public void setSeason(String season);
}

abstract class Title implements TitleInterface {

	private String name;
	private String genre;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getGenre() {
		return this.genre;
	}

	@Override
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Title [name=" + name + ", genre=" + genre + "]";
	}
	
}

final class Song extends Title implements Music {

	private String artist;
	
	@Override
	public String getArtist() {
		return this.artist;
	}

	@Override
	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Song [artist=" + artist + "]";
	}

}

final class LiveConcertVideo extends Title implements Music {

	private String artist;
	
	@Override
	public String getArtist() {
		return this.artist;
	}

	@Override
	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "LiveConcertVideo [artist=" + artist + "]";
	}
	
}
		

final class Movie extends Title implements Video {

	private String director;
	
	@Override
	public String getDirector() {
		return this.director;
	}

	@Override
	public void setDirector(String director) {
		this.director = director;
	}
	
}

final class BoxSet extends Title implements TV {

	private String season;
	
	@Override
	public String getSeason() {
		return this.season;
	}

	@Override
	public void setSeason(String season) {
		this.season = season;
	}
	


// =========== The Lovers =====================

//class Customer {
	
	private String name;
	private MembershipPlan<?> membership;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public MembershipPlan<?> getMembershipPlan() {
		return this.membership;
	}
	
	public void setMembershipPlan(MembershipPlan<?> membership) {
		this.membership = membership;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", membership=" + membership + "]";
	}
	
}

interface MembershipPlan<T> {
	public List<T> getAll();
	public void add(T t);
	public void delete(int index);
	public void delete(T t);
	public int size();
	public T get(int index);
}

class Musiclover implements MembershipPlan<Music> {
	
	private List<Music> musics = new ArrayList<>();
	
	// CRUD - C = create; R = read; U = update; D = delete
	@Override
	public List<Music> getAll(){
		return this.musics;
	}
	
	@Override
	public void add(Music m) {
		this.musics.add(m);
	}
	
	@Override
	public void delete(int index) {
		this.musics.remove(this.musics.get(index));
	}
	
	@Override
	public void delete(Music m) {
		this.musics.remove(m);
	}
	
	@Override
	public int size() {
		return this.musics.size();
	}
	
	@Override
	public Music get(int index) {
		return this.musics.get(index);
	}
	
}

class VideoLover implements MembershipPlan<Video> {
	
	private List<Video> videos = new ArrayList<>();
	
	// CRUD - C = create; R = read; U = update; D = delete
	@Override
	public List<Video> getAll(){
		return this.videos;
	}
	
	@Override
	public void add(Video m) {
		this.videos.add(m);
	}
	
	@Override
	public void delete(int index) {
		this.videos.remove(this.videos.get(index));
	}
	
	@Override
	public void delete(Video m) {
		this.videos.remove(m);
	}
	
	@Override
	public int size() {
		return this.videos.size();
	}
	
	@Override
	public Video get(int index) {
		return this.videos.get(index);
	}
}

class TVLover implements MembershipPlan<TV> {
	
	private List<TV> tvs = new ArrayList<>();
	
	// CRUD - C = create; R = read; U = update; D = delete
	@Override
	public List<TV> getAll(){
		return this.tvs;
	}
	
	@Override
	public void add(TV m) {
		this.tvs.add(m);
	}
	
	@Override
	public void delete(int index) {
		this.tvs.remove(this.tvs.get(index));
	}
	
	@Override
	public void delete(TV m) {
		this.tvs.remove(m);
	}
	
	@Override
	public int size() {
		return this.tvs.size();
	}
	
	@Override
	public TV get(int index) {
		return this.tvs.get(index);
	}
}

class Premium implements MembershipPlan<TitleInterface> {
	
	private List<TitleInterface> titles = new ArrayList<>();
	
	// CRUD - C = create; R = read; U = update; D = delete
	@Override
	public List<TitleInterface> getAll(){
		return this.titles;
	}
	
	@Override
	public void add(TitleInterface m) {
		this.titles.add(m);
	}
	
	@Override
	public void delete(int index) {
		this.titles.remove(this.titles.get(index));
	}
	
	@Override
	public void delete(TitleInterface m) {
		this.titles.remove(m);
	}
	
	@Override
	public int size() {
		return this.titles.size();
	}
	
	@Override
	public TitleInterface get(int index) {
		return this.titles.get(index);
	}
}

