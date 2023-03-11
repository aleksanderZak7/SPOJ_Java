import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int day = 86400;
        int n = input.nextInt();
        for(int i=0;i<n;i++)
        {
            double Result = 0;
            int N = input.nextInt();
            int M = input.nextInt();
            for(int j=0;j<N;j++)
            {
                int Cookie_Time = input.nextInt();
                Result += Math.floor(day/Cookie_Time);
            }
            System.out.println((int)Math.ceil(Result/M));
        }
        input.close();
    }
}
