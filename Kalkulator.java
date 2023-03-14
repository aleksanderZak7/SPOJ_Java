import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try
            {
                char symbol = input.next().charAt(0);
                int a = input.nextInt();
                int b = input.nextInt();
                int result = 0;
                switch(symbol)
                {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    case '%':
                        result = a % b;
                        break;
                }
                System.out.println(result);
            }
            catch(Exception ex)
            {
                break;
            }
        }
        input.close();
    }
}
