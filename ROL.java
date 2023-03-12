import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++)
        {
            int size = input.nextInt();
            int[] list = new int[size];
            for(int j=0;j<size;j++)
            {
                list[j] = input.nextInt();
            }
            for(int j=1;j<size;j++)
            {
                if(j == size -1)
                    System.out.println(list[j]+" "+list[0]);
                else
                    System.out.print(list[j]+" ");
            }
        }
        input.close();
    }
}