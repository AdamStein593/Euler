/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task030;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList();
        double [] digitPowers=new double [10];
        int total=0;
        for (int i=0;i<10;i++){
            digitPowers[i]=Math.pow(i,5);
        }
        for (int i=2;i<=1000000;i++){
            List <Integer> digits=new ArrayList();
            int temp=i;
            while (temp>=10){
                digits.add(temp%10);
                temp/=10;
            }
            digits.add(temp);
            int sum=0;
            for (int j=0;j<digits.size();j++){
                sum+=digitPowers[digits.get(j)];
            }
            if (sum==i){
                numbers.add(i);
                total+=i;
            }
           
        }
        System.out.println(total);
    }
}
