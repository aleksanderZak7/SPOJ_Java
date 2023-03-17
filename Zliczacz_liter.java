import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alphabet = letters.toCharArray();
        int N = input.nextInt();
        input.nextLine();
        String sentences = "";
        for(int i = 0; i < N; i++)
        {
            String sentence = input.nextLine();
            sentence = sentence.trim();
            sentences += sentence;
        }
        char[] list_of_letters = sentences.toCharArray();
        int how_many_times = 0;
        for(char letter : alphabet)
        {
            if(sentences.contains(""+letter))
            {
                for(char letter_in_sentece : list_of_letters)
                {
                    if(letter == letter_in_sentece)
                        how_many_times++;
                }
                System.out.println(letter+" "+how_many_times);
                how_many_times = 0;
            }
        }
        input.close();
    }
}