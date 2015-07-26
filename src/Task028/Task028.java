/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task028;

/**
 *
 * @author Adam
 */
public class Task028 {

    /**
     * @param args the command line arguments
     */
        public static int [] [] grid =new int[1001+2][1001+2];       
        public static int positionX=(grid.length+1)/2-1;
        public static int positionY=(grid.length+1)/2-1;
        
    public static void main(String[] args) {
        int count=1;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid.length;j++){
                grid[i][j]=0;
            }               
        }
        grid [positionY][positionX]=count;
        count++;
        int travelling=1; //1 = right, 2= down, 3=left, 4=up
        while (count<=(grid.length-2)*(grid.length-2)){
            move(travelling);
            grid [positionY][positionX]=count;
            travelling=direction(travelling);
            count++;          
            
        }
        int sum=-1;
        for (int i=0;i<grid.length;i++){
            sum+=grid[i][i];
            sum+=grid[grid.length-1-i][i];
        }
        System.out.println(sum);
    }
    
    public static void move(int travelling){
        switch(travelling){
            case 1:positionX++;break;
            case 2:positionY--;break;
            case 3:positionX--;break;
            case 4:positionY++;break;
        }
    }
    public static int direction(int travelling){
        int touching=0;
        if (grid[positionY][positionX+1]!=0){
            touching++;
        }
        if (grid[positionY][positionX-1]!=0){
            touching++;
        }
        if (grid[positionY+1][positionX]!=0){
            touching++;
        }
        if (grid[positionY-1][positionX]!=0){
            touching++;
        }
        if (touching==1){
            if (travelling==4){
                travelling=1;
            }
            else{
                travelling++;
            }
        }
        return travelling;
    }
}
