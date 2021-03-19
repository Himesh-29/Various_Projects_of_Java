package ClassFiles;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int random_number;
    private int user_input;
    private int no_of_guesses=3;
    private int times;
    private int [] answers=new int[10];
    private int level=1;
    
    //Constructor
    public Game(){
        Random randn=new Random();
        random_number = randn.nextInt(10)+1;
    }

    //Methods
    
    //Getters
    public void takeUserInput(int x){
        user_input=x;
    }
    public int getGuesses(){
        return no_of_guesses;
    }
    public int getTimes(){
        return times;
    }
    public int getLevel(){
        return level;
    }
    public int [] getAnswers(){
        return answers;
    }

    //Setters
    public void setGuesses(int x){
        no_of_guesses=x;
    }
    public void setGuesses(){
        no_of_guesses=3;
    }
    public void setTimes(int x){
        times=x;
    }
    public void setLevels(int x) {
        level = x;
    }
    public void setAnswers(int x){
        answers[level-1]=x;
    }

    public int isCorrectNumber(){
        if (user_input<random_number) return 1;
        else if(user_input>random_number) return 2;
        else return 0;
    }
    
}

public class GuessTheNumber {
    public static void main(String[] args){
        /*
        Create a class Game, which allows a user to play "Guess the Number" game once.
        
        Game should have the following methods:
        -Constructor to generate the random number
        -takeUserInput() to take a user input of number 
        -isCorrectNumber() to detect whether the number entered by the user is true 
        -getter and setter for noOfGuesses

        */
        Scanner sc=new Scanner(System.in);
        Game G=new Game();

        int win_rate=0;

        System.out.print("Enter the number of times you want to play this game(Not more than 10): ");
        G.setTimes(sc.nextInt());

        while(G.getTimes()!=0){
            int flag=0;
            Game g = new Game();
            System.out.println("\n"+G.getLevel()+" Level!");
            g.setGuesses();
            while(g.getGuesses()!=0){
                System.out.print("\nThe Game ends when user enters correct number as predicted by computer\nPredict a number between 1 and 10: ");
                g.takeUserInput(sc.nextInt());
                if(g.isCorrectNumber()==0){
                    flag=1;
                    G.setAnswers(1);
                    break;
                }
                else if(g.isCorrectNumber()==1){
                    System.out.println("You entered lesser number! Guess higher!");
                }
                else if(g.isCorrectNumber()==2){
                    System.out.println("You entered greater number! Guess lower!");
                }
                if(g.getGuesses()-1==0) break;
                System.out.println(g.getGuesses()-1+" guesses left!");
                g.setGuesses(g.getGuesses() - 1);
            }
            if(flag==1) System.out.println("\nYou predicted correct answer!!");
            else{
                System.out.println("\nYou weren't able predict correct answer!!");
                G.setAnswers(0);
            }
            
            G.setTimes(G.getTimes()-1);
            G.setLevels(G.getLevel()+1);
        }

        for(int element:G.getAnswers()){
            if(element==1) win_rate+=1;
        }
        System.out.printf("You predicted %1.2f%scorrect answers!", 100.0f*((float)win_rate/(G.getLevel()-1)),"% ");
        sc.close();
    }
}