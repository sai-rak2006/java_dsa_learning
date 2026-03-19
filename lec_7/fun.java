import java.util.*;
public class fun{
    public static int mulOfNum(int n1,int n2){

        int mul=n1*n2;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int mul=mulOfNum(n1,n2);
        System.out.println(mul);
    }
}