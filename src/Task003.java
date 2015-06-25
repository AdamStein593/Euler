import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Task003{
    public static void main(String[]args){
        
        int num=851475143;
        int temp=num;
        int divisor=2;
        boolean stop=false;
        List<Integer>number=new ArrayList();
        List<Integer>beingDivided=new ArrayList(number);
        while (temp>0){
            number.add(temp%10);
            temp/=10;
        }
        number.add(0);
        number.add(0);
        number.add(6);
        Collections.reverse(number);
        
        
        while (stop==false){
            beingDivided=divide(beingDivided,divisor);
            if (beingDivided.size()>0){
                number=beingDivided;
                if (number.size()!=1){
                    divisor=1;
                }
            }
            else{
                beingDivided=number;
            }
            if (number.size()==1 && number.get(0)==1){
                System.out.println(divisor);
                stop=true;
            }
            divisor++;
            
        }
        
        
        
    }
    
    public static List<Integer> divide(List<Integer> number, int divisor){
        int carry=0;
        List<Integer>temp=new ArrayList();
        for (int i=0;i<=number.size()-1;i++){
            int toDivide=number.get(i)+10*carry;
            if (toDivide/divisor!=0  || temp.isEmpty()==false){
                temp.add(toDivide/divisor);
            }
            carry=toDivide%divisor;
            
            if(i==number.size()-1 && carry!=0){
                return new ArrayList();
                
            }
        }
        
        
        return temp;
    }
    
}