package cardGames;

import java.util.ArrayList;
import java.util.Random;

public class Cards {
	Random generator = new Random();
	int min = 0;
	int max = 53;
	int randCardPos;
	ArrayList<String> stock = new ArrayList<String>(54);
	ArrayList<String> discard = new ArrayList<String>();
	ArrayList<ArrayList> players = new ArrayList<ArrayList>(6);
	ArrayList<String> hands = new ArrayList<String>();

	public Cards() {
		for (int i = 0; i < 54; i++) {
			if (i <= 9 && i > 0) {
				stock.add(Integer.toString(i + 1) + "-Spade");
			} else if (i == 0) {
				stock.add("Ace-Spade");
			} else if (i == 10) {
				stock.add("Jack-Spade");
			} else if (i == 11) {
				stock.add("Queen-Spade");
			} else if (i == 12) {
				stock.add("King-Spade");
			} else if (i > 13 && i <= 22) {
				stock.add(Integer.toString(i - 12) + "-Heart");
			} else if (i == 13) {
				stock.add("Ace-Heart");
			} else if (i == 23) {
				stock.add("Jack-Heart");
			} else if (i == 24) {
				stock.add("Queen-Heart");
			} else if (i == 25) {
				stock.add("King-Heart");
			} else if (i > 26 && i <= 35) {
				stock.add(Integer.toString(i - 25) + "-Club");
			} else if (i == 26) {
				stock.add("Ace-Club");
			} else if (i == 36) {
				stock.add("Jack-Club");
			} else if (i == 37) {
				stock.add("Queen-Club");
			} else if (i == 38) {
				stock.add("King-Club");
			} else if (i > 39 && i <= 48) {
				stock.add(Integer.toString(i - 38) + "-Diamond");
			} else if (i == 39) {
				stock.add("Ace-Diamond");
			} else if (i == 49) {
				stock.add("Jack-Diamond");
			} else if (i == 50) {
				stock.add("Queen-Diamond");
			} else if (i == 51) {
				stock.add("King-Diamond");
			} else if (i >= 52) {
				stock.add("Joker");
			}
		}
	}

	public void discard() {
		int randCardPos = min + generator.nextInt(max - min + 1);
		discard.add(stock.get(randCardPos));
		stock.remove(randCardPos);
		max -= 1;
	}

	public void dealRandom(int cardsToDeal, int amntPlayers) {

		for (int j = 0; j < amntPlayers; j++) {
			ArrayList<String> hands = new ArrayList<String>();

			for (int n = 0; n < cardsToDeal; n++) {
				int rCP = min + generator.nextInt(max - min + 1);
				hands.add(stock.get(rCP).toUpperCase());
				stock.remove(rCP);
				max = max - 1;
				System.out.println(rCP);
				System.out.println(stock);

			}

			players.add(hands);
			System.out.println(players);
		}

	}

	public ArrayList getPlayerHands() {
		return players;
	}

}