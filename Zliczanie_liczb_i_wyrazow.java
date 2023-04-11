import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine())
        {
            String[] data = input.nextLine().split(" ");
            int numbers = 0;
            int words = 0;
            for(String word : data)
            {
                int number = 0;
                char[] letters_or_numbers = word.toCharArray();
                for(char symbol : letters_or_numbers)
                {
                    int tmp = Character.getNumericValue(symbol);
                    String string_tmp = "" + tmp;
                    String string_symbol = "" + symbol;
                    if(string_symbol.equals(string_tmp))
                        number++;
                    else
                    {
                        words++;
                        break;
                    }
                    if(number == word.length())
                        numbers++;
                }   
            }
            System.out.println(numbers + " " + words);
        }
        input.close();
    }
}