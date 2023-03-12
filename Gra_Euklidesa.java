import java.util.Scanner;

class Game
{
    Game(int a, int b)
    {
        while(b !=0)
        {
            int x = a % b;
            a = b;
            b = x;
        }
        System.out.println(a*2);
    }
}

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            Game Euklides = new Game(a,b);
        }
        input.close();
    }
}
