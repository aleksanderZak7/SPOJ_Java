import java.util.Scanner;

class Main
{
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static int letterMaxIndex(char[] word)
    {
        int index = 0;

        for(char letter : word)
        {
            if(alphabet.indexOf(letter) > index)
                index = alphabet.indexOf(letter);
        }
        return index;
    }

    static int letterMinIndex(char[] word)
    {
        int index = alphabet.length() - 1;

        for(char letter : word)
        {
            if(alphabet.indexOf(letter) < index)
                index = alphabet.indexOf(letter);
        }
        return index;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numberOfWords = input.nextInt();
        input.nextLine();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = input.nextLine().toCharArray();
            System.out.println(letterMaxIndex(word) - letterMinIndex(word));
        }
        input.close();
    }
}