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
public class Combination {
    private  List<Integer> coins=new ArrayList();
    
    public Combination(List<Integer>coins){
        this.coins=coins;
        List<Integer> temp=new ArrayList(this.coins);
        this.coins=temp;
    }
    
    public List<Integer> getCombination(){
        return coins;
    }
}
