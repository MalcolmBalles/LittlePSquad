package Dimes;

import java.util.Random;
import java.util.Scanner;

public class Dimes {

	Scanner input= new Scanner(System.in);
	Random generator = new Random();
	int players;
	int dealer;
	int round;
	int turn;
	int deal;
	int dealerMax;
	int dealerMin = 1;
	
	public Dimes() {
		players = 2;
		dealer = 0;
		round = 1;
		turn = 0;
		deal = 3;

		String[] stock = new String[54];

		for (int i = 0; i < 54; i++) {
			if(i <= 9){
			stock[i] = Integer.toString(i+1) + "-Spade";
			} else if (i == 10){
				stock[i] = "Jack-Spade";
			} else if (i == 11){
				stock[i] = "Queen-Spade";
			} else if (i == 12){
				stock[i] = "King-Spade";
			} else if (i >=13 && i <= 22){
				stock[i] = Integer.toString(i+1) + "-Heart";
			} else if (i == 23){
				stock[i] = "Jack-Heart";
			} else if (i == 24){
				stock[i] = "Queen-Heart";
			} else if (i == 25){
				stock[i] = "King-Heart";
			} else if (i >= 26 && i <= 35){
				stock[i] = Integer.toString(i+1) + "-Club";
			} else if (i == 36){
				stock[i] = "Jack-Club";
			} else if (i == 37){
				stock[i] = "Queen-Club";
			} else if (i == 38){
				stock[i] = "King-Club";
			} else if (i >=39 && i <= 48){
				stock[i] = Integer.toString(i+1) + "-Diamond";
			} else if (i == 49){
				stock[i] = "Jack-Diamond";
			} else if (i == 50){
				stock[i] = "Queen-Diamond";
			} else if (i == 51){
				stock[i] = "King-Diamond";
			} else if (i >= 52){
				stock[i] = "Joker";
			}
		}
	}
	
	public void setPlayers(){
		System.out.println("How many players would you like to participate?");
		players = input.nextInt();
		dealerMax = players;
	}
	
	public void setDealer(){
		dealer = dealerMin + generator.nextInt(dealerMax - dealerMin + 1);
	}

}
