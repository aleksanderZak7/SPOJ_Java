import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            int[] numbers = new int [n];
            int index = 0;
            for(int j=1;j<=n;j++)
            {
                if(j%x==0 && j%y!=0)
                {
                    numbers[index] = j;
                    index++;
                }
            }
            for(int number : numbers)
            {
                if(number!=0)
                    System.out.print(number + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
