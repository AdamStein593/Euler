package Task007;

class Task007{
    public static void main(String[]args){
        int primes=0;
        int num=2;
        int last=0;
        int divisable=0;
        
        while(primes<10001){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    divisable++;
                }
            }
            if (divisable==2){
                primes++;
                last=num;
            }
            divisable=0;
            num++;
        }
        System.out.println(last);
    }
}