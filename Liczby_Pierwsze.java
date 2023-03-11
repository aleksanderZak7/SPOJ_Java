import java.util.Scanner;

class Main
{
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        Number number = new Number();
        int n = input.nextInt();
        
        for(int i=0;i<n;i++)
        {
            number.value = input.nextInt();
            if(number.value<2)
                System.out.println("NIE");
            else
                System.out.println(number.Prime_number());
        }
        input.close();
    }
}

class Number
{
    int value;

    String Prime_number()
    {
        for(int j=2;j<this.value/2+1;j++)
        {
            if (this.value%j==0)
                return "NIE";
        }
        return "TAK";
    }
}