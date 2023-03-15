import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int D = input.nextInt();
        
        for(int i=0;i<D;i++)
        {
            int number = input.nextInt();
            if (number>9)
            {
                System.out.println("0 0");
            }
            else
            {
                int Factorial = 1;
                for(int j=1;j<=number;j++)
                {
                    Factorial*=j;
                }
                System.out.println(Factorial % 100 / 10 + " " + Factorial % 10);
            }
        }
        input.close();
    }
}