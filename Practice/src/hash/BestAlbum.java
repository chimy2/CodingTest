package hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
		List<Integer> answer=new ArrayList<Integer>();
		HashMap<String, Integer> genre=new HashMap<String, Integer>();
		HashMap<Integer, Album> album=new HashMap<Integer, Album>();
		
		for(int i=0;i<genres.length;i++) {
			album.put(i, new Album(genres[i], plays[i]));
			genre.put(genres[i], genre.containsKey(genres[i])? 
					genre.get(genres[i])+plays[i] : plays[i]);
		}
		List<Entry<String, Integer>> li=new ArrayList<>(genre.entrySet());
		Collections.sort(li, (o1, o2) -> {
			return o2.getValue()-o1.getValue();
		});
        
		List<Entry<Integer, Album>> albumLi=new ArrayList<>(album.entrySet());
		Collections.sort(albumLi, (o1, o2) -> {
			int num=-2;
			for(int i=0;i<li.size() && num<-1;i++) {
				boolean b1=o1.getValue().getGenre().equals(li.get(i).getKey());
				boolean b2=o2.getValue().getGenre().equals(li.get(i).getKey());
				if(b1 && b2) {
					num=0;
				} else if(b1) {
					num=-1;
				} else if(b2) {
					num=1;
				}
			}
			if(num==0) {
				if(o1.getValue().getPlay()==o2.getValue().getPlay()) {
					return 0;
				}
				return o2.getValue().getPlay()-o1.getValue().getPlay();
			}
			return num;
		});
        
		String g=albumLi.get(0).getValue().getGenre();
		for(int i=0, j=0, k=0;i<album.size();i++, j++) {
			if(!g.equals(albumLi.get(i).getValue().getGenre())) {
				g=albumLi.get(i).getValue().getGenre();
				j=0;
			}
			if(j<2) {
				answer.add(albumLi.get(i).getKey());
			} 
		}
        return answer.stream().mapToInt(i->i).toArray();
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
