/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task034;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task034 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> factorials=generateFactorials();
        List <Integer> numbers=new ArrayList();
        for (int i=3;i<10000000;i++){
            List<Integer> digits=splitToDigits(i);
            int sum=0;
            for (int j=0;j<digits.size();j++){
                sum+=factorials.get(digits.get(j));
            }
            if (sum==i){
                numbers.add(i);
            }
        }
        long sumOfNumbers=0;
        for (int i=0;i<numbers.size();i++){
            sumOfNumbers+=numbers.get(i);
        }
        System.out.println(sumOfNumbers);
    }
    
    public static List<Integer> generateFactorials(){
        List<Integer> factorials=new ArrayList();
        factorials.add(1);
        for (int i=1;i<=9;i++){
            factorials.add(factorials.get(i-1)*i);
        }
        return factorials;
    }
    
    public static List<Integer>splitToDigits(int number){
        List<Integer> digits=new ArrayList();
        while (number>=10){
            digits.add(number%10);
            number/=10;
        }
        digits.add(number);
        return digits;
    }
}
