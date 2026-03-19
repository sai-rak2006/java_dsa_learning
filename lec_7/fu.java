import java.util.*;
public class fu{
    public static int sumOfNum(int n1,int n2){

        int sum=n1+n2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=sumOfNum(n1,n2);
        System.out.println(sum);
    }
}