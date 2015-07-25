/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author Adam
 */
public class Task024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        List<Permutation> permutations=new ArrayList();
        List<Integer>startSequence=new ArrayList();
        startSequence.add(0);
        permutations.add(new Permutation(startSequence));
        
        for (int i=1;i<=8;i++){
            int sizeOfList=permutations.size();
            for(int j=0;j<sizeOfList;j++){
                permutations.addAll(permutations.get(j).addToPermutation(i));
            }
            for (int countToRemove=0;countToRemove<sizeOfList;countToRemove++){
                permutations.remove(0);
            }
            
            System.out.println(i);
            System.out.println(permutations.size());
        }
        Collections.sort(permutations, new Comparator<Permutation>() {
            public int compare(Permutation o1, Permutation o2) {
                for(int index=0;index<o1.getPermuation().size();index++){
                    if (o1.getPermuation().get(index)>o2.getPermuation().get(index)){
                        return 1;
                    }
                    if (o1.getPermuation().get(index)<o2.getPermuation().get(index)){
                        return -1;
                    }
                }
                return 0;
            }
        });  
        List <Permutation> finalSet=new ArrayList();
        for (int i=0;i<=9;i++){
            for (int j=0;j<180000;j++){
                finalSet.add(permutations.get(j).add9(i));
            }
        }
        Collections.sort(finalSet, new Comparator<Permutation>() {
            public int compare(Permutation o1, Permutation o2) {
                for(int index=0;index<o1.getPermuation().size();index++){
                    if (o1.getPermuation().get(index)>o2.getPermuation().get(index)){
                        return 1;
                    }
                    if (o1.getPermuation().get(index)<o2.getPermuation().get(index)){
                        return -1;
                    }
                }
                return 0;
            }
        });
        
        
    }
    
    
}
