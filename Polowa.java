import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        for(int i = 0; i < t; i++)
        {
            String string = input.nextLine();
            int string_lenght = string.length();
            String half = string.substring(0, string_lenght/2);
            System.out.println(half);
        }
        input.close();
    }
}