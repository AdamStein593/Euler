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
public class Task031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        coins();      
    }
    
    public static void coins(){
        int [] coinTypes={1,2,5,10,20,50,100,200};       
        CoinTypeIndex coinIndex = new CoinTypeIndex(); 
        
        for (int i=0;i<coinTypes.length;i++){
            int coin=coinTypes[i];          
            
            List<Integer>combinationForCoin=new ArrayList();
            combinationForCoin.add(coin);
            Combination oneCoinCombination=new Combination(combinationForCoin);          
            AllCombinations allCombosForCoin=new AllCombinations(oneCoinCombination,coinTypes[i]);
            if (i>0){
                List <Integer> firstBreakdown=new ArrayList();
                for (int j=i-1;j>=0;j--){
                        while (coin>=coinTypes[j]){
                            coin-=coinTypes[j];
                            firstBreakdown.add(coinTypes[j]);                        
                        }
                }
                Combination firstCombination=new Combination(firstBreakdown);
                allCombosForCoin.addCombination(firstCombination);
                if (firstCombination.getCombination().size()==2){
                    for (int count1=0;count1<coinIndex.getCombinationsForACoin(firstBreakdown.get(0)).size();count1++){
                        for (int count2=0;count2<coinIndex.getCombinationsForACoin(firstBreakdown.get(1)).size();count2++){
                            List <Integer> combo=new ArrayList();
                            List <Combination> set1=coinIndex.getCombinationsForACoin(firstCombination.getCombination().get(0));
                            List <Combination> set2=coinIndex.getCombinationsForACoin(firstCombination.getCombination().get(1));
                            combo.addAll(set1.get(count1).getCombination());
                            combo.addAll(set2.get(count2).getCombination());
                            
                            Combination jointSets = new Combination(combo);
                            if (allCombosForCoin.checkIfContains(jointSets)==false){
                                    allCombosForCoin.addCombination(jointSets);
                            }                               
                        }
                    }
                }
                if (firstCombination.getCombination().size()==3){
                    for (int count1=0;count1<coinIndex.getCombinationsForACoin(firstBreakdown.get(0)).size();count1++){
                        for (int count2=0;count2<coinIndex.getCombinationsForACoin(firstBreakdown.get(1)).size();count2++){
                            for (int count3=0;count3<coinIndex.getCombinationsForACoin(firstBreakdown.get(2)).size();count3++){
                                List <Integer> combo=new ArrayList();
                                List <Combination> set1=coinIndex.getCombinationsForACoin(firstBreakdown.get(0));
                                List <Combination> set2=coinIndex.getCombinationsForACoin(firstBreakdown.get(1));
                                List <Combination> set3=coinIndex.getCombinationsForACoin(firstBreakdown.get(2));
                                combo.addAll(set1.get(count1).getCombination());
                                combo.addAll(set2.get(count2).getCombination());
                                combo.addAll(set3.get(count3).getCombination());

                                Combination jointSets = new Combination(combo);
                                if (allCombosForCoin.checkIfContains(jointSets)==false){
                                    allCombosForCoin.addCombination(jointSets);
                                }
                                
                            }
                        }
                    }
                }
            }
            coinIndex.addCoinToIndex(allCombosForCoin);
            System.out.println(coinIndex.getCombinationsForACoin(coinTypes[i]).size());
        }
        System.out.println(coinIndex.getCombinationsForACoin(200).size()); 
        
    }
    
    
    
}
