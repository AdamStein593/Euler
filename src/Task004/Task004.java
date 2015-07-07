package Task004;

class Task004{
    public static void main(String[]args){
        int x=999;
        int num=0;
        int high=0;
        
        while (x>1){
            for (int i=999;i>0;i--){
                num=x*i;
                String num1=String.valueOf(num);
                String num2=new StringBuilder(num1).reverse().toString();
                if(num1.equals(num2)){
                    if (num>high){
                        high=num;
                    }
                    
                }
            }
            x-=1;
        }
        System.out.println(high);
    }
}