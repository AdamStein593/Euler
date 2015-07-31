/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task040;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Integer> decimal=new ArrayList();
        for (int i=1;i<500000;i++){
            decimal.addAll(splitToDigits(i));
        }
        System.out.println(decimal.get(0)*decimal.get(9)*decimal.get(99)*decimal.get(999)*decimal.get(9999)*decimal.get(99999)*decimal.get(999999));
    }
    
    public static List<Integer>splitToDigits(int number){
        List<Integer> digits=new ArrayList();
        while (number>=10){
            digits.add(number%10);
            number/=10;
        }
        digits.add(number);
        Collections.reverse(digits);
        return digits;
    }
}
