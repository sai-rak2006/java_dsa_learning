import java.util.*;
public class funct{
    public static void prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }else{
            System.out.println("Not prime");
        }
        return;

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    prime(n);
    
    
}    

}
