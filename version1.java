import java.util.*;
class guesser
{
    int guessNum; //instance variable

    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess number: ");
        guessNum = scan.nextInt();
        return guessNum;

    }
}

class player
{
    int guessNum;//instance variable

    int guessingNumber()
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Player! Kindly guess number: ");
        guessNum = obj.nextInt();
        return guessNum;
    }
}


class umpire
{
    int numFromGuesser;
    int numFromPlayer1;//instance variable
    int numFromPlayer2;//instance variable
    int numFromPlayer3;//instance variable

    void collectNumFromGuesser()
    {
        guesser g = new guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayers()
    {
        //create multiple object of class player
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();

       numFromPlayer1 = p1.guessingNumber();
       numFromPlayer2 = p2.guessingNumber();
       numFromPlayer3 = p3.guessingNumber();
    }

    void compare()
    {
        if(numFromGuesser == numFromPlayer1)//compare guess value with player1 value
        {
            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
            {
                 System.out.println("Sab jeet gaye");
                 
                 
            }

            else if(numFromGuesser == numFromPlayer2 )
            {
                System.out.println("Player 1 aur playr2 winner hai");
            }

            else if(numFromGuesser == numFromPlayer3)
            {
              System.out.println("Player 1 aur Player 3 winner hai");
            }

            else{
                   System.out.println("Player 1 won the game");
                 }
        }
        else if(numFromGuesser == numFromPlayer2)//compare guess value with player2 value
        {
            if(numFromGuesser == numFromPlayer3)
            {
                System.out.println("Player2 aur Player 3 winner hai");
            }
            else
            {
              System.out.println("Player 2 won the game");
            }
        }
        else if(numFromGuesser == numFromPlayer3)//compare guess value with player3 value
        {
           System.out.println("Player 3 won the game");
        }
        else
        {
            System.out.println("We lost the Game");
        }
    }
}


public class version1
{
     public static void main(String[] args) 
     {
        System.out.println("Game Started");
        umpire u = new umpire(); //create object

        Scanner s = new Scanner(System.in);

        System.out.println("How many times you want play a game: ");
        int times = s.nextInt();

        for(int i=1 ; i<=times ; i++)
        {
           u.collectNumFromGuesser();
           u.collectNumFromPlayers();
           u.compare();
           if(i==times)
           {
              System.out.println("Thanks for Playing game");
           }
        }
     }

}