import java.util.*;
public class avg{
    public static int mark(int n1,int n2,int n3){
    int aveg= (n1+n2+n3)/3;
    return  aveg;      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int aveg=mark(n1,n2,n3);
        System.out.println("aveg: "+aveg);
    }
}