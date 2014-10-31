class Task009{
    public static void main(String[]args){
        double c=0;
        
        for (int a=1;a<=1000;a++){
            for(int b=1;b<=1000;b++){              
                c=(a*a)+(b*b);
                if(Math.pow(c,0.5)==Math.ceil(Math.pow(c,0.5))){
                    double num=a+b+Math.pow(c, 0.5);
                    if (num ==1000){
                        System.out.println(a*b*Math.pow(c, 0.5));
                    }
                }
            }
        }
                
    }
}