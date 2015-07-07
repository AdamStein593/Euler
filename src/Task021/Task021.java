package Task021;

import java.util.ArrayList;
import java.util.List;
class Task021{
    public static List<Integer> primes=generatePrimes();
    public static void main (String[]args){   
        List<Integer> sums=new ArrayList();
        sums.add(0);
        sums.add(0);
        int total=0;
        for (int i=2;i<=10000;i++){
            if (!primes.contains(i)){
                List<Integer> factors=generateFactors(i);
                int sum=0;
                for (int j=0;j<factors.size();j++){
                    sum+=factors.get(j);
                }
                sums.add(sum);
            }
            else{
                sums.add(1);
            }
        }
        for (int a=2;a<=10000;a++){
            int b=sums.get(a);
            if (b<=10000){
                int c=sums.get(b);
                if (c==a && a!=b){
                    System.out.println(a);
                    System.out.println(b);
                    total+=c;
                }
            }
        }
        System.out.println(total);
                
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