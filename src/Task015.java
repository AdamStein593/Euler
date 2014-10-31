class Task015{
    public static void main (String[]args){
        long [][] grid = new long[21][21];
        String OutputGrid="";
        for (int x=0;x<=20;x++){
            for (int y=0;y<=20;y++){
                grid [y][x]=0;
            }
        }
        
        for (int x=0;x<=20;x++){
            grid [0][x]=1;
        }
        
        for (int y=0;y<=20;y++){
            grid [y][0]=1;
        }
        
        for (int x=1;x<=20;x++){
            for (int y=1;y<=20;y++){
                grid [y][x]=grid [y-1][x]+grid[y][x-1];
            }
        }
        
      
        System.out.println(grid[20][20]);
    }
}