/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task018;

/**
 *
 * @author Adam
 */
public class Task018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] pyramid = {
            {75},
            {95,64},
            {17,47,82},
            {18,35,87,10},
            {20,4,82,47,65},
            {19,1,23,75,3,34},
            {88,2,77,73,7,63,67},
            {99,65,4,28,6,16,70,92},
            {41,41,26,56,83,40,80,70,33},
            {41,48,72,33,47,32,37,16,94,29},
            {53,71,44,65,25,43,91,52,97,51,14},
            {70,11,33,28,77,73,17,78,39,68,17,57},
            {91,71,52,38,17,14,91,43,58,50,27,29,48},
            {63,66,4,68,89,53,67,30,73,16,69,87,40,31},
            {4,62,98,27,23,9,70,98,73,93,38,53,60,4,23}};
        
        int highestSum=0;
        int sum;
        int test=0;
        int [] rowNumber=new int[14];
        for (rowNumber[0]=0;rowNumber[0]<=1;rowNumber[0]++){
            for (rowNumber[1]=0;rowNumber[1]<=1;rowNumber[1]++){
                for (rowNumber[2]=0;rowNumber[2]<=1;rowNumber[2]++){
                    for (rowNumber[3]=0;rowNumber[3]<=1;rowNumber[3]++){
                        for (rowNumber[4]=0;rowNumber[4]<=1;rowNumber[4]++){
                            for (rowNumber[5]=0;rowNumber[5]<=1;rowNumber[5]++){
                                for (rowNumber[6]=0;rowNumber[6]<=1;rowNumber[6]++){
                                    for (rowNumber[7]=0;rowNumber[7]<=1;rowNumber[7]++){
                                        for (rowNumber[8]=0;rowNumber[8]<=1;rowNumber[8]++){
                                            for (rowNumber[9]=0;rowNumber[9]<=1;rowNumber[9]++){
                                                for (rowNumber[10]=0;rowNumber[10]<=1;rowNumber[10]++){
                                                    for (rowNumber[11]=0;rowNumber[11]<=1;rowNumber[11]++){
                                                        for (rowNumber[12]=0;rowNumber[12]<=1;rowNumber[12]++){
                                                            for (rowNumber[13]=0;rowNumber[13]<=1;rowNumber[13]++){
                                                                sum =75;
                                                                int index=0;
                                                                for (int i=0;i<=13;i++){
                                                                    index+=rowNumber[i];
                                                                    sum+=pyramid[i+1][index];                                
                                                                }     
                                                                if (sum>highestSum){
                                                                    highestSum=sum;
                                                                } 
                                                            }
                                                        }
                                                    }
                                                }
                                            }                                               
                                        }
                                    }
                                }
                            }
                        }
                    }           
                }           
            }
        }
        System.out.println(highestSum);
        
    }
}
