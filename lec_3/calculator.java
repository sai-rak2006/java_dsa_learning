import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the operator:");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println("Result: "+ (a+b));
            break;
            case '-':System.out.println("Result: "+ (a-b));
            break;
            case '/':System.out.println("Result: "+ (a/b));
            break;
            default:System.out.println("Invalied");

        }
    }
}