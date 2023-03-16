import java.util.Scanner;

class BMI_status
{
    static void list_of_people(String type, String[] people, int index)
    {
        System.out.println(type);
        for(int i = 0; i < index; i++)
        {
            System.out.println(people[i]);
        }
        System.out.println();
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        String[] Underweight = new String[t];
        int Underweight_index = 0;
        String[] Optimal = new String[t];
        int Optimal_index = 0;
        String[] Overweight = new String[t];
        int Overweight_index = 0;
        for(int i = 0; i < t; i++)
        {
            String Data = input.nextLine();
            String[] Information = Data.split(" ");
            String Name = Information[0];
            double Mass = Double.parseDouble(Information[1]);
            double Height = Double.parseDouble(Information[2]) / 100;
            double BMI = Mass / (Height*Height);
            if(BMI < 18.5)
            {
                Underweight[Underweight_index] = Name;
                Underweight_index++;
            }
            else if(BMI >= 18.5 && BMI < 25)
            {
                Optimal[Optimal_index] = Name;
                Optimal_index++;
            }
            else
            {
                Overweight[Overweight_index] = Name;
                Overweight_index++;
            }
        }
        BMI_status.list_of_people("niedowaga",Underweight,Underweight_index);
        BMI_status.list_of_people("wartosc prawidlowa", Optimal,Optimal_index);
        BMI_status.list_of_people("nadwaga", Overweight,Overweight_index);
        input.close();
    }
}