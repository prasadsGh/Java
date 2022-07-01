import java.util.Scanner;
public class inputDouble {
    public static void main(String[] args)
    {
        //creating input named object of the Scanner class
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the double type literal: ");
        double data= input.nextDouble(); //taking the double input using the nextDouble() function
        System.out.println("Your number is: "+data);



    }
    
}
