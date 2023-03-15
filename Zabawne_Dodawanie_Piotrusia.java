import java.util.Scanner;

class Palindrome
{
    static int trias;
    static String judge(String number)
    {
        String reverse_number = "";
        for(int j = 0; j < number.length(); j++)
        {
            char ch = number.charAt(j);
            reverse_number = ch + reverse_number;
        }
        if(number.equals(reverse_number))
        {
            return number;
        }
        else
        {
            int int_number = Integer.parseInt(number);
            int int_reverse_number = Integer.parseInt(reverse_number);
            trias++;
            return judge((int_number + int_reverse_number) + "");
        } 
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        for(int i = 0; i < t; i++)
        {
            String Number = input.nextLine();
            Palindrome.trias = 0;
            System.out.println(Palindrome.judge(Number) + " " + Palindrome.trias);
        }
        input.close();
    }
}