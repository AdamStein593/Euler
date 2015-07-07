package Task002;

class Task002{
    public static void main(String[]args){
        int a=0;
        int b=1;
        int c=0;
        int total=0;
        
        while(c<=4000000){
            c=a+b;
            a=b;
            b=c;
            if(c%2==0){
                total+=c;
            }
        }
        System.out.println(total);            
    }
}