import java.util.Scanner;

public class even_odd {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("ENter the number: ");
        int n=input.nextInt();
        if(n%2==0) System.out.println("The number is even: ");
        else System.out.println("THe number is odd\n");

    }
    
}
