/*
 //import java.util.function.;

import java.util.Scanner;

class P1Random
 {
     private long next;

     public P1Random()
     {
         next = 0;
     }

     private short nextShort()
     {
         return nextShort(Short.MAX_VALUE);
     }

     private short nextShort(short limit)
     {
         next = next * 1103515245 + 12345;
         return (short) Math.abs(((next / 65536) % limit));
     }

     private int nextInt()
     {
         return nextInt(Integer.MAX_VALUE);
     }

     public int nextInt(int limit)
     {
         return ((((int) nextShort()) << 16) | ((int) nextShort())) % limit;
     }

     private double nextDouble()
     {
         return (double) nextInt() / (double) Integer.MAX_VALUE;
     }
 }

class Blackjack {
    public static void printMeun(){
        System.out.println("1. Get another card\n" +
                "2. Hold hand\n" +
                "3. Print statistics\n" +
                "4. Exit");
    }
    public static void startGame(int round){
        System.out.println("START GAME #"+round);
        System.out.println();
    }
    public static void yourCard(int draw){
        System.out.println("Your card is a "+draw+"!");
    }
    public static void yourCard(String draw){
        System.out.println("Your card is a "+draw+"!");
    }
    public static void Hand(int count){
        System.out.println("Your hand is: "+count);
        System.out.println();
    }
    public static int getInt(){
        System.out.println("Choose an option: ");
        Scanner s = new Scanner(System.in);
        int result =s.nextInt();
//        s.close();
        return result;
    }





    public static void main(String[] args) {
        boolean keep=true;
        P1Random rng = new P1Random();
        boolean gameEnd = false;
        int r =1;
        int playerWin = 0;
        int dealerWin =0;
        int tieGames = 0;
        double p=0;

        while(keep){

            gameEnd = false;
            int hand =0;
            startGame(r);
            loop1:
                while (!gameEnd){
//                P1Random rng = new P1Random();
                    if(hand == 0){
                        int rand1=rng.nextInt(13);
                        int currentDraw1 = rand1+1;
                        hand = hand+ currentDraw1;
                        yourCard(hand);
                        Hand(hand);
                    }
                    if(hand>0){
                    printMeun();
                    int input =getInt();
                    switch (input){
                        case 4:
                            keep=false;
                            break loop1;
                        case 3:
                            System.out.println("Number of Player wins: "+playerWin);
                            System.out.println("Number of Dealer wins: "+ dealerWin);
                            System.out.println("Number of tie games: "+tieGames);
                            System.out.println("Total # of games played is: "+(playerWin+dealerWin+tieGames));
                            double percent = (playerWin*100)/(playerWin+dealerWin+tieGames);
                            System.out.println("Percentage of Player wins: "+percent+"%");
                            break loop1;

                        case 2:


                            int dealrandom=rng.nextInt(11);
                            int dealersHand = dealrandom+16;
                            if(dealersHand>21){
                                System.out.println("You win!");
                                gameEnd=true;
                                r++;
                                playerWin++;
                            } else if (dealersHand>hand){
                                System.out.println("Dealer wins!");
                                gameEnd =true;
                                r++;
                                dealerWin++;
                            } else if (dealersHand==hand) {
                                System.out.println("It's a tie! No one wins!");
                                r++;
                                gameEnd=true;
                                tieGames++;
                            } else{
                                    System.out.println("You win!");
                                    gameEnd=true;
                                    r++;
                                    playerWin++;
                                }
                            break ;
                        case 1:
                            break;
                            }


                    }
                    int rand=rng.nextInt(13);

                    int currentDraw = rand+1;
//                    System.out.println("currentDraw = " + currentDraw);
                    switch (currentDraw){
                        case 1:
                            yourCard("ACE!");
                            Hand(hand);
                            hand += 1;
                            break;
                        case 11:
                            yourCard("JACK!");
                            hand += 10;
                            Hand(hand);
                            break;
                        case 12:
                            yourCard("QUEEN!");
                            hand+=10;
                            Hand(hand);
                            break;
                        case 13:
                            yourCard("KING!");
                            hand+=10;
                            Hand(hand);
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:

                            yourCard(currentDraw);
                            hand+=currentDraw;
                            Hand(hand);
                        default:
                            System.out.println("Invalid input!\n" +
                                    "Please enter an integer value between 1 and 4.");
                            break loop1;
                    }
                    if(hand==21){
                        System.out.println("BLACKJACK! You win!");
                        gameEnd=true;
                        r++;
                        playerWin++;

                    }else if(hand>21){
                        System.out.println("You exceeded 21! You lose.");
                        gameEnd =true;
                        r++;
                        dealerWin++;
                    }
                }


            }
        }
    }


*/

