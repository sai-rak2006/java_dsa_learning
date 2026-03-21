import java.util.*;
public class great{
    public static void of(int n1,int n2){
        if(n1>n2){
            System.out.println("n1 is grater"+n1);
        }else{
            System.out.println("n2 is grater"+n2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        of(n1,n2);
    }
}