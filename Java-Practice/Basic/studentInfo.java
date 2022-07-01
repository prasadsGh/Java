import java.util.Scanner;
public class studentInfo {
    public static void main(String[] args)
    {
        String name;
        int roll_number;
        String class_name;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        name=input.nextLine();
        System.out.println("ENter the roll number: ");
        roll_number=input.nextInt();
        System.out.println("Enter the class: ");
        class_name=input.next();
        // use next instead instead of nextLine -->refer the article for explaination-->https://www.geeksforgeeks.org/difference-between-next-and-nextline-methods-in-java/

        System.out.println("NAME:"+name+"\n"+"ROLL NUMBER: "+roll_number+"\n"+"Class: "+class_name +"\n");

    }
    
}


// OUTPUT
// Enter the name of student: 
// prasad patik
// ENter the roll number: 
// 12163
// Enter the class: 
// SE2
// NAME:prasad patik
// ROLL NUMBER: 12163
// Class: SE2