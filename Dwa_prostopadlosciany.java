import java.util.Scanner;
import java.util.Arrays;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] first_one = new int[3];
        for(int i = 0; i < 3 ; i++)
        {
                first_one[i] = input.nextInt();
        }
        int[] second_one = new int[3];
        for(int i = 0; i < 3 ; i++)
        {
            second_one[i] = input.nextInt();
        }
        Arrays.sort(first_one);
        Arrays.sort(second_one);
        if(first_one[0] <= second_one[0] && first_one[1] <= second_one[1] && first_one[2] <= second_one[2])
            System.out.println("tak");
        else if(first_one[0] >= second_one[0] && first_one[1] >= second_one[1] && first_one[2] >= second_one[2])
            System.out.println("tak");
        else 
            System.out.println("nie");
        input.close();
    }
}