import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine())
        {
            String data = input.nextLine();
            String letter = data.substring(0,1);
            String sentence = data.substring(2);
            while(sentence.contains(letter))
                sentence = sentence.replace(letter, "");
            System.out.println(sentence);
        }
        input.close();
    }
}
