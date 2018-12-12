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
		stock.add("Ace-Spade");
		stock.add("2-Spade");
		stock.add("3-Spade");
		stock.add("4-Spade");
		stock.add("5-Spade");
		stock.add("6-Spade");
		stock.add("7-Spade");
		stock.add("8-Spade");
		stock.add("9-Spade");
		stock.add("10-Spade");
		stock.add("Jack-Spade");
		stock.add("Queen-Spade");
		stock.add("King-Spade");
		stock.add("Ace-Heart");
		stock.add("2-Heart");
		stock.add("3-Heart");
		stock.add("4-Heart");
		stock.add("5-Heart");
		stock.add("6-Heart");
		stock.add("7-Heart");
		stock.add("8-Heart");
		stock.add("9-Heart");
		stock.add("10-Heart");
		stock.add("Jack-Heart");
		stock.add("Queen-Heart");
		stock.add("King-Heart");
		stock.add("Ace-Club");
		stock.add("2-Club");
		stock.add("3-Club");
		stock.add("4-Club");
		stock.add("5-Club");
		stock.add("6-Club");
		stock.add("7-Club");
		stock.add("8-Club");
		stock.add("9-Club");
		stock.add("10-Club");
		stock.add("Jack-Club");
		stock.add("Queen-Club");
		stock.add("King-Club");
		stock.add("Ace-Diamond");
		stock.add("2-Diamond");
		stock.add("3-Diamond");
		stock.add("4-Diamond");
		stock.add("5-Diamond");
		stock.add("6-Diamond");
		stock.add("7-Diamond");
		stock.add("8-Diamond");
		stock.add("9-Diamond");
		stock.add("10-Diamond");
		stock.add("Jack-Diamond");
		stock.add("Queen-Diamond");
		stock.add("King-Diamond");
		
		
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