import java.util.Scanner;

class Main
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++)
        {
            int size = input.nextInt();
            int[] list = new int[size];
            int[] reverse_list = new int[size];
            for(int j=0;j<size;j++)
            {
                list[j]=input.nextInt();
            }
            for(int number : list)
            {
                reverse_list[size-1] = number;
                size -= 1;
            }
            for(int number : reverse_list)
            {
                System.out.print(number+ " ");
            }
            System.out.print("\n");
        }
        input.close();
    }
}