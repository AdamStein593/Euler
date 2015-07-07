package Task014;

class Task014{
    public static void main (String[]args){
        int ChainCount;
        long term;
        int LongestChain=0;
        int LongestChainNum=0;
        
        for (int i=1000000;i>1;i--){
            term=i;
            ChainCount=1;
            while (term>1){
                if (term%2==0){
                    term/=2;
                    
                }
                else if (term%2==1){
                    term=term*3+1;
                    
                }
                ChainCount++;
            }
            if (ChainCount>LongestChain){
                LongestChain=ChainCount;
                LongestChainNum=i;
            }
        }
        System.out.println("LongestChain: "+LongestChain);
        System.out.println("Number: "+LongestChainNum);
        
    }
}