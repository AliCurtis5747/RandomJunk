package arraymethoddemo;
import java.util.Scanner; 
import java.util.Arrays;
import static java.lang.System.*;
import static java.lang.Math.*;

public class ArrayMethodDemo {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ray = new int[10];
        int sum = 0;
        int lessThan = 6;
                
        
        for(int x = 0; x < 10; x++){
            System.out.println("Please type in an integer ::");
            ray[x] = input.nextInt();
            sum += ray[x];
        }
        
        System.out.println("\n\n\n"+Arrays.toString(ray));
        System.out.println("sum :: "+sum);
        
        for(int x = 9; x > -1; x--){
            System.out.print(ray[x]+", ");
        }
        System.out.print("\n\n\n\n");
        for(int x = 0; x < 10; x++){
            if(ray[x] < lessThan){
                System.out.print(ray[x]+", ");
            }
        }
           
        
    }
    
}
