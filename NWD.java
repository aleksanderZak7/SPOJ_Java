import java.util.Scanner;

class Calculations
{
    int NWD(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
}

class Main
{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            Calculations Result = new Calculations();
            System.out.println(Result.NWD(a, b));
        }
        input.close();
    }
}