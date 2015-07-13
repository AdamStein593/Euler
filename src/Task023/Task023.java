/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task023 {
    public static int limit=28123;
    public static List<Integer> primes=generatePrimes();
    public static void main(String[] args) {
        List<Integer>abundantNumbers=new ArrayList();
        for (int i=2;i<=limit;i++){
            if (!primes.contains(i)){
                if (isAbundant(i)==true){
                    abundantNumbers.add(i);
                    if (i%2!=0){
                        System.out.println(i);
                    }
                }
            }            
        }
        System.out.println(abundantNumbers.size());
        if(limit!=28123){
            List <Integer> abundantSums=abundantSums(abundantNumbers);
            Collections.sort(abundantSums);
            for(int i=0;i<abundantSums.size();i++){
                System.out.println(abundantSums.get(i));
            }
        }
        
    }
    
    public static List<Integer> generateFactors(int num){
        List<Integer> factors=new ArrayList();
        for (int i=1;i<=num/2;i++){
            if (num%i==0){
                factors.add(i);
            }
        }
        return factors;
    }
    
    public static List <Integer> generatePrimes(){
        List<Integer> primes=new ArrayList();
        int num=2;
        primes.add(num);
        num++;
        
        while (num<=limit){
            if (isPrime(num,primes)==true){
                primes.add(num);
            }
            num+=2;
        }
        return primes;
    }
    
    public static boolean isPrime(int num, List<Integer> primes){
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
    
    public static boolean isAbundant(int num){
        boolean isAbundant=false;
        int sumOfDivisors=0;
        for (int i=1;i<=num/2;i++){
            if (num%i==0){
                sumOfDivisors+=i;
            }
            if (sumOfDivisors>num){
                isAbundant=true;
                return isAbundant;
            }
        }
                                 
        return isAbundant;
    }
    
    public static List <Integer> abundantSums(List <Integer> abundantNumbers){
        List<Integer>sums=new ArrayList();
        for (int i=0;i<abundantNumbers.size();i++){
            for(int j=0;j<abundantNumbers.size();j++){
                int sum=abundantNumbers.get(i)+abundantNumbers.get(j);
                if(!sums.contains(sum)){
                    sums.add(sum);
                }
                if (sum>limit){
                    break;
                }
            }
        }
        return sums;
    }
}

