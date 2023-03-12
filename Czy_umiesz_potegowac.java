import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int D = input.nextInt();
        for(int i=0;i<D;i++)
        {
            int a = input.nextInt() % 10;
            int b = input.nextInt() % 4;
            if (b == 0) 
                b = 4;
            int result = 1;
            for (int j = 0; j < b; j++) 
                result = (result * a) % 10;
            System.out.println(result);
        }
        input.close();
    }
}