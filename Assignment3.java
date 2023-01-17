import java.util.*;
public class Assignment3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Question 1 Assignment 
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if(a>=0){
            System.out.print("The number is positive.");
        }
        else{
            System.out.print("The number is negetive. ");
        }
         
        //Question 2 Assignment 3
        System.out.print("Enter Number : ");
        double a = sc.nextDouble();
        if(a>=100 && a<=105){
            System.out.print("You have fever.");
        }
        else if(a>=106){
            System.out.print("You have to goto hospital right now.");
        }
        else{
            System.out.print("No Fever. ");
        } 
        //Question 3 Assignment 3
        System.out.print("Enter any Day from 1-7 : ");
        int week=sc.nextInt();
        
        switch(week) {
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
        default:System.out.println("Invalid input ! Please enter week number between 1-7.");
    }


        //Question 4 Assignment 3
         
        int a=63,b=36;
        boolean x= (a<b)?true:false;
        System.out.print(x);
        int y= (a>b)?a:b;
        System.out.print(y);
        
         


        //Question 4 Assignment 3 
        //leap year
        System.out.print("Enter Number : ");
        int year = sc.nextInt();
        boolean x= (year %4) ==0;
        boolean y= (year%100) !=0;
        boolean z= ((year%100==0) && (year%400==0));
        if(x && (y||z)) {
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leapyear");
        }


    }
    
}
