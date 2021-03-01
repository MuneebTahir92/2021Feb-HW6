package nestedclass;

import java.util.Scanner;

public class BuyVideoGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Which system would you like to buy this game for?");
		String system = in.nextLine();
		VideoGames game = new VideoGames();
		game.buyAGame(system);
		in.close();
	}

}
