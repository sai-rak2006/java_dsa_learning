import java.util.*;
public class circu{
    public static void calc(int rad){
        double circumferance;
        circumferance=2*3.14*rad;
        System.out.println("circumferance of a circle is: "+ circumferance);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rad=sc.nextInt();
        calc(rad);
    
    }
}