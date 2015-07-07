package Task021;

import java.util.ArrayList;
import java.util.List;
class Task021{
    public static List<Integer> primes=generatePrimes();
    public static void main (String[]args){
        for (int i=2;i<=10000;i++){
            List<Integer> primeFactorList =primeFactors(i);         
        }
        
        
                
    }
    
    public static List <Integer> primeFactors(int num){
        List <Integer> primeFactors= new ArrayList();
        int position=0;
        while (num>1){
            if (primes.contains(num)){
                primeFactors.add(num);
                break;
            }
            int divisor=primes.get(position);
            if (num%divisor==0){
                primeFactors.add(divisor);
                num/=divisor;
            }
            else{
                position++;
            }
        }
        return primeFactors;
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
    
    public static List<Integer>factors(List<Integer>primeFactors){
        List<Integer> factors=new ArrayList(primeFactors);
        int numberOfPrimes=primeFactors.size();
        for (int i=0;i<numberOfPrimes;i++){
            for (int j=0;j<numberOfPrimes;j++){
                if (i!=j){
                    int factor=primeFactors.get(i)*primeFactors.get(j);
                    if (!factors.contains(factor)){
                        factors.add(factor);
                    }
                }
            }
        }
        
        return factors;
    }
    
}