/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task025;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> num1=new ArrayList();
        num1.add(1);
        List<Integer> num2=new ArrayList();
        num2.add(1);
        List<Integer> sum=new ArrayList();
        int term=2;
        
        while (sum.size()<1000){
            sum=new ArrayList();
            while (num1.size()<num2.size()){
                num1.add(0);
            }
            int carry=0;
            for (int i=0;i<num1.size();i++){
                int digit=num1.get(i)+num2.get(i)+carry;
                sum.add(digit%10);
                carry=digit/10;
            }
            if (carry!=0){
                sum.add(carry);
            }
            num1=new ArrayList(num2);
            num2 =new ArrayList(sum);
            term++;
        }
        System.out.println(term);
        
        
    }
}
