
import java.util.ArrayList;
import java.util.List;

class Task020{
    public static void main (String[]args){
        List<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        int factorial =100;    
        int currentHighestUnit=0;
        int carry=0;
        long total=0;
        
        for (int i=1; i<=factorial;i++){  
            for (int j=0;j<=digits.size()-1;j++){
                digits.set(j,digits.get(j)*i+carry);
                carry=0;
                if (j!=currentHighestUnit){
                    carry=digits.get(j)/10;                                       
                    digits.set(j,digits.get(j)%10);
                }
            }
            if (digits.get(currentHighestUnit)>=10){
                while(digits.get(currentHighestUnit)>=10){
                    digits.add(digits.get(currentHighestUnit)/10);
                    digits.set(currentHighestUnit,digits.get(currentHighestUnit)%10);
                    currentHighestUnit++;
                }
            }
        }
        for (int i=0;i<=digits.size()-1;i++){
            total+=digits.get(i);
        }
        System.out.println(total);
    }
}
