import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args){
       
        //Creating a game in which computer makes random choices between 1,2,3
        //And user gives input between 1,2,3
        //1-rock, 2-paper, 3-scis3sors
        //Rock bluntes scissors, paper removes rock and scissors cut paper
       
        byte times=0;
        byte computer_win=0;
        byte you_win=0;
        byte tie=0;
        int choice_int=0;
        byte iter=1;

        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();

        System.out.print("\nEnter the number of times you want to play RSP game: ");
        times=sc.nextByte();
        System.out.println();
        
        while(times>0)
        {
                System.out.print("Loop "+(iter)+": Enter your choice- '1 for Rock','2 for Paper','3 for Scissors': ");
                choice_int=sc.nextByte();
                
                int RandomNumber=rnd.nextInt(3)+1;
                times-=1;
                iter+=1;

                if(RandomNumber==choice_int){
                    tie+=1;
                    continue;
                }
                else
                {
                    if(RandomNumber==1 && choice_int==2) you_win+=1;
                    else if(RandomNumber==2 && choice_int==3) you_win+=1;
                    else if(RandomNumber==3 && choice_int==1) you_win+=1;

                    else if(RandomNumber==1 && choice_int==3) computer_win+=1;
                    else if(RandomNumber==2 && choice_int==1) computer_win+=1;
                    else if(RandomNumber==3 && choice_int==2) computer_win+=1;
                }
        }
        System.out.println("\nThe number of time you won: "+you_win+", and the number of time computer won: "+computer_win+", and tie happened: "+tie+"\n");
        sc.close();
    }
}