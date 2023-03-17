import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int C = input.nextInt();
        input.nextLine();
        for(int i = 0; i < C; i++)
        {
            String string = input.nextLine();
            int index_of_first_letter = 0;
            char[] letters = string.toCharArray();
            char reapeted_letter = '0';
            int how_many_times = 1;
            for(char letter : letters)
            {
                if(index_of_first_letter == 0)
                {
                    index_of_first_letter++;
                    reapeted_letter = letter;
                    System.out.print(letter);
                }
                else
                {
                    if(letter == reapeted_letter)
                    {
                        how_many_times++;
                    }
                    else
                    {
                        if(how_many_times > 2)
                        {
                            System.out.print(how_many_times);
                        }
                        else if(how_many_times > 1)
                        {
                            System.out.print(reapeted_letter);
                        }
                        how_many_times = 1;
                        reapeted_letter = letter;
                        System.out.print(letter);
                    }
                }
            }
            if(how_many_times > 2)
            {
                System.out.print(how_many_times);
            }
            else if(how_many_times > 1)
            {
                System.out.print(reapeted_letter);
            }
            System.out.println();
        }
        input.close();
    }
}