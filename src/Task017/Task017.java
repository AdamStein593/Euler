package Task017;

class Task017{
    public static int position=0;
    public static String [] numbers = new String [1001];
    
    public static void main (String[]args){
        for (int i=0;i<=numbers.length-2;i++){
            numbers[i]="";
            hundreds();
            tens();
            units();
            position++;
        }
        
        numbers[position]="OneThousand";
        int total=0;
        for (int i=0;i<=numbers.length-1;i++){
            System.out.println(numbers[i]);
            total+=numbers[i].length();
            
        }
        System.out.println(total);
    }
    
    private static void hundreds(){
        switch (position/100){
                case 0: numbers[position]+="";break;
                case 1: numbers[position]+="OneHundred";break;
                case 2: numbers[position]+="TwoHundred";break;
                case 3: numbers[position]+="ThreeHundred";break;
                case 4: numbers[position]+="FourHundred";break;
                case 5: numbers[position]+="FiveHundred";break;
                case 6: numbers[position]+="SixHundred";break;
                case 7: numbers[position]+="SevenHundred";break;
                case 8: numbers[position]+="EightHundred";break;
                case 9: numbers[position]+="NineHundred";break;
            }
        int units= position%10;
        int tens =position/10-((position/100)*10);
        int hundreds = position/100;
        if (position%100!=0 && position/100>0){
            numbers[position]+="And";
        }
    }
    public static void tens(){
        switch (position/10-((position/100)*10)){
                    case 0: numbers[position]+="";break;
                    case 1: numbers[position]+="";break;
                    case 2: numbers[position]+="Twenty";break;
                    case 3: numbers[position]+="Thirty";break;
                    case 4: numbers[position]+="Forty";break;
                    case 5: numbers[position]+="Fifty";break;
                    case 6: numbers[position]+="Sixty";break;
                    case 7: numbers[position]+="Seventy";break;
                    case 8: numbers[position]+="Eighty";break;
                    case 9: numbers[position]+="Ninety";break;
                }
    }
    public static void units(){
        int tens =position/10-((position/100)*10);
        if (tens!=1){
                        switch (position%10){
                            case 0: numbers[position]+="";break;
                            case 1: numbers[position]+="One";break;
                            case 2: numbers[position]+="Two";break;
                            case 3: numbers[position]+="Three";break;
                            case 4: numbers[position]+="Four";break;
                            case 5: numbers[position]+="Five";break;
                            case 6: numbers[position]+="Six";break;
                            case 7: numbers[position]+="Seven";break;
                            case 8: numbers[position]+="Eight";break;
                            case 9: numbers[position]+="Nine";break;
                        }
                    }else{
                        switch (position%10){
                            case 0: numbers[position]+="Ten";break;
                            case 1: numbers[position]+="Eleven";break;
                            case 2: numbers[position]+="Twelve";break;
                            case 3: numbers[position]+="Thirteen";break;
                            case 4: numbers[position]+="Fourteen";break;
                            case 5: numbers[position]+="Fifteen";break;
                            case 6: numbers[position]+="Sixteen";break;
                            case 7: numbers[position]+="Seventeen";break;
                            case 8: numbers[position]+="Eighteen";break;
                            case 9: numbers[position]+="Nineteen";break;
                        }
                    }
    }
}