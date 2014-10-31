class Task013test{
    public static void main (String[]args){
        int total=0;
        String sum = 
"438317996";
        
         int[] num = new int[sum.length()];
         int [] digit=new int[6];
        for (int i = 0; i < sum.length(); i++){
            num[i] = sum.charAt(i) - '0';
        }
        for(int x=2;x>=0;x--){
           for (int i=x;i<=8;i+=3){
               total+=num[i];
               
           }
           if (x!=0){
               digit[x]=total%10;
               System.out.println("t  "+total);
               System.out.println("d  "+digit[x]);
                total=(total-digit[x])/10;
                System.out.println("t2  "+total);
           }
           else{
               digit[0]=total;
               for (int a=0; a<digit.length;a++){
                   System.out.println(digit[a]);
               }
           }
           
            
        }
    }
}