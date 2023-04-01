import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int D = input.nextInt();
        for(int i = 0; i < D; i++)
        {
            int N = input.nextInt();
            List<Integer> Points = new ArrayList<Integer>();
            for(int j = 0; j < N; j++)
                Points.add(input.nextInt());
            int max = Points.get(0);
            for(int Point : Points)
            {
                if(Point > max)
                    max = Point;
            }
            int how_many = 0;
            while(Points.contains(max))
            {
                how_many++;
                Points.remove(Points.indexOf(max));
            }
            Collections.sort(Points);
            String output = "";
            for(int j = 0; j < how_many; j++)
                output += max + " ";
            for(int Point : Points)
                output += Point + " ";
            System.out.println(output);
        }
        input.close();
    }
}