import java.util.*;
public class Assignment {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Find avg question assignment

        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        System.out.println("Your avg");
        int avg = (a+b+c)/ 3;
        System.out.println(avg);
        
        //next question area of square
        System.out.print("Enter side of square : ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.print("Area of Square : ");
        System.out.println(area);
        
        //next question enter the cost of three items
        System.out.print("Enter pen price : ");
        float a = sc.nextFloat();
        System.out.print("Enter pencil price : ");
        float b = sc.nextFloat();
        System.out.print("Enter eraser price : ");
        float c = sc.nextFloat();
        System.out.print("Your total cost : ");
        float avg = a + b + c;
        System.out.println(avg);
         
        //next question type casting or type conversion question
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f*b) + (i%c) - (d*s);
        System.out.println(result);
         
        //next question for operators

        int $ = 24;
        System.out.println($);

    }
    
}