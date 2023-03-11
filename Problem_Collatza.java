import java.util.Scanner;

class Collatz
{
    int n = 0;

    void Problem(int x)
    {
        if(x == 1)
            System.out.println(n);
        else if(x%2 == 0)
        {
            n++;
            Problem((x+1)/2);
        }
        else
        {
            n++;
            Problem(3*x+1);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++)
        {
            int s = input.nextInt();
            Collatz solution = new Collatz();
            solution.Problem(s);
        }
        input.close();
    }
}