import java.util.Scanner;

class BitPermutations{

    public static int getSumOfAllPossibleNumbers(int oneCount, int zeroCount, String binaryString, int num){
    
        if(zeroCount == 0){
            for(int j=0;j<oneCount;j++){
                binaryString += "1";
            }
            return Integer.parseInt(binaryString,2);
        }else if(oneCount == 0){
            for(int i=0;i<zeroCount;i++){
                binaryString += "0";
            }
            return Integer.parseInt(binaryString,2);
        }
        return getSumOfAllPossibleNumbers(oneCount , zeroCount - 1, binaryString + "0",num)+getSumOfAllPossibleNumbers(oneCount - 1, zeroCount, binaryString + "1",num);
    }

     public static void main(String []args){
         
         Scanner sc= new Scanner(System.in);
         int nt= sc.nextInt();
         
         for(int i=1;i<=nt; i++){
            int n= sc.nextInt();
            String binaryString = Integer.toBinaryString(n);
            int c1 = Integer.bitCount(n);
            int c0 = binaryString.length()-c1;
            System.out.println(getSumOfAllPossibleNumbers(c1, c0, "", 0));
         }
     }
}
