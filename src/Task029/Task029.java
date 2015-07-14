/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Double> distinctTerms=new ArrayList();
        for (double a=2;a<=100;a++){
            for (double b=2;b<=100;b++){
                double num=Math.pow(a, b);
                if(!distinctTerms.contains(num)){
                    distinctTerms.add(num);
                }
                
            }
        }
        Collections.sort(distinctTerms);
        System.out.println(distinctTerms.size());
    }
}
