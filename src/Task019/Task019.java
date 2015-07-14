/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task019;

/**
 *
 * @author Adam
 */
public class Task019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year=1900;
        int day=1;
        int month=1;
        //1=Jan, 2=Feb,3=Mar....
        int weekday=1;
        //1= Mon, 2=Tue, 3=Wed....
        String dayName="";
        int sundays=0;
        while (year<2001){                                
            if (weekday<7){
                weekday++;
            }
            else{
                weekday=1;
            }  
            
            
            
            if ((month==2 && day==28) && (year%4!=0 || year%100==0 && year%400!=0)){
               month++;
               day=1;
            }
            else if(month==2 && day==29){
               month++;
               day=1;
            }
            else if ((month==4 || month==6 || month==9 || month==11) && day==30){
                month++;
                day=1;
            }
            else if(day==31){
                month++;
                day=1;
            }
            else{
                day++;
            }
            
            if (month>12){
                month=1;
                year++;
                day=1;
            }
            
            switch (weekday){
                case 1:dayName="Monday";break;
                    case 2:dayName="Tuesday";break;
                        case 3:dayName="Wednesday";break;
                            case 4:dayName="Thursday";break;
                                case 5:dayName="Friday";break;
                                    case 6:dayName="Saturday";break;
                                        case 7:dayName="Sunday";break;
            }
            if (year>1900 && weekday==7 && day==1){
                sundays++;
                System.out.println(day+"/"+month+"/"+year);
                
            }
        }
        System.out.println(sundays);
    }
}
