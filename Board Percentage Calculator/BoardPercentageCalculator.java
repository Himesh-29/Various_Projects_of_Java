import java.util.Scanner;

public class BoardPercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();

        System.out.print("Enter marks 1: ");
        short marks1=scanner.nextShort();

        System.out.print("Enter marks 2: ");
        short marks2=scanner.nextShort();

        System.out.print("Enter marks 3: ");
        short marks3=scanner.nextShort();

        System.out.print("Enter marks 4: ");
        short marks4=scanner.nextShort();

        System.out.print("Enter marks 5: ");
        short marks5=scanner.nextShort();

        float percentage=(marks1+marks2+marks3+marks4+marks5)/5.0f;

        System.out.print("Percentage of "+name+" is: "+percentage);

        scanner.close();
    }
}