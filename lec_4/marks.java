import java.util.*;
public class marks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("enter 1 to input 0 to exit");
            choice=sc.nextInt();
            if(choice==1){
                System.out.println("enter the marks(1-100)");
                int marks=sc.nextInt();
                if(marks>=90){
                    System.out.println("very good");
                }else if(marks>=59){
                    System.out.println("good");
                }else if(marks>=30){
                    System.out.println("not bad!");
                }else{
                    System.out.println("invalied");
                }
            }
           
        }
         while(choice!=0);
            System.out.println("program ended");
    }
}

                
                    
                
            
        
    

    
