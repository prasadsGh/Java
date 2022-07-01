import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class for_loop {
    public static void main(String[] args)
    {
        System.out.println("Enter the number and we will print the table uptp 10: ");
        Scanner sc= new Scanner(System.in);
        int data= sc.nextInt();
        System.out.println("and the table is: ");
        for(int i=1;i<11;i++)
        {
            System.out.println((data*i)+ " ");
        }
    }


    
}
