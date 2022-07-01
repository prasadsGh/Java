class Literals{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        boolean result1=true;
        boolean result2=false;

        
        System.out.println(a+b);
        System.out.println("The sum of two numbers: "+ (a+b));
        System.out.println("The sum of two numbers: "+ a +b);
        if(result1) System.out.println("RESULT 1");
        if(result2) System.out.println("RESULT 2");
        
    }
}
//variable name should not start with numbers and can not be a keyword
/*
    1 byte is 8 bits  
    int -->size --> 4 bytes-->32 bits means it can store from -pow(2,32)  to pow(2,32)-1
    float-- > size-->4 bytes
    double -->size -->8 bytes
    char -->size--> 2 bytes in java 
    boolean -->1 bit 


 */