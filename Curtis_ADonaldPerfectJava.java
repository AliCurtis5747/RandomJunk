/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curtis_adonaldperfectjava;

/**
 *
 * @author Muler
 */
public class Curtis_ADonaldPerfectJava {

    public static void main(String[] args) {
        PerfectNumberMethods calc = new PerfectNumberMethods();
        int count = 1;
        do{
            calc.isPerfect(count);
            count++;
        }while(count < 1001);
    }
    
}
