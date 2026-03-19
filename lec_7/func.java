import java.util.*;
public class func{
    public static void factorial(int n1){
        if(n1<0){
            System.out.println("invalied");
            return;
        }
        int fact=1;
        for(int i=n1;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        factorial(n1);
       
    }
}