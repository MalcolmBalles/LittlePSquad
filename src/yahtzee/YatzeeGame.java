package yahtzee;

public class YatzeeGame {
private String name1 = null;
private String name2 = null;
private String name3 = null;
private String name4 = null;
private int players;
private int die1;
private int die2;
private int die3;
private int die4;
private int die5;
private int game;
private int oKind3;
private int oKind4;
private int smallS;
private int bigS;
private int full;
private int yahtzee;
private int to3;
private int to4;
private int tsmall;
private int tbig;
private int tfull;
private int tyah;
private int one;
private int two;
private int three;
private int four;
private int five;
private int six;
private int s1;
private int s2;
private int s3;
private int s4;
private int s5;
private int s6;
private int stotal;
private int chance;


	public YatzeeGame() {
		players = 0;
		game = 1;
	}
	public void setPlayers(int nplayers) {
		players = nplayers;
	}
	public int getPlayers() {
		return players;
	}
	public void setPlayerNames(int count, String name) {
	//	count++;
		if(count == 1) {
			name1 = name;
		}
		if(count == 2) {
			name2 = name;
		}
		if(count == 3) {
			name3 = name;
		}
		if(count == 4) {
			name4 = name;
		}
	}
	public String getPlayer1Name() {
		return name1;
	}
	public String getPlayer4Name() {
		return name4;
	}
	public String getPlayer3Name() {
		return name3;
	}
	public String getPlayer2Name() {
		return name2;
	}
	public void rollDice1() {
		die1 = 1 + (int)(Math.random()*6);
	}
	public void rollDice2() {
		die2 = 1 + (int)(Math.random()*6);
	}
	public void rollDice3() {
		die3 = 1 + (int)(Math.random()*6);
	}
	public void rollDice4() {
		die4 = 1 + (int)(Math.random()*6);
	}
	public void rollDice5() {
		die5 = 1 + (int)(Math.random()*6);
	}
	public int getrollDice1() {
		return die1;
	}
	public int getrollDice2() {
		return die2;
	}
	public int getrollDice3() {
		return die3;
	}
	public int getrollDice4() {
		return die4;
	}
	public int getrollDice5() {
		return die5;
	}
	public int getGame() {
		return game;
	}
	public int firstDigitFinder(int num) {
		return (num / 10000);
	}
	public int secondDigitFinder(int num) {
		return ((num % 10000) / 1000);
	}
	public int thirdDigitFinder(int num) {
		return ((num % 1000) / 100);
	}
	public int fourthDigitFinder(int num) {
		return ((num % 100) / 10);
	}
	public int fifthDigitFinder(int num) {
		return (num % 10);
	}
	public void setGame(int set) {
		game = set;
	}
	public int test3okind() {
		if(die1 == die2) {
			if(die2 == die3 || die2 == die4 || die2 == die5) {
				oKind3 = 1;
			}	
		}
		if(die1 == die3) {
			if(die3 == die4 || die3 == die5) {
				oKind3 = 1;
			}
		}
		if(die1 == die4) {
			if(die4 == die5) {
				oKind3 = 1;
			}
		}
		if(die2 == die3) {
			if(die3 == die4 || die3 == die5) {
				oKind3 = 1;
			}
		}
		if(die2 == die4) {
			if(die4 == die5) {
				oKind3 = 1;
			}
		}
		if(die3 == die4 && die4 == die5) {
			oKind3 = 1;
		}
		return oKind3;
	}
	public void reset3okind() {
		oKind3 = 0;
	}
	public int test4okind() {
		if((die1 == die2 && die1 == die3 && die1 == die4) || (die1 == die2 && die1 == die3 && die1 == die5) || (die1 == die5 && die1 == die3 && die1 == die4) || (die1 == die2 && die1 == die5 && die1 == die4)  || (die2 == die5 && die5 == die3 && die5 == die4)) {
			oKind4 = 1;
		}
		return oKind4;
	}
	public void reset4okind() {
		oKind4 = 0;
	}
	public int testYahtzee() {
		if(die1 == die2 && die2 == die3 && die3 == die4 && die5 == die4) {
			yahtzee = 1;
		}
		return yahtzee;
	}
	public void resetYahtzee() {
		yahtzee = 0;
	}
	public int testSmallS() {
		if(1 == die1 || 1 == die2 || 1 == die3 || 1 == die4 || 1 == die5) {
			if(2 == die1 || 2 == die2 || 2 == die3 || 2 == die4 || 2 == die5) {
				if(3 == die1 || 3 == die2 || 3 == die3 || 3 == die4 || 3 == die5) {
					if(4 == die1 || 4 == die2 || 4 == die3 || 4 == die4 || 4 == die5) {
						smallS = 1;
					}
					
				}
				
			}
		}
		if(5 == die1 || 5 == die2 || 5 == die3 || 5 == die4 || 5 == die5) {
			if(2 == die1 || 2 == die2 || 2 == die3 || 2 == die4 || 2 == die5) {
				if(3 == die1 || 3 == die2 || 3 == die3 || 3 == die4 || 3 == die5) {
					if(4 == die1 || 4 == die2 || 4 == die3 || 4 == die4 || 4 == die5) {
						smallS = 1;
					}
					
				}
				
			}
		}
		if(5 == die1 || 5 == die2 || 5 == die3 || 5 == die4 || 5 == die5) {
			if(6 == die1 || 6 == die2 || 6 == die3 || 6 == die4 || 6 == die5) {
				if(3 == die1 || 3 == die2 || 3 == die3 || 3 == die4 || 3 == die5) {
					if(4 == die1 || 4 == die2 || 4 == die3 || 4 == die4 || 4 == die5) {
						smallS = 1;
					}
					
				}
				
			}
		}
		
		return smallS;
	}
	public void resetSmallS() {
		smallS = 0;
	}
	public int testBigS() {
		if(1 == die1 || 1 == die2 || 1 == die3 || 1 == die4 || 1 == die5) {
			if(2 == die1 || 2 == die2 || 2 == die3 || 2 == die4 || 2 == die5) {
				if(3 == die1 || 3 == die2 || 3 == die3 || 3 == die4 || 3 == die5) {
					if(4 == die1 || 4 == die2 || 4 == die3 || 4 == die4 || 4 == die5) {
						if(5 == die1 || 5 == die2 || 5 == die3 || 5 == die4 || 5 == die5) {
							bigS = 1;
						}
					}
					
				}
				
			}
		}
		if(6 == die1 || 6 == die2 || 6 == die3 || 6 == die4 || 6 == die5) {
			if(2 == die1 || 2 == die2 || 2 == die3 || 2 == die4 || 2 == die5) {
				if(3 == die1 || 3 == die2 || 3 == die3 || 3 == die4 || 3 == die5) {
					if(4 == die1 || 4 == die2 || 4 == die3 || 4 == die4 || 4 == die5) {
						if(5 == die1 || 5 == die2 || 5 == die3 || 5 == die4 || 5 == die5) {
							bigS = 1;
						}
					}
					
				}
				
			}
		}
		return bigS;
	}
	public void resetBigS() {
		bigS = 0;
	}
	public int testFull() {
		if(die1 == die2) {
			if((die2 == die3 && die4 == die5) || (die2 == die4 && die3 == die5) || (die2 == die5 && die3 == die4)) {

				full = 1;
			}	
		}
		if(die1 == die3) {
			if((die3 == die4 && die2 == die5) || (die3 == die5 && die2 == die4)) {
				full = 1;
			}
		}
		if(die1 == die4) {
			if(die4 == die5 && die2 == die3) {
				full = 1;
			}
		}
		if(die2 == die3) {
			if((die3 == die4 && die1 == die5) || (die3 == die5 && die4 == die1)) {
				full = 1;
			}
		}
		if(die2 == die4) {
			if(die4 == die5 && die1 == die3) {
				full = 1;
			}
		}
		if(die3 == die4 && die4 == die5 && die1 == die2) {
			full = 1;
		}
		return full;
	}
	public void resetFullHouse() {
		full = 0;
	}
	public int get2() {
		return two;
	}
	public int get1() {
		return one;
	}
	public int get3() {
		return three;
	}
	public int get4() {
		return four;
	}
	public int get5() {
		return five;
	}
	public int get6() {
		return six;
	}
	public void score1() {
		if(die1 == 1) {
			s1 = s1 + die1;
		}
		if(die2 == 1) {
			s1 = s1 + die2;
		}
		if(die3 == 1) {
			s1 = s1 + die3;
		}
		if(die4 == 1) {
			s1 = s1 + die4;
		}
		if(die5 == 1) {
			s1 = s1 + die5;
		}
		one = 1;
		stotal = stotal + s1;
	}
	public void score2() {
		if(die1 == 2) {
			s2 = s2 + die1;
		}
		if(die2 == 2) {
			s2 = s2 + die2;
		}
		if(die3 == 2) {
			s2 = s2 + die3;
		}
		if(die4 == 2) {
			s2 = s2 + die4;
		}
		if(die5 == 2) {
			s2 = s2 + die5;
		}
		two = 1;
		stotal = stotal + s2;
		
	}
	public void score3() {
		if(die1 == 3) {
			s3 = s3 + die1;
		}
		if(die2 == 3) {
			s3 = s3 + die2;
		}
		if(die3 == 3) {
			s3 = s3 + die3;
		}
		if(die4 == 3) {
			s3 = s3 + die4;
		}
		if(die5 == 3) {
			s3 = s3 + die5;
		}
		three = 1;
		stotal = stotal + s3;
	}
	public void score4() {
		if(die1 == 4) {
			s4 = s4 + die1;
		}
		if(die2 == 4) {
			s4 = s4 + die2;
		}
		if(die3 == 4) {
			s4 = s4 + die3;
		}
		if(die4 == 4) {
			s4 = s4 + die4;
		}
		if(die5 == 4) {
			s4 = s4 + die5;
		}
		four = 1;
		stotal = stotal + s4;
	}
	public void score5() {
		if(die1 == 5) {
			s5 = s5 + die1;
		}
		if(die2 == 5) {
			s5 = s5 + die2;
		}
		if(die3 == 5) {
			s5 = s5 + die3;
		}
		if(die4 == 5) {
			s5 = s5 + die4;
		}
		if(die5 == 5) {
			s5 = s5 + die5;
		}
		five = 1;
		stotal = stotal + s5;
	}
	public void score6() {
		if(die1 == 6) {
			s6 = s6 + die1;
		}
		if(die2 == 6) {
			s6 = s6 + die2;
		}
		if(die3 == 6) {
			s6 = s6 + die3;
		}
		if(die4 == 6) {
			s6 = s6 + die4;
		}
		if(die5 == 6) {
			s6 = s6 + die5;
		}
		six = 1;
		stotal = stotal + s6;
	}
	public void score3okind() {
		to3 = 1;
		stotal = stotal + die1 + die2 + die3 + die4 + die5;
	}
	public void score4okind() {
		to4 = 1;
		stotal = stotal + die1 + die2 + die3 + die4 + die5;
	}
	public void scoreChance() {
		chance = 1;
		stotal = stotal + die1 + die2 + die3 + die4 + die5;
	}
	public void scoreSmallS() {
		tsmall = 1;
		stotal = stotal + 30;
	}
	public void scoreBigS() {
		tbig = 1;
		stotal = stotal + 40;
	}
	public void scoreFull() {
		tfull = 1;
		stotal = stotal + 25;
	}
	public void scoreYah() {
		tyah = 1;
		stotal = stotal + 50;
	}
	public int get3oKind() {
		return to3;
	}
	public int get4oKind() {
		return to4;
	}
	public int getSmall() {
		return tsmall;
	}
	public int getBig() {
		return tbig;
	}
	public int getChance() {
		return chance;
	}
	public int getFull() {
		return tfull;
	}
	public int getYah() {
		return tyah;
	}
	public int getTotal() {
		return stotal;
	}
	
}
