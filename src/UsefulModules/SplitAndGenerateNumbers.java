/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UsefulModules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adam
 */
public class SplitAndGenerateNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(generateNumber(splitToDigits(3978)));
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
    public static int generateNumber(List<Integer>digits){
        int number=0;
            for (int j=0;j<digits.size();j++){
                number+=digits.get(digits.size()-j-1)*Math.pow(10, j);
            }
            return number;
    }
}
