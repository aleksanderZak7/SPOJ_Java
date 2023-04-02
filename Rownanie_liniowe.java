import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(b == c && a == 0)
            System.out.println("NWR");
        else if(a == 0)
            System.out.println("BR");
        else
        {
            double Result = Math.round(((c - b) / a) * 100.00) / 100.00;
            if((int)Result == Result)
                System.out.println((int)Result + ".00");
            else
                System.out.println(Result);
        }
        input.close();
    }
}