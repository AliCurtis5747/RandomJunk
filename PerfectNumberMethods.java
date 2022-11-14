
package curtis_adonaldperfectjava;


public class PerfectNumberMethods {
    public PerfectNumberMethods(){
        System.out.println("Let's go!");
    }
    
    public boolean isPerfect(int x){
        int count = x/2;
        int[] factor = new int[count];
        int perfect = 0;
        
        count = 0; 
        for(int spot = 1; spot <= x/2; spot++){
            if(x%spot == 0){
                factor[count]=spot;
                //System.out.println("factor["+count+"] now has value "+spot);
                count++;
            }
        }
        for(int spot = 0; spot < count; spot++){
            perfect+=factor[spot];
        }
        if(perfect == x){
            System.out.println(x+" is a perfect number!");
            return true;
        }
        System.out.println(x+" is an imperfect number!");
        return false;
    }

    
}
