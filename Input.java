import java.util.*;

public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);



    }
}