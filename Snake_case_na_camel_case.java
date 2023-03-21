import java.util.Scanner;

class Main
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String Snake_case = input.nextLine();
        String Camel_case = "";
        boolean underscore = false;
        for(int i = 0; i < Snake_case.length(); i++)
        {
            char letter = Snake_case.charAt(i);
            if(underscore)
            {
                String Upper_letter = ""+letter;
                Camel_case += Upper_letter.toUpperCase();
                underscore = false;
                continue;
            }
            if(letter == '_')
            {
                underscore = true;
                continue;
            }
            Camel_case += letter;
        }
        System.out.println(Camel_case);
        input.close();
    }
}