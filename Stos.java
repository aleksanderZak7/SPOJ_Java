import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] stack = new int[10];
        int index = -1;
        while(true)
        {
            try
            {
                char Symbol = input.next().charAt(0);
                if(Symbol == '+')
                {
                    int Number = input.nextInt();
                    index++;
                    if(index >= 10)
                    {
                        System.out.println(":(");
                    }
                    else
                    {
                        stack[index] = Number;
                        System.out.println(":)");
                    }
                }
                else if(Symbol == '-')
                {
                    if(index >= 10)
                    {
                        index = 9;
                    }
                    if(index == -1)
                    {
                        System.out.println(":(");
                    }
                    else
                    {
                        System.out.println(stack[index]);
                        index--;
                    }
                }
            }
            catch(Exception ex)
            {
                break;
            }
        }
        input.close();
    }
}
