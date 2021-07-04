package hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class BestAlbum {
	public static void main(String[] args) {
		String[] genres= {"classic", "pop", "classic", "classic", "pop"};
		int[] plays= {500, 600, 150, 800, 2500};
		HashMap<String, Integer> genre=new HashMap<String, Integer>();
		HashMap<Integer, Album> hm=new HashMap<Integer, Album>();
		for(int i=0;i<genres.length;i++) {
			hm.put(i, new Album(genres[i], plays[i]));
			genre.put(genres[i], genre.containsKey(genres[i])? 
					genre.get(genres[i])+plays[i] : plays[i]);
		}
		List<Entry<String, Integer>> li=new ArrayList<Entry<String, Integer>>();
		Collections.sort(li, (o1, o2) -> {
			return o1.getKey().compareTo(o2.getKey());
		});
//		List<Entry<Integer, Album>> li=new ArrayList<Entry<Integer,Album>>();
//		Collections.sort(li, (o1, o2) -> {
//			return o1.getKey()-o2.getKey();
//		});
		for(Entry<Integer, Album> en:hm.entrySet()) {
			System.out.println(en.getValue().getGenre());
		}
	}
	public static class Album {
		String genre;
		int play;
		public Album(String genre, int play) {
			this.genre=genre;
			this.play=play;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getPlay() {
			return play;
		}
		public void setPlay(int play) {
			this.play = play;
		}
		
	}
}
