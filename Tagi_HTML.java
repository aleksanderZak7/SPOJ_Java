import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine())
        {
            Boolean big_letters = false;
            String output = "";
            String line = input.nextLine();
            char[] words = line.toCharArray();
            for(int i = 0; i < words.length; i++)
            {
                char word = words[i];
                String symbol = "" + word;
                if(symbol.equals("<"))
                {
                    big_letters = true;
                    output += symbol;
                    continue;
                }
                else if(symbol.equals(">"))
                {
                    big_letters = false;
                    output += symbol;
                    continue;
                }
                if(big_letters)
                {
                    output += symbol.toUpperCase();
                    continue;
                }
                output += symbol;
            }
            System.out.println(output);
        }
        input.close();
    }
}