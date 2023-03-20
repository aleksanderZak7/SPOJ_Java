import java.util.Scanner;
import java.util.Arrays;
import java.lang.Comparable;

class Point implements Comparable
{
    String name;
    int distance;

    Point(String name, int x, int y)
    {
        this.name = name;
        this.distance = (x * x) + (y * y);
    }

    @Override
    public int compareTo(Object t)
    {
        Point second_Point = (Point) t;
        if(this.distance > second_Point.distance)
            return 1;
        else if(this.distance < second_Point.distance)
            return -1;
        else 
            return 0;
    }

    @Override
    public String toString()
    {
        return this.name;
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
            input.nextLine();
            Point[] points = new Point[n];
            for(int j = 0; j < n; j++)
            {
                String name = input.nextLine();
                String[] data = name.split(" ");
                int x = Integer.parseInt(data[1]);
                int y = Integer.parseInt(data[2]);
                points[j] = new Point(name, x, y);
            }
            Arrays.sort(points);
            for(Point point : points)
            {
                System.out.println(point);
            }
        }
        input.nextLine();
        input.close();
    }
}