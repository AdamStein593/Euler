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
public class Permutation {
    private List<Integer>sequence =new ArrayList();
    
    public Permutation (List<Integer>sequence){
        this.sequence=sequence;
    }
    
    public List<Integer> getPermuation(){
        return sequence;
    }
    
    public List<Permutation> addToPermutation(int i){
        List <Permutation> permutations=new ArrayList();
        for (int k=0;k<=sequence.size();k++){
            List<Integer> newSequence=new ArrayList(sequence);
            newSequence.add(k, i);
            Permutation newPermutation=new Permutation(newSequence);
            permutations.add(newPermutation);
        } 
        return permutations;
    }
    
    public Permutation add9(int index){
        List<Integer>newSequence=new ArrayList(sequence);
        newSequence.add(index,9);
        return new Permutation (newSequence);
    }
    
}
