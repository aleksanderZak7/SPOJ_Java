import java.util.Scanner;
import java.lang.Math;

class Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; i++)
        {
            int index = 0;
            int n = input.nextInt();
            int[] list = new int[n];
            for(int j = 0; j < n; j++)
            {
                list[j] = input.nextInt();
            }
            int[] sorted_list = new int[n];
            for(int j = 1; j < n; j++)
            {
                if(j != 0 && j % 2 != 0)
                {
                    sorted_list[index] = list[j];
                    index++;
                }
            }
            index = 0;
            int odd = Math.floorDiv(n, 2);
            for(int j = 0; j < n; j++)
            {
                if(j==0 || j % 2 == 0)
                {
                    sorted_list[odd + index] = list[j];
                    index++;
                }
            }
            for(int number : sorted_list)
            {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        input.close();
    }
}