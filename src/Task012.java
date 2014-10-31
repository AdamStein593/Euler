class Task012{
    public static void main(String[]args){
        int num=1;
        int triangle=0;
        int divisors=0;
        int i=0;
        
        while (divisors<=500){
            int [] expo=new int [10];
            i=0;
            int last=0;
            divisors=1;
            triangle+=num;
            int temp=triangle;
            
            
            while (temp>1){                                             
                for(int x=2;x<=temp;x++){
                     
                    if(temp%x==0){
                        
                        temp/=x;
                        
                        if (x!=last){
                            expo[i]=2;
                            i++;
                        }
                        else{
                            expo[i-1]++;    
                        }
                        last=x;
                        break;
                    }                
                }
            }
            
            for(int a=0; a<expo.length;a++){
                if (expo[a]==0){
                    break;
                }
                divisors*=expo[a];
                
            }
            
            System.out.println(triangle+" "+divisors);
            
            num++;
        }
        System.out.println(triangle);
    }
}