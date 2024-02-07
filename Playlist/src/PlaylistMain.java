import java.util.Scanner;

import java.util.ArrayList;



public class PlaylistMain {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Playlist p  = new Playlist("Bole", 10);
		int choice = -1;

		while(choice != 6) {
			System.out.println("Which method would you like to test?");
			System.out.println("1: Switches positions of these two songs");
			System.out.println("2: Returns a count of how many songs are associated with given musician");
			System.out.println("3: Removes songs with a certain title");
			System.out.println("4: Removes all elements associated with a certain artist");
			System.out.println("5: Removes all elements with a star rating less than the cutoff");
			System.out.println("6: Quit");
			choice = s.nextInt();

			if(choice == 1) {
				System.out.println(p.toString());
				System.out.println("Which 2 positions would you like to switch?");
				int switch1 = s.nextInt();
				int switch2 = s.nextInt();
				p.swap(switch1, switch2);
				System.out.println(p.toString());

			}

			else if(choice == 2) {
				System.out.println(p.toString());
				System.out.println("Which artist would you like to investigate?");
				String musician = s.next();
				System.out.println("There are " + p.numSongsByArtist(musician) + " songs by " + musician);

			}

			else if(choice == 3) {
				System.out.println(p.toString());
				System.out.println("Which title would you like to remove?");
				String title = s.next();
				p.removeSong(title);
				System.out.println(p.toString());

			}

			else if(choice == 4) {

				System.out.println(p.toString());

				System.out.println("Which artist would you like to remove?");

				String artist = s.next();

				p.removeArtist(artist);

				System.out.println(p.toString());

			}

			else if(choice == 5) {

				System.out.println(p.toString());

				System.out.println("What would your cutoff like to be?");

				int cutoff = s.nextInt();

				p.removeLowStars(cutoff);

				System.out.println(p.toString());

			}

			else {

				System.out.println("Have a nice day");

			}

		}



		

	}

	

}

