import java.util.Scanner;

class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        for(int i = 0; i < N; i++)
        {
            char[] data = input.nextLine().toCharArray();
            int result = 0;
            boolean add = false;
            boolean subtraction = false;
            for(char symbol : data)
            {
                if(symbol == '+')
                    add = true;
                else if(symbol == '-')
                    subtraction = true;
                else
                    if(add)
                    {
                        result += Character.getNumericValue(symbol);
                        add = false;
                    }
                    else if(subtraction)
                    {
                        result -= Character.getNumericValue(symbol);
                        subtraction = false;
                    }
                    else
                        result = Character.getNumericValue(symbol);
            }
            System.out.println(result);
        }
        input.close();
    }
}
