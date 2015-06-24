import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Task016{
    
    public static void main (String[]args){
        List<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        int power =1000;    
        int currentHighestUnit=0;
        int carry=0;
        int total=0;
        
        for (int i=1; i<=power;i++){  
            for (int j=0;j<=digits.size()-1;j++){
                digits.set(j,digits.get(j)*2+carry);
                carry=0;
                if (j!=currentHighestUnit){
                    carry=digits.get(j)/10;
                    digits.set(j,digits.get(j)%10);
                }
            }
            if (digits.get(currentHighestUnit)>=10){               
                currentHighestUnit++;
                digits.add(digits.get(currentHighestUnit-1)/10);
                digits.set(currentHighestUnit-1,digits.get(currentHighestUnit-1)%10);
                
            }
        }
        for (int count=0;count<=digits.size()-1;count++){
            total+=digits.get(count);
        }
        System.out.println(total);
    }
        
}