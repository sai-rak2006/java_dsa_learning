import java.util.*;
public class ages{
    public static void check(int n){
        if(n>18){
            System.out.println("Adult");
        }else{
            System.out.println("Child");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        check(n);
    }
}