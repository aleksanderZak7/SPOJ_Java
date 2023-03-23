import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Changer
{
    static String change_system(int n,int system)
    {
        List <Character> Results = new ArrayList<>();
        char[] symbols = "0123456789ABCDEF".toCharArray();
        while(n != 0)
        {
            Results.add(symbols[n % system]);
            n /= system;
        }
        String Result = "";
        for(char symbol : Results)
        {
            Result = symbol + Result;
        }
        return Result;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = input.nextInt();
            String hexadecimal_system = Changer.change_system(n,16);
            String eleventh_system = Changer.change_system(n,11);
            System.out.println(hexadecimal_system + " " + eleventh_system);
        }
        input.close();
    }
}