/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task024;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<List> permutations=new ArrayList();
        List<Integer>startSequence=new ArrayList();
        startSequence.add(0);
        permutations.add(startSequence);
        
        for (int i=2;i<=9;i++){
            for(int j=0;j<permutations.size();j++){
                for (int k=0;k<permutations.get(j).size();k++){
                    List<Integer> sequence=new ArrayList();
                }
            }
        }
    }
}
