import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine())
        {
            char[] letters =input.nextLine().toCharArray();
            String word = "";
            for(int i = letters.length - 1; i >= 0; i--)
            {
                word += letters[i];
            }
            System.out.println(word);
        }
        input.close();
    }
}