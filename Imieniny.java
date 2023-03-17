import java.util.Scanner;

class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int D = input.nextInt();
        for(int i = 0; i < D; i++)
        {
            int L = input.nextInt();
            int C = input.nextInt();
            if(L == 1)
                System.out.println("TAK");
            else if(C % (L-1) == 0)
                System.out.println("NIE");
            else 
                System.out.println("TAK");
        }
        input.close();
    }
}
