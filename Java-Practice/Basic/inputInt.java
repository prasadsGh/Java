import java.util.Scanner;
//importing the scanner class to take the input

public class inputInt {
    public static void main(String[] args)
    {
         Scanner input= new Scanner(System.in); //creating object of the class to scanner
    System.out.println("Enter the Integer: ");
    int data = input.nextInt(); //taking input of the int data type using the "nextInt()" method 
    int x;
    System.out.println("Enter another number: ");

    x=input.nextInt();
    System.out.println("THe integer is "+data);
    System.out.println("The another number is: "+x);
    input.close();


    }
   

    
}
