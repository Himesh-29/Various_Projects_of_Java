package ClassFiles;

import java.util.Scanner;

class InvalidOperatorException extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString(){
        return "You have entered an invalid operator!";
    }
}

class ZeroDivisionError extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString(){
        return "You cannot divide by zero";
    }
}

class MaxInputException extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString(){
        return "You have entered very large number. Reduce it!";
    }
}

class MaxMultiplierException extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "You have entered very large number for multiplication. Reduce it!";
    }
}

class Calculator{
    private long num1,num2;
    
    //Getter
    public long returnFirstNumber(){
        return num1;
    }
    public long returnSecondNumber(){
        return num2;
    }

    public long returnSum(long a,long b){
        num1=a;
        num2=b;
        return a+b;
    }
    
    public long returnDifference(long a, long b) {
        num1 = a;
        num2 = b;
        return a - b;
    }

    public long returnMultiplier(long a, long b) {
        num1 = a;
        num2 = b;
        return a * b;
    }

    public long returnDividend(long a, long b) {
        num1 = a;
        num2 = b;
        return a/b;
    }
}

public class CustomCalculator {
    public static void cannotDivideByZero(long num2) throws ZeroDivisionError{
        if(num2==0) throw new ZeroDivisionError();
    }
    public static void MaxInputException(long x) throws MaxInputException{
        if(x>100000) throw new MaxInputException();
    }
    public static void MaxMultiplierException(long x) throws MaxMultiplierException{
        if(x>7000) throw new MaxMultiplierException();
    }
    public static void main(String[] args) {
        /*
         * Create a custom calculator with following operations:
         * 1. + -> Addition 2. - -> Subtraction 3. * -> Multiplication 4. / -> Division
         * which throws the following exceptions: 
         * 1. Invalid input Exception ex: 8 & 9
         * 2. Cannot divide by 0 Exception 
         * 3. Max Input Exception if any of the inputs is greater than 100000 
         * 4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
        Scanner sc=new Scanner(System.in);
        int choice=1;
        
        do{
            Calculator calc=new Calculator();
            String operator="";
            long num1=0,num2=0,result=0;
            
            System.out.println("\n\n-------------------------------------------------------");
            System.out.println("Welcome to world of Calculations!!\nHere you can add numbers, subtract them, multiply them and find dividend");
            System.out.println("-------------------------------------------------------");
            
            System.out.println("Enter your operator (from +,-,*,/): ");
            operator=sc.next();
            
            try{
                if(operator.equals("+")){
                        try{
                            System.out.println("Enter first number: ");
                            num1=sc.nextLong();
                            MaxInputException(num1);
                            System.out.println("Enter second number: ");
                            num2=sc.nextLong();
                            MaxInputException(num2);
                            result=calc.returnSum(num1,num2);
                            System.out.println(num1+operator+num2+"="+result);
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                    }
                    else if(operator.equals("-")){
                        try {
                        System.out.println("Enter first number: ");
                        num1 = sc.nextLong();
                        MaxInputException(num1);
                        System.out.println("Enter second number: ");
                        num2 = sc.nextLong();
                        MaxInputException(num2);
                        result = calc.returnDifference(num1, num2);
                        System.out.println(num1+operator+num2+"="+result);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                else if(operator.equals("*")){
                    try {
                        System.out.println("Enter first number: ");
                        num1 = sc.nextLong();
                        MaxMultiplierException(num1);
                        System.out.println("Enter second number: ");
                        num2 = sc.nextLong();
                        MaxMultiplierException(num2);
                        result = calc.returnMultiplier(num1, num2);                        
                        System.out.println(num1+operator+num2+"="+result);
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                }
                else if(operator.equals("/")){
                    try {
                        System.out.println("Enter first number: ");
                        num1 = sc.nextLong();
                        MaxInputException(num1);
                        System.out.println("Enter second number: ");
                        num2 = sc.nextLong();
                        MaxInputException(num2);
                        cannotDivideByZero(num2);
                        result = calc.returnDividend(num1, num2);                        
                        System.out.println(num1+operator+num2+"="+result);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                else throw new InvalidOperatorException();
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("\nDo you want to continue? Enter 1 for yes and any other for no");
            choice=sc.nextInt(); 
        }while(choice==1);
        
        sc.close();
        
    }
}
