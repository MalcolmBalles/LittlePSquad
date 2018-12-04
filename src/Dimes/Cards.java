package Dimes;

import java.util.ArrayList;

public class Cards {

	public Cards(){
		ArrayList<String >stock = new ArrayList<String>(54);

		for (int i = 0; i < 54; i++) {
			if (i <= 9 && i > 0) {
				stock.add(Integer.toString(i + 1) + "-Spade");
			} else if(i == 0){
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
}
