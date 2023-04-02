import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        for(int i = 0; i < t; i++)
        {
            String Pesel = input.nextLine();
            char[] PESEL = Pesel.toCharArray();
            int sum = (int)PESEL[0] * 1 + (int)PESEL[1] * 3 + (int)PESEL[2] * 7 + (int)PESEL[3] * 9 + (int)PESEL[4] * 1 + (int)PESEL[5] * 3 + (int)PESEL[6] * 7 + (int)PESEL[7] * 9 + (int)PESEL[8] * 1 + (int)PESEL[9] * 3 + (int)PESEL[10] * 1;
            String SUM = sum + "";
            if(SUM.charAt(SUM.length() - 1) == '0')
                System.out.println("D");
            else
                System.out.println("N");
        }
        input.close();
    }
}