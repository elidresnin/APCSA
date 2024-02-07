
import java.util.ArrayList;



public class Playlist {
	private String name;
	private int maxNumberofSongs;
	private ArrayList<Song> Songs;



	public Playlist() {
		this("playlist 1",20);
	}



	public Playlist(String name, int maxNumberofSongs) {
		this.name = name;
		this.maxNumberofSongs = maxNumberofSongs;
		Songs = new ArrayList<Song>();
		Songs.add(new Song("Twinkle, Twinkle Little Star", "The Muffing Man", 4));
		Songs.add(new Song("I've Been Working on the Rail Road", "Justin Beiber", 0));
		Songs.add(new Song("Puff the Magic Dragon", "Puff Daddy", 5));
		Songs.add(new Song("You are  My Sunshine", "The Muffin Man" ,5));
		Songs.add(new Song("Moo, Bah, La La La", "The Muffin Man", 3));
		Songs.add(new Song("Bingo", "Justin Beiber", 0));
		Songs.add(new Song("This Old Man", "Puff Daddy" ,2));
		Songs.add(new Song("Alphabet Song", "Puff Daddy", 4));
		Songs.add(new Song("9 lb Hammer", "The Muffin Man", 3));
		Songs.add(new Song("Froggy Went A-Courtin", "Justin Beiber", 0));
		Songs.add(new Song("Moon", "The Muffin Man", 4));
		Songs.add(new Song("You Don't Know the Muffin Man", "The Muffin Man",5));

	}



	public void swap(int s1, int s2) {
		Song save = Songs.get(s2);
		Songs.set(s2, Songs.get(s1));
		Songs.set(s1, save);

	}

	public void clearList() {
		for(int i = Songs.size()-1; i>=0; i--) {
			Songs.remove(i);

		}

	}

	public boolean add(Song s) {
		if(Songs.size()<maxNumberofSongs) {
			Songs.add(s);
			return true;
		}
		return false;

	}

	public void removeSong(String s) {
		for(int i = 0; i<Songs.size(); i++) {
			if(Songs.get(i).getTitle().equals(s)) {
				Songs.remove(i);
			}
		}
	}

	public void removeLowStars(int cutoff) {
		for(int i = Songs.size()-1; i>=0; i--) {
			if(Songs.get(i).getStars()<cutoff) {
				Songs.remove(i);
			}
		}
	}

	public void removeArtist(String a) {
		for(int i = Songs.size()-1; i>=0; i--) {
			if(Songs.get(i).getArtist().equals(a)) {
				Songs.remove(i);
			}
		}
	}

	public String getName() {
		return name;
	}

	public ArrayList<Song> getSongs(String artist) {
		ArrayList<Song> songs = new ArrayList<>();
		for(Song s: Songs) {
			if(s.getArtist().equals(artist)) {
				songs.add(s);
			}
		}
		return songs;
	}

	public ArrayList<Song> getSongs(){
		return Songs;
	}

	public double averageRating() {
		double sum = 0;
		for(Song s: Songs) {
			sum += s.getStars();
		}
		return sum/Songs.size();
	}

	public int numSongsByArtist(String musician) {
		int num = 0;
		for(Song s: Songs) {
			if(s.getArtist().equals(musician)){
				num++;
			}
		}
		return num;
	}

	public String toString() {
		String s = "";
		for(Song a: Songs) {
			s+=a.toString() + "\n";
		}
		s+="Name: " + name + " ";
		s+="Max Number of Songs: " + maxNumberofSongs;
		return s;

	}

}