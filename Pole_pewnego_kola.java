import java.util.Scanner;
import java.lang.Math;

class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double d = input.nextDouble();
        double S = (Math.PI * (Math.pow(r,2) - Math.pow(d/2,2))) * 100;
        S = Math.round(S);
        System.out.println(S/100);
        input.close();
    }
}