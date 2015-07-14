/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task027;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Task027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer>primes=generatePrimes();
        int longestChain=0;
        for (int a=-1000;a<=1000;a++){
            for (int b=0;b<=1000;b++){
                int chain=0;
                int n=0;
                int value=n*n+a*n+b;
                while (value>0 && isPrime(value,primes)==true){
                    n++;
                    chain++;
                    value=n*n+a*n+b;
                }
                if (chain>longestChain){
                    longestChain=chain;
                    System.out.println("A: "+a+" B: "+b);
                    System.out.println(chain);
                }
            }
        }
    }
    public static List <Integer> generatePrimes(){
        List<Integer> primes=new ArrayList();
        int num=2;
        int limit=10000;
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
}
