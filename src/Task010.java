class Task010{
        public static void main(String[]args){
        int num=3;
        int total=2;
        
        while(num<=30){
            for(int i=1;i<num;i+=2){
                if(num%i==0 && i!=1){
                    break;
                }
                if (i>=Math.floor(num/2)){
                    total+=num;
                    System.out.println(num);
                    break;
                }
                
            }

            
            
            num+=2;
        }
        System.out.println(total);
    }
}