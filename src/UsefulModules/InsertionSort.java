/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UsefulModules;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> random=new ArrayList();
        for (int i=0;i<100000;i++){
            random.add((int)Math.ceil(Math.random()*1000));
        }
        List<Integer>sorted=sortNumberList(random);
        
    }
    
    public static List <Integer> sortNumberList(List <Integer> unsortedList){
        List <Integer> sorted =new ArrayList();
        sorted.add(unsortedList.get(0));
        
        while (sorted.size()!=unsortedList.size()){         
            int sortedListSize=sorted.size();
            int numberToInsert=unsortedList.get(sortedListSize);
            if (sortedListSize<3){
                int position=linearSearch(sorted,numberToInsert);
                sorted.add(position,numberToInsert);
            }
            else{
                int position=binarySearch(sorted,numberToInsert);
                sorted.add(position,numberToInsert);
            }
            
        }
        
        return sorted;
    }
    
    public static int linearSearch(List <Integer> sorted, int numberToInsert){
        int position=0;
        while (position<sorted.size() && numberToInsert>sorted.get(position)){
            position++;
        }
        return position;
    }
    
    
    
    public static int binarySearch(List <Integer> sorted, int numberToInsert){
        int lowestPosition=0;
        int highestPosition=sorted.size()-1;
        int index=0;
        while (highestPosition-lowestPosition!=1){ 
            int number=lowestPosition+highestPosition;
            index=number/2+number%2;
            if (numberToInsert<sorted.get(index)){
                highestPosition=index;
            }
            else{
                lowestPosition=index;
            }
        }
        if (sorted.get(lowestPosition)>numberToInsert){
            return lowestPosition;
        }
        else if (sorted.get(highestPosition)<numberToInsert){
            return highestPosition+1;
        }
        else{
            return highestPosition;
        }
    }
}

