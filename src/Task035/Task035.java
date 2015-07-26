/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task035;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task035 {

    /**
     * @param args the command line arguments
     */
    private static List<Integer>primes=new ArrayList();            
    private static boolean circular=true;
    public static void main(String[] args) {
        primes=generatePrimes();
        List<Integer>circularPrimes=new ArrayList();
        int index=0;
        while (primes.get(index)<10){
            circularPrimes.add(primes.get(index));
            index++;
        }
        while (index<primes.size()){
            List<Integer>digits =splitToDigits(primes.get(index));
            List<Integer>combinations=generateCombinations(digits);
            if (circular==true && !circularPrimes.contains(combinations.get(0))){
                circularPrimes.addAll(combinations);              
            }
            index++;
            circular=true;
        }
        System.out.println(circularPrimes.size());
    }
    
    public static List <Integer> generatePrimes(){
        int num=2;
        int limit=1000000;
        primes.add(num);
        num++;
        
        while (num<=limit){
            if (isPrime(num)==true){
                primes.add(num);
            }
            num+=2;
        }
        return primes;
    }
    
    public static boolean isPrime(int num){
        boolean isPrime=false;
        boolean stop=false;
        
        int position=0;
        while (stop==false){
            
            if (num%primes.get(position)==0){
                stop=true;
            }
            else if (primes.get(position)>=Math.sqrt(num)){
                isPrime=true;
                stop=true;
            }
            position++;
        }
        
        return isPrime;
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
    
    public static List<Integer>generateCombinations(List<Integer> digits){
        List<Integer> circularNumbers=generateCircularNumbers(digits);      
        List<Integer>combinations=new ArrayList();
        if (digits.contains(2)){
            circular=false;
        }
        for (int i=0;i<circularNumbers.size();i++){
            if (circular==true){
                if (isPrime(circularNumbers.get(i))==true){
                    combinations.add(circularNumbers.get(i));
                }
                else{
                    circular=false;
                }
            }
        }
             
        return combinations;
    }
    
    public static List<Integer> generateCircularNumbers(List<Integer> digits){
        List<Integer> circularNumbers=new ArrayList();        
        circularNumbers.add(generateNumber(new ArrayList(digits)));
        
        
        for (int i=0;i<digits.size();i++){
            digits.add(digits.get(0));
            digits.remove(0);
            int number=generateNumber(digits);
            if(!circularNumbers.contains(number)){
                circularNumbers.add(number);
            }
            
        }
        return circularNumbers;
    }
    
    public static int generateNumber(List<Integer>digits){
        int number=0;
            for (int j=0;j<digits.size();j++){
                number+=digits.get(digits.size()-j-1)*Math.pow(10, j);
            }
            return number;
    }
}
