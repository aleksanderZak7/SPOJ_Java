import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; i++)
        {
            int l = input.nextInt();
            int k = input.nextInt();
            int[][] table = new int[l][k];
            for(int j = 0; j < l; j++)
            {
                for(int m = 0; m < k; m++)
                {
                    table[j][m] = input.nextInt();
                }
            }
            int[] temp = new int[4];
            temp[0] = table[0][0];
            temp[1] = table[l-1][0];
            temp[2] = table[l-1][k-1];
            temp[3] = table[1][k-1];
            for(int j = 0; j < k - 1; j++)
                table[0][j] = table[0][j+1];
            for(int j = l - 1; j > 0; j--)
                table[j][0] = table[j-1][0];
            for(int j = k - 1; j > 0; j--)
                table[l-1][j] = table[l-1][j-1];
            for(int j = 0; j < l - 1; j++)
                table[j][k-1] = table[j+1][k-1];
            table[1][0] = temp[0];
            table[l-1][1] = temp[1];
            table[l-2][k-1] = temp[2];
            table[0][k-1] = temp[3];
            for(int j = 0; j < l; j++)
            {
                for(int m = 0; m < k; m++)
                {
                    System.out.print(table[j][m] + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }
}