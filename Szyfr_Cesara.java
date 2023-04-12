import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while(input.hasNextLine())
        {
            char[] sentece = input.nextLine().toCharArray();
            for(int i = 0; i < sentece.length; i++)
            {
                if(sentece[i] != ' ')
                {
                    int index = alphabet.indexOf(sentece[i]);
                    sentece[i] = alphabet.charAt((index + 3) % alphabet.length());
                }
            }
            String output = "";
            for(char letter : sentece)
                output += letter;
            System.out.println(output);
        }
        input.close();
    }
}