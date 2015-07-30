/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<NumberGroup> listOfNumbers=new ArrayList();
        int top=1;
        int bottom=1;
        for (int i=1;i<=9;i++){
            NumberGroup newGroup= new NumberGroup(i);
            listOfNumbers.add(newGroup);
        }
        for (int i=11;i<100;i++){
            List<Integer> digits=splitToDigits(i);
            if (!digits.contains(0)){
                if (digits.get(0)==digits.get(1)){
                    listOfNumbers.get(digits.get(0)-1).addNumber(i);
                }
                else{
                    listOfNumbers.get(digits.get(0)-1).addNumber(i);
                    listOfNumbers.get(digits.get(1)-1).addNumber(i);    
                }
                
            }
        }
        for (int numerator=12;numerator<100;numerator++){
            List<Integer> digits=splitToDigits(numerator);
            if (numerator%10!=0){
                List<Integer> possibleDenominators1=new ArrayList();
                possibleDenominators1.addAll(listOfNumbers.get(digits.get(0)-1).getNumbers());
                List<Integer> possibleDenominators2=new ArrayList();
                possibleDenominators2.addAll(listOfNumbers.get(digits.get(1)-1).getNumbers());
                for (int i=0;i<possibleDenominators1.size();i++){
                    int denominator=possibleDenominators1.get(i);
                    float fraction=(float)numerator/(float)denominator;
                    List<Integer>temp=new ArrayList(digits);
                    temp.remove(0);
                    float newNumerator=(float)generateNumber(temp);
                    float newDenominator=(float)cancelDigit(denominator,digits.get(0));
                    float newFraction=newNumerator/newDenominator;
                    if (fraction==newFraction && fraction<1){                       
                        System.out.println(numerator);
                        System.out.println(denominator);
                        top*=numerator;
                        bottom*=denominator;
                    }
                }
                for (int i=0;i<possibleDenominators2.size();i++){
                    int denominator=possibleDenominators2.get(i);
                    float fraction=(float)numerator/(float)denominator;
                    List<Integer>temp=new ArrayList(digits);
                    temp.remove(1);
                    float newNumerator=(float)generateNumber(temp);
                    float newDenominator=(float)cancelDigit(denominator,digits.get(1));
                    float newFraction=newNumerator/newDenominator;
                    if (fraction==newFraction && fraction<1){                      
                        System.out.println(numerator);
                        System.out.println(denominator);
                        top*=numerator;
                        bottom*=denominator;
                    }
                }
            }
        }
        System.out.println(top);
        System.out.println(bottom);
        for (int i=top-1;i>1;i++){
            if (top%i==0 && bottom%i==0){
                top/=i;
                bottom/=i;
            }
        }
        System.out.println(top);
        System.out.println(bottom);
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
    
    public static int cancelDigit(int number, int numberToRemove){
        List<Integer>digits=splitToDigits(number);
        if (digits.get(0)==numberToRemove){
            digits.remove(0);
        }else{
            digits.remove(1);
        }
        return generateNumber(digits);
    }
}
