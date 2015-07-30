/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task037 {

    /**
     * @param args the command line arguments
     */
    private static List<Integer>primes=new ArrayList();  
    public static void main(String[] args) {
        primes=generatePrimes();
        List<Integer> truncatablePrimes=new ArrayList();
        for (int primeIndex=4;primeIndex<primes.size();primeIndex++){
            int number=primes.get(primeIndex);
            List<Integer>digits=splitToDigits(number);
            boolean truncatable1=truncatableLToR(digits);
            if (truncatable1==true){
                boolean truncatable2=truncatableRToL(digits);
                if (truncatable2==true){
                    truncatablePrimes.add(number);
                }
            }
        }
        int total=0;
        for (int i=0;i<truncatablePrimes.size();i++){
            System.out.println(truncatablePrimes.get(i));
            total+=truncatablePrimes.get(i);
        }
        System.out.println(total);
        System.out.println(truncatablePrimes.size());
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
        if (num==1){
            return false;
        }
        if (num==2){
            return true;
        }
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
    
    public static boolean truncatableLToR(List <Integer> digitsOfNumber){
        List<Integer> digits=new ArrayList(digitsOfNumber);
        boolean truncatable=true;
        if (isPrime(digits.get(digits.size()-1))==true){
        for (int i=0;i<digitsOfNumber.size();i++){
            digits.remove(0);
            int number=generateNumber(digits);
            if (isPrime(number)==false){
                return false;
            }
            else if(digits.size()==1){
                return true;
            }
        }
        }
        else{
            return false;
        }
        return truncatable;
    }
    
    public static boolean truncatableRToL(List <Integer> digitsOfNumber){
        List<Integer> digits=new ArrayList(digitsOfNumber);
        boolean truncatable=true;
        if (isPrime(digits.get(digits.size()-1))==true){
        for (int i=0;i<digitsOfNumber.size();i++){
            digits.remove(digits.size()-1);
            int number=generateNumber(digits);
            if (isPrime(number)==false){
                return false;
            }
            else if(digits.size()==1){
                return true;
            }
        }
        }
        else{
            return false;
        }
        return truncatable;
    }
    
    public static int generateNumber(List<Integer>digits){
        int number=0;
            for (int j=0;j<digits.size();j++){
                number+=digits.get(digits.size()-j-1)*Math.pow(10, j);
            }
            return number;
    }
}
