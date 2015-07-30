/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task033;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class NumberGroup {
    private int groupIndex;
    private List<Integer> numbers=new ArrayList();
    
    public NumberGroup(int containsNumber){
        this.groupIndex=containsNumber;
    }
    
    public void addNumber(int number){
        numbers.add(number);       
    }
    
    public List<Integer> getNumbers(){
        return numbers;
    }
    
    public int getGroupIndex(){
        return groupIndex;
    }
    
}
