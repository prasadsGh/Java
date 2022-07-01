import java.util.Scanner;

public class switch_Statement {
    public static void main(String[] args)
    {
        System.out.println("chose one of the following :" );
        System.out.println("+"+" "+"-"+ "*"+" "+"/");
        Scanner input= new Scanner(System.in);
        int a=10,b=10;
        String s=input.next();
        switch(s){
            case "+":
             System.out.println(a+b); 
             break;
             case "-":
             System.out.println(a-b); 
             break;
             case "*":
             System.out.println(a*b); 
             break;
             case "/":
             System.out.println(a/b); 
             break;
             default:
             System.out.println("Invalid choice");
             break;
        }




    }
    
}
