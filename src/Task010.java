import java.util.ArrayList;
import java.util.List;


class Task010{
    public static void main (String[]args){
        List<Integer> primes=generatePrimes();
        long total=0;
        for (int i=0;i<=primes.size()-1;i++){
            total+=(primes.get(i));
        }
        System.out.println(total);
    }
    
    public static List <Integer> generatePrimes(){
        List<Integer> primes=new ArrayList();
        int num=2;
        int limit=2000000;
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

