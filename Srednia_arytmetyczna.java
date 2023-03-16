import java.util.Scanner;
import java.lang.Math;

class Calculations
{
    static double Arithmetic_Average(int[] numbers, int how_many_numbers)
    {
        int sum = 0;
        for(int number : numbers)
        {
            sum += number;
        }
        double average = (double)sum / (double)how_many_numbers;
        double closest_value = Math.abs((double)numbers[0] - average);
        double closest_number = (double)numbers[0];
        for(int number : numbers)
        {
            if((double)number == average)
                return number;
            else if(Math.abs((double)number - average) < closest_value)
            {
                closest_value = Math.abs((double)number - average);
                closest_number = (double)number;
            }
        }
        return closest_number;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = input.nextInt();
            int[] numbers = new int[n];
            for(int j = 0; j < n; j++)
            {
                numbers[j] = input.nextInt();
            }
            System.out.println((int)Calculations.Arithmetic_Average(numbers, n));
        }
        input.close();
    }
}