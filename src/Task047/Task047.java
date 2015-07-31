/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task047;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task047 {

    /**
     * @param args the command line arguments
     */
    public static List<Integer> primes=new ArrayList();
    public static void main(String[] args) {
        primes=generatePrimes();
        int consecutive=0;
        int [] consecutiveNumbers=new int[4];
        int number=2;
        while (consecutive<4){
            int DistinctPrimeFactors=distinctPrimeFactors(number);
            if (DistinctPrimeFactors==4){
                consecutiveNumbers[consecutive]=number;
                consecutive++;               
            }
            else{
                consecutive=0;
            }
            number++;
        }
        System.out.println(consecutiveNumbers[0]);
        System.out.println(consecutiveNumbers[1]);
        System.out.println(consecutiveNumbers[2]);
        System.out.println(consecutiveNumbers[3]);
    }
    
    public static List<Integer> primeFactors(int number){
        
        int index=0;
        List<Integer> primeFactors=new ArrayList();
        while (number>1){
            if (number%primes.get(index)==0){
                number/=primes.get(index);               
                primeFactors.add(primes.get(index));
                index=0;
            }
            else{
                index++;
            }
        }
        return primeFactors;
    }
    
    public static int distinctPrimeFactors(int number){
        if (isPrime(number)==true){
            return 0;
        }
        List<Integer> primeFactors=primeFactors(number);
        int distinct=1;
        for (int i=1;i<primeFactors.size();i++){
            if (primeFactors.get(i)!=primeFactors.get(i-1)){
                distinct++;
            }
        }
        return distinct;
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
}
