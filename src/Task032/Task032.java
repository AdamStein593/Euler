/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer>uniqueProducts=new ArrayList();
        int sum=0;
        List<Integer> numbers1=new ArrayList();
        for (int i=102;i<1000;i++){
            numbers1.add(i);
        }
        numbers1=numberRemoved(0,numbers1);
        
        List<Integer> numbers2=new ArrayList();
        for (int i=1000;i<10000;i++){
            numbers2.add(i);
        }
        numbers2=numberRemoved(0,numbers2);
        for (int i=1;i<=98;i++){
            if (i<10){
                List<Integer>possibleMultiplier=new ArrayList(numbers2);
                possibleMultiplier=numberRemoved(i,possibleMultiplier);
                for (int j=0;j<possibleMultiplier.size();j++){
                    int product=i*possibleMultiplier.get(j);                   
                    if (checkPandigital(i,possibleMultiplier.get(j),product)==true){
                        System.out.println(i+" * "+possibleMultiplier.get(j)+" = "+product);  
                        if (!uniqueProducts.contains(product)){
                            uniqueProducts.add(product);
                            sum+=product;
                         }         
                    }                   
                }
            }
            if (i>=10){
                List<Integer>possibleMultiplier=new ArrayList(numbers1);
                List <Integer>digits=splitToDigits(i);
                possibleMultiplier=numberRemoved(digits.get(0),possibleMultiplier);
                possibleMultiplier=numberRemoved(digits.get(1),possibleMultiplier);
                for (int j=0;j<possibleMultiplier.size();j++){
                    int product=i*possibleMultiplier.get(j);
                    if (product>1000){
                        if (checkPandigital(i,possibleMultiplier.get(j),product)==true){
                            System.out.println(i+" * "+possibleMultiplier.get(j)+" = "+product);
                            if (!uniqueProducts.contains(product)){
                                uniqueProducts.add(product);
                                sum+=product;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
    
    public static int generateNumber(List<Integer>digits){
        int number=0;
            for (int j=0;j<digits.size();j++){
                number+=digits.get(digits.size()-j-1)*Math.pow(10, j);
            }
            return number;
    }
    
    public static List<Integer>splitToDigits(int number){
        List<Integer> digits=new ArrayList();
        while (number>=10){
            digits.add(number%10);
            number/=10;
        }
        digits.add(number);
        Collections.reverse(digits);
        return digits;
    }
    
    public static List<Integer> numberRemoved(int numberToRemove, List<Integer> numberList){
        int size=numberList.size();
        for (int i=size-1;i>=0;i--){
            List<Integer> digits=splitToDigits(numberList.get(i));
            if (digits.contains(numberToRemove)){
                numberList.remove(i);
            }
        }
        return numberList;
    }
    
    public static boolean checkPandigital(int multiplier1,int multiplier2, int product){ 
        List<Integer> digits=new ArrayList();
        digits.addAll(splitToDigits(multiplier1));
        digits.addAll(splitToDigits(multiplier2));
        digits.addAll(splitToDigits(product));
        if (digits.size()!=9 || digits.contains(0)){
            return false;
        }
        
        List<Integer> unique=new ArrayList();
        int index=0;
        while (index<=8 && !unique.contains(digits.get(index))){
            unique.add(digits.get(index));
            index++;         
        }
        if (index!=9){
            return false;
        }
        return true;
    }
}
