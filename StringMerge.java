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
            String strings = input.nextLine();
            String[] data = strings.split(" ");
            String first = data[0];
            String second = data[1];
            int size;
            String output = "";
            if(first.length() < second.length())
                size = first.length();
            else 
                size = second.length();
            char[] first_letters = first.toCharArray();
            char[] second_letters = second.toCharArray();
            for(int j = 0; j < size; j++)
            {
                output += "" + first_letters[j] + second_letters[j];
            }
            System.out.println(output);
        }
        input.close();
    }
}