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
// output:
// Enter the number and we will print the table uptp 10: 
// 2
// and the table is: 
// 2 
// 4 
// 6 
// 8 
// 10 
// 12 
// 14 
// 16 
// 18 
// 20
//same goes for the while and do while loop 
//and also on thing continue and break have the same function in java as it has in the cpp
