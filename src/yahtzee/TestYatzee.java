package yahtzee;
import java.util.Scanner;
public class TestYatzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int countr = 0;
		int num = 0;
		int fix = 0;
		
		System.out.println("Welcome to Yahtzee, a truly exciting game");
	//	System.out.println("How many players are playing? (1-4)");
		Scanner input = new Scanner(System.in);
		YatzeeGame game = new YatzeeGame();
	//	game.setPlayers(input.nextInt());
	//	System.out.println("You have " + game.getPlayers() + " players");
	//	for(count = 1; count <= game.getPlayers(); count++) {
		//	System.out.println("What is the name of player?");
	//		count = 1;
		//	game.setPlayerNames(count, input.next());
	//	}
		count = 1;
		//if(1 == 1) {
			while(game.getGame() == 1) {
				
					if(count == 1) {
				//		System.out.println(game.getPlayer1Name() + " is up!");
						game.rollDice1();
						game.rollDice2();
						game.rollDice3();
						game.rollDice4();
						game.rollDice5();

						System.out.println("Die 1: " + game.getrollDice1());
						System.out.println("Die 2: " + game.getrollDice2());
						System.out.println("Die 3: " + game.getrollDice3());
						System.out.println("Die 4: " + game.getrollDice4());
						System.out.println("Die 5: " + game.getrollDice5());
						System.out.println("Which ones would you like to re-roll? (enter as 1 number please)");
						num = input.nextInt();
						if(game.firstDigitFinder(num) == 1 || game.secondDigitFinder(num) == 1 || game.thirdDigitFinder(num) == 1 || game.fourthDigitFinder(num) == 1 || game.fifthDigitFinder(num) == 1) {
							game.rollDice1();
						}
						if(game.firstDigitFinder(num) == 2 || game.secondDigitFinder(num) == 2 || game.thirdDigitFinder(num) == 2 || game.fourthDigitFinder(num) == 2 || game.fifthDigitFinder(num) == 2) {
							game.rollDice2();
						}
						if(game.firstDigitFinder(num) == 3 || game.secondDigitFinder(num) == 3 || game.thirdDigitFinder(num) == 3 || game.fourthDigitFinder(num) == 3 || game.fifthDigitFinder(num) == 3) {
							game.rollDice3();
						}
						if(game.firstDigitFinder(num) == 4 || game.secondDigitFinder(num) == 4 || game.thirdDigitFinder(num) == 4 || game.fourthDigitFinder(num) == 4 || game.fifthDigitFinder(num) == 4) {
							game.rollDice4();
						}
						if(game.firstDigitFinder(num) == 5 || game.secondDigitFinder(num) == 5 || game.thirdDigitFinder(num) == 5 || game.fourthDigitFinder(num) == 5 || game.fifthDigitFinder(num) == 5) {
							game.rollDice5();
						}
						System.out.println("Die 1: " + game.getrollDice1());
						System.out.println("Die 2: " + game.getrollDice2());
						System.out.println("Die 3: " + game.getrollDice3());
						System.out.println("Die 4: " + game.getrollDice4());
						System.out.println("Die 5: " + game.getrollDice5());
						System.out.println("Last chance to re-roll, Which ones would you like to re-roll? (enter as 1 number please)");
						num = input.nextInt();
						if(game.firstDigitFinder(num) == 1 || game.secondDigitFinder(num) == 1 || game.thirdDigitFinder(num) == 1 || game.fourthDigitFinder(num) == 1 || game.fifthDigitFinder(num) == 1) {
							game.rollDice1();
						}
						if(game.firstDigitFinder(num) == 2 || game.secondDigitFinder(num) == 2 || game.thirdDigitFinder(num) == 2 || game.fourthDigitFinder(num) == 2 || game.fifthDigitFinder(num) == 2) {
							game.rollDice2();
						}
						if(game.firstDigitFinder(num) == 3 || game.secondDigitFinder(num) == 3 || game.thirdDigitFinder(num) == 3 || game.fourthDigitFinder(num) == 3 || game.fifthDigitFinder(num) == 3) {
							game.rollDice3();
						}
						if(game.firstDigitFinder(num) == 4 || game.secondDigitFinder(num) == 4 || game.thirdDigitFinder(num) == 4 || game.fourthDigitFinder(num) == 4 || game.fifthDigitFinder(num) == 4) {
							game.rollDice4();
						}
						if(game.firstDigitFinder(num) == 5 || game.secondDigitFinder(num) == 5 || game.thirdDigitFinder(num) == 5 || game.fourthDigitFinder(num) == 5 || game.fifthDigitFinder(num) == 5) {
							game.rollDice5();
						}
						while(fix == 0) {
							System.out.println("These are you final dice");
							System.out.println("Die 1: " + game.getrollDice1());
							System.out.println("Die 2: " + game.getrollDice2());
							System.out.println("Die 3: " + game.getrollDice3());
							System.out.println("Die 4: " + game.getrollDice4());
							System.out.println("Die 5: " + game.getrollDice5());
							System.out.println("Under what catagory would you like to to score? (type the number corresponding to what you would like to score as)");
							if(game.get1() == 0) {
								System.out.println("1: Ones");
							}
							if(game.get2() == 0) {
								System.out.println("2: Twos");
							}
							if(game.get3() == 0) {
								System.out.println("3: Threes");
							}
							if(game.get4() == 0) {
								System.out.println("4: Fours");
							}
							if(game.get5() == 0) {
								System.out.println("5: Fives");
							}
							if(game.get6() == 0) {
								System.out.println("6: Sixes");
							}
							if(game.get3oKind() == 0){
								if(game.test3okind() == 1) {
									System.out.println("7: 3 of a Kind");
								}
							}
							if(game.get4oKind() == 0) {
								if(game.test4okind() == 1) {
									System.out.println("8: 4 of a Kind");
								}
							}
							if(game.getSmall() == 0) {
								if(game.testSmallS() == 1) {
									System.out.println("9: Small Striaght");
								}
							}
							if(game.getBig() == 0) {
								if(game.testBigS() == 1) {
									System.out.println("10: Big Striaght");
								}
							}
							if(game.getFull() == 0) {
								if(game.testFull() == 1) {
									System.out.println("11: Full House");
								}
							}
							if(game.getYah() == 0) {
								if(game.testYahtzee() == 1) {
									System.out.println("12: YAHTZEE!!!");
								}
							}
							if(game.getChance() == 0) {
								System.out.println("13: Chance");
							}
							switch(input.nextInt()) {
							case 1:
								if(game.get1() == 0) {
								game.score1();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 2:
								if(game.get2() == 0) {
								game.score2();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 3:
								if(game.get3() == 0) {
								game.score3();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 4:
								if(game.get4() == 0) {
								game.score4();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 5:
								if(game.get5() == 0) {
								game.score5();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 6:
								if(game.get6() == 0) {
								game.score6();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 7:
								if(game.get3oKind() == 0){
								game.score3okind();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 8:
								if(game.get4oKind() == 0) {
								game.score4okind();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 9:
								if(game.getSmall() == 0) {
								game.scoreSmallS();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 10:
								if(game.getBig() == 0) {
								game.scoreBigS();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 11:
								if(game.getFull() == 0) {
								game.scoreFull();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 12:
								if(game.getYah() == 0) {
								game.scoreYah();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							case 13:
								if(game.getChance() == 0) {
								game.scoreChance();
								fix = 1;
								}
								else {
									System.out.println("Try again, pick one of your choices");
								}
								break;
							default:
								System.out.println("Bad input, try again (remember a number 1-12");
								break;
							}
						
						}
						fix = 0;
						game.reset3okind();
						game.reset4okind();
						game.resetBigS();
						game.resetSmallS();
						game.resetFullHouse();
						game.resetYahtzee();
						System.out.println(game.getPlayer1Name() + " has a total of " + game.getTotal() + " points!");
					}
			}
			
			
		//}
		System.out.println("Thanks for playing!");

	}

}

