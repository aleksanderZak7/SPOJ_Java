import java.util.Scanner;

public class Dodawanie_liczb_calkowitych {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(a+b+c);
        input.close();
    }
}