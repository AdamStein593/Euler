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
public class GeneratePrimes {

    /**
     * @param args the command line arguments
     */
    private static List<Integer>primes=new ArrayList();  
    public static void main(String[] args) {
        primes=generatePrimes();
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
