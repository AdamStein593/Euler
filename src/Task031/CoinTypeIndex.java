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
public class CoinTypeIndex {
    
    private List <AllCombinations> combinationsForAllCoins=new ArrayList();
    
    public CoinTypeIndex(){
        
    }
    
    public List<AllCombinations> getAllCombinationsForCoins(){
        return combinationsForAllCoins;
    }
    
    public void addCoinToIndex(AllCombinations combinationsForACoin){
        this.combinationsForAllCoins.add(combinationsForACoin);
    }
    
    public List<Combination> getCombinationsForACoin(int coin){
        List<Combination> combinations=new ArrayList();
        for (int i=0;i<combinationsForAllCoins.size();i++){
            if(combinationsForAllCoins.get(i).getCoinValue()==coin){
                combinations=new ArrayList(combinationsForAllCoins.get(i).getAllCombinations());
            }
        }
        return combinations;
    }
}
