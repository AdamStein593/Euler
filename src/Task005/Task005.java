package Task005;

class Task005{
    public static void main(String[]args){
        int low=0;
        int num=1;
        int works=0;
        
        while(low==0){
            for (int i=2;i<=20;i++){
                if(num%i==0){
                    works++;
                }
                
            }
            if (works==19){
                low=num;
                System.out.println(low);
            }
            else{
                works=0;
                num++;
            }
        }
    }
}