import java.util.Scanner;
class P1Random
{
    private long next;

    public P1Random()
    {
        next = 0;
    }

    private short nextShort()
    {
        return nextShort(Short.MAX_VALUE);
    }

    private short nextShort(short limit)
    {
        next = next * 1103515245 + 12345;
        return (short) Math.abs(((next / 65536) % limit));
    }

    private int nextInt()
    {
        return nextInt(Integer.MAX_VALUE);
    }

    public int nextInt(int limit)
    {
        return ((((int) nextShort()) << 16) | ((int) nextShort())) % limit;
    }

    private double nextDouble()
    {
        return (double) nextInt() / (double) Integer.MAX_VALUE;
    }
}

public class Blackjack {
    public static void main(String[] args) {
        boolean keep = false;
        int gameNumber = 1;
        int playerWins = 0;
        int dealerWins = 0;
        int tieGames = 0;
        Scanner myScanner = new Scanner(System.in);
        P1Random range = new P1Random();

        while(!keep) { //Every time this loops, a new game is started. The beginning of every game performs the same actions.
            boolean sameGame = false;
            int cardDelt;
            int hand = 0;
            int dealersHandNum;

            System.out.println("START GAME #" + gameNumber);
            System.out.println();

            cardDelt = range.nextInt(13) + 1;
            if(cardDelt == 1) {
                System.out.println("Your card is a ACE!");
                hand += 1;
            } else if(cardDelt == 11) {
                System.out.println("Your card is a JACK!");
                hand += 10;
            } else if(cardDelt == 12) {
                System.out.println("Your card is a QUEEN!");
                hand += 10;
            } else if(cardDelt == 13) {
                System.out.println("Your card is a KING!");
                hand += 10;
            } else {
                System.out.println("Your card is a " + cardDelt + "!");
                hand += cardDelt;
            }
            System.out.println("Your hand is: " + hand);
            System.out.println();

            while(!sameGame) {
                System.out.println("1.  Get another card");
                System.out.println("2.  Hold hand");
                System.out.println("3.  Print statistics");
                System.out.println("4.  Exit");
                System.out.println();
                System.out.print("Choose an option: ");

                int menuOption = myScanner.nextInt();

                System.out.println();

                switch(menuOption) {
                    case 1:
                        cardDelt = range.nextInt(13) + 1;

                        if(cardDelt == 1) {
                            System.out.println("Your card is a ACE!");
                            hand += 1;
                        } else if(cardDelt == 11) {
                            System.out.println("Your card is a JACK!");
                            hand += 10;
                        } else if(cardDelt == 12) {
                            System.out.println("Your card is a QUEEN!");
                            hand += 10;
                        } else if(cardDelt == 13) {
                            System.out.println("Your card is a KING!");
                            hand += 10;
                        } else {
                            System.out.println("Your card is a " + cardDelt + "!");
                            hand += cardDelt;
                        }

                        System.out.println("Your hand is: " + hand);
                        System.out.println();

                        if(hand == 21) {
                            System.out.println("BLACKJACK! You win!");
                            System.out.println();
                            playerWins++;
                            sameGame = true;
                        } else if(hand > 21) {
                            System.out.println("You exceeded 21! You lose.");
                            System.out.println();
                            dealerWins++;
                            sameGame = true;
                        }

                        break;
                    case 2:
                        dealersHandNum = range.nextInt(11) + 16;

                        System.out.println("Dealer's hand: " + dealersHandNum);
                        System.out.println("Your hand is: " + hand);
                        System.out.println();

                        if(dealersHandNum > 21) {
                            System.out.println("You win!");
                            playerWins++;
                        } else if(dealersHandNum == hand) {
                            System.out.println("It's a tie! No one wins!");
                            tieGames++;
                        } else if(dealersHandNum > hand) {
                            System.out.println("Dealer wins!");
                            dealerWins++;
                        } else {
                            System.out.println("You win!");
                            playerWins++;
                        }

                        System.out.println();

                        sameGame = true;

                        break;
                    case 3:
                        double playerWinPercent = ( (double)playerWins / (gameNumber - 1) ) * 100;

                        System.out.println("Number of Player wins: " + playerWins);
                        System.out.println("Number of Dealer wins: " + dealerWins);
                        System.out.println("Number of tie games: " + tieGames);
                        System.out.println("Total # of games played is: " + (gameNumber - 1));
                        System.out.println("Percentage of Player wins: " + playerWinPercent + "%");
                        System.out.println();

                        break;
                    case 4:
                        sameGame = true;
                        keep = true;
                        break;
                    default:
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer value between 1 and 4.");
                        System.out.println();
                }

            }
            if(keep)
                break;

            gameNumber++;
        }
    }
}
