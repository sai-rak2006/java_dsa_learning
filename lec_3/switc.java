import java.util.*;
public class switc{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("hii");
            break;
            case 2:System.out.println("hello");
            break;
            case 3:System.out.println("Namastee");
            break;
            default:System.out.println("Invalied");

        }
    }
}