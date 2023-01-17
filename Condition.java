import java.util.*;

public class Condition { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //age question foe solving is Adult or not.
        
        int age= sc.nextInt(); 
        if(age>=18){
            System.out.println("Adult");
        }
        if(age>=13 && age<=18){
            System.out.println("Teen Ager");
        }
        else{
            System.out.println("Not adult");
        }

        greater between 2 numbers
        int A= sc.nextInt();
        int B= sc.nextInt();
        if(A>=B) {
            System.out.println("A is greater");
        }
        else{
            System.out.println("B  is greater");
        } 

        // even or odd
        int A= sc.nextInt();
        if(A%2==0) {
            System.out.println("Number  is even ");
        }
        else{
            System.out.println("Number  is odd ");
        }

        //else if conditions for saving the time
        int age= sc.nextInt(); 
        if(age>=18){
            System.out.println("Adult");
        }
        else if(age>=13 && age<=18){
            System.out.println("Teen Ager");
        }
        else{
            System.out.println("Not adult");
        }

        // Income Tax Calculator
        int Tax;
        int Income= sc.nextInt(); 
        if(Income<500000){
            Tax = 0;
            System.out.println(" No Tax");
        }
        else if(Income>=500000 && Income<1000000) {
            Tax = (int)(Income * 0.2);
            System.out.println("Your Tax is :"+Tax);
        }
        else {
            Tax = (int)(Income * 0.3);
            System.out.println("Your Tax is:"+Tax);
        }

        
        // print the largest of three numbers
        System.out.print("Enter A : ");
        int A= sc.nextInt(); 
        System.out.print("Enter B : ");
        int B= sc.nextInt(); 
        System.out.print("Enter C : ");
        int C= sc.nextInt(); 
        if((A>=B)&&(A>=C)){
            System.out.println("A is Greater");
        }
        if(B>=C){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("C is Greater");
        }
        
        // Ternory opretor singel line if else
        // even or odd by using ternory opretor;
        System.out.print("Enter a  Number: ");
        int A= sc.nextInt();
        String B = ((A%2)==0)? "even" : "odd";
        System.out.print(B);
       
        // Pass or fail quetion usingternory opretor
        System.out.print("Enter Your  Marks: ");
        int Marks= sc.nextInt();
        String B = (Marks>=33)? "Pass" :"Fail";
        System.out.print(B);
         
         //switch statement question
        System.out.print("Enter Your  Choice: ");
        int Marks= sc.nextInt(); 
        switch ( Marks) {
            case 1: System.out.print("Anup");
                break;
            case 2: System.out.print("Parth");
                break;
            case 3: System.out.print("Sia");
                break;        
            default: System.out.print("Humans");
                
        }
    }
}
