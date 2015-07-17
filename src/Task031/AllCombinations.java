/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task031;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class AllCombinations {
    private List<Combination> combinationGroup=new ArrayList();
    private int coinValue;
    
    public AllCombinations(Combination combinationGroup,int coinValue){
        this.combinationGroup.add(combinationGroup);
        this.coinValue=coinValue;
    }
    
    public List<Combination> getAllCombinations(){
        return combinationGroup;
    }
    public Combination getCertainCombination(int i){
        return combinationGroup.get(i);
    }
    public int getCoinValue(){
        return coinValue;
    }
    
    public void addCombination(Combination combination){
        combinationGroup.add(combination);
    }
    
    public boolean checkIfContains(Combination combo){
        boolean present=false;
        List <Integer> test=combo.getCombination();
        
        for (int i=0;i<combinationGroup.size();i++){
            List<Integer> test2 =combinationGroup.get(i).getCombination();
            double hashValue=1;
            double testValue=1;
            for (int j=0;j<test2.size();j++){
                hashValue*=test2.get(j)*3-2;
                
            }
            for (int j=0;j<test.size();j++){
                testValue*=test.get(j)*3-2;
            }
            if (testValue==hashValue){
                present=true;
                return present;
            }         
        }
        return present;
    }
    
}
