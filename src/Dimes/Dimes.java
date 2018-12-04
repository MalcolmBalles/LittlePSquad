package Dimes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dimes {

	Scanner input = new Scanner(System.in);
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
	}
	public void setPlayers() {
		System.out.println("How many players would you like to participate?");
		players = input.nextInt();
		dealerMax = players;
	}
	public void setDealer() {
		dealer = dealerMin + generator.nextInt(dealerMax - dealerMin + 1);
	}

}
