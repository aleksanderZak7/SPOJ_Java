import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] Numbers = new int[n];
        for(int i = 0; i< n; i++)
        {
            Numbers[i] = input.nextInt();
        }
        int index = k;
        for(int i = 0; i < n; i++)
        {  
            if(index == n)
                index = 0;
            System.out.print(Numbers[index]+" ");
            index++;
        }
        input.close();
    }
}