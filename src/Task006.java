class Task006{
    public static void main(String[]args){
        int num1=0;
        int num2=0;
        int dif=0;
        
        for (int i=1;i<=100;i++){
            num1+=i;
            num2+=Math.pow(i,2);
            
        }
        dif+=(Math.pow(num1,2)-num2);
        System.out.println(dif);
    }
}