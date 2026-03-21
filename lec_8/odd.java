import java.util.*;
public class odd{
    public static int sum(int n){
    int su=0;
    for(int i=1;i<=n;i++){
        if(i%2!=0){
        su=su+i;
        
    }}
    return su;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=sum(n);
        System.out.println("sum: "+result);

    }
}
