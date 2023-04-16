import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        long sumOfTests = 0;
        while(true)
        {
            try
            {
                String[] data = input.nextLine().split(" ");
                long sum = 0;
                for(String number : data)
                {
                    sum += Integer.parseInt(number);
                }
                System.out.println(sum);
                sumOfTests += sum;
            }
            catch(Exception ex)
            {
                if(sumOfTests < Math.pow(10, 15))
                    System.out.println(sumOfTests);
                break;
            }
        }
        input.close();
    }
}