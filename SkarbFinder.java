import java.util.Scanner;
import java.lang.Math;

class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int D = input.nextInt();
        for(int i=0;i<D;i++)
        {
            int North_steps = 0;
            int West_steps = 0;
            int well=0;
            int N = input.nextInt();
            for(int j=0;j<N;j++)
            {
                int direction = input.nextInt();
                int steps = input.nextInt();
                if(direction==0)
                    North_steps += steps;
                else if(direction==1)
                    North_steps-=steps;
                else if(direction==2)
                    West_steps += steps;
                else 
                    West_steps-=steps;
            }
            if(North_steps == 0)
                well += 1;
            if(West_steps == 0)
                well += 1;
            if(well == 2)
                System.out.println("studnia");
            else
            {
                if(North_steps>0)
                    System.out.println("0 "+North_steps);
                else if(North_steps<0)
                System.out.println("1 "+Math.abs(North_steps));
                if(West_steps>0)
                    System.out.println("2 "+West_steps);
                else if(West_steps<0)
                System.out.println("3 "+Math.abs(West_steps));
            }
        }
        input.close();
    }
}