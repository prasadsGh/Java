import java.util.Scanner;
class inputString{
    public static void main(String[] args){
        String name;
        Scanner input= new Scanner(System.in); //creating a object of scanner class
        System.out.println("Enter your name: ");
        name=input.nextLine();   // taking a string input using the nextLine() method
        System.out.println("YOur name is " + name);
        input.close();


    }

}
//OUTPUT:
// Enter your name: 
// Prasad Patil
// YOur name is Prasad Patil