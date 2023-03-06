package P1;

import java.util.Scanner;

public class MagicSquare {
    public static boolean isLegalMagicSquare(String fileName){
        Scanner in=new Scanner(fileName);
        StringBuffer MS=new StringBuffer();
        if(in.hasNext()){
            MS.append(in.next());
        }//处理输入
        String MS1= MS.toString();
        String[] values=MS1.split("\t");
        int sum= values.length;
        Integer[] values1=new Integer[sum];
        int col= (int) Math.sqrt(sum);

        return false;
    }

}
