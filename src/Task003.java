class Task003{
    public static void main(String[]args){
        int num=13195;
        
        int stop=0;
        
        while (stop==0){
            for(int x=2;x<num;x++){
                
            if(num%x==0){
                num/=x;
                x=num;
            }
            if(x==num-1){
                stop=1;
                System.out.println(num);
            }
            }
        }
    }
}