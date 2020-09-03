public class everything{
static int roundTotal = 0;
public static final int POINT = 40;
public static final int FORFEIT_POINTS = 20;
public static void main(String[] args){
Scanner kb = new Scanner(System.in);
Random rand = new Random();
description();
playGame(rand, kb);
}
public static String computerChoice(Random rand){
int comp = rand.nextInt(2);
String computer = "";
switch (comp){
case 0:
computer = "heads";
break;
case 1:
computer = "tails";
break;
}
return computer;
}
public static int pairOfDice (Random rand){
int dice1 = randomDice (rand);
int dice2 = randomDice(rand);
System.out.println("dice1: " + dice1);
System.out.println("dice2: " + dice2);
int finalDice = dice1 + dice2;
return finalDice;
}

public static int randomDice(Random rand){
int randDice = rand.nextInt(5);
int dice= 0;
switch (randDice){
case 0:
dice += 1;
break;
case 1:
dice += 2;
break;
case 2:
dice += 3;
break;
case 3:
dice = 4;
break;
case 4:
dice += 5;
break;
case 5:
dice += 6;
break;
}
return dice;
}

public static String randomName(Random rand){
int randName = rand.nextInt(10);
String compName= "";
switch (randName){
case 0:
compName = "Name1";
break;
case 1:
compName = "Name2";
break;
case 2:
compName = "Name3";
break;
case 3:
compName = "Name4";
break;
case 4:
compName = "Name5";
break;
case 5:
compName = "Name6";
break;
case 6:
compName = "Name7";
break;
case 7:
compName = "Name8";
break;
case 8:
compName = "Name9";
break;
case 9:
compName = "Name10";
break;
}
return compName;
}
public static void playGame(Random rand, Scanner kb){
String computer = computerChoice(rand);
String compName = randomName(rand);
int points = 0;
System.out.println("Hi my name is " + compName);
System.out.print("What is your name? ");
String playerName = kb.next();
System.out.println("Hi " + playerName +", I am flipping the coin to determine who goes first");
System.out.println("Press any key to start the game");

int dice = pairOfDice(rand);
System.out.println(dice);
}
public static void description(){
System.out.println("***********************************************************************************");
System.out.println("***********************************************************************************");
System.out.println("letsw start the fun");
System.out.println();
}
}