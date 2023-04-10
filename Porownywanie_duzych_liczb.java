import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try
            {
                String[] data = input.nextLine().split(" ");
                if(data[1].equals("=="))
                {
                    if(data[0].equals(data[2]))
                        System.out.println(1);
                    else
                        System.out.println(0);
                }
                else if(data[1].equals("!="))
                {
                    if(!data[0].equals(data[2]))
                        System.out.println(1);
                    else
                        System.out.println(0);
                }
                else if(data[1].equals(">="))
                {
                    if(data[0].length() > data[2].length() || data[0].equals(data[2]))
                        System.out.println(1);
                    else
                    {
                        if(data[0].length() == data[2].length())
                        {
                            char[] left_number = data[0].toCharArray();
                            char[] right_number = data[2].toCharArray();
                            for(int i = 0; i < data[0].length(); i++)
                            {
                                if((int)(left_number[i]) > (int)(right_number[i]))
                                {
                                    System.out.println(1);
                                    break;
                                }
                                else if((int)(left_number[i]) < (int)(right_number[i]))
                                {
                                    System.out.println(0);
                                    break;
                                }
                            }
                        }
                        else
                            System.out.println(0);
                    }
                }
                else if(data[1].equals("<="))
                {
                    if(data[0].length() < data[2].length() || data[0].equals(data[2]))
                        System.out.println(1);
                    else
                    {
                        if(data[0].length() == data[2].length())
                        {
                            char[] left_number = data[0].toCharArray();
                            char[] right_number = data[2].toCharArray();
                            for(int i = 0; i < data[0].length(); i++)
                            {
                                if((int)(left_number[i]) < (int)(right_number[i]))
                                {
                                    System.out.println(1);
                                    break;
                                }
                                else if((int)(left_number[i]) > (int)(right_number[i]))
                                {
                                    System.out.println(0);
                                    break;
                                }
                            }
                        }
                        else
                            System.out.println(0);
                    }
                }
            }
            catch(Exception ex)
            {
                break;
            }
        }
        input.close();
    }
}