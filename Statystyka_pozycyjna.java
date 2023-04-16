import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            List<Integer> sortedNumbers = new ArrayList<>();
            int j = 0;
            try
            {
                String data[] = input.nextLine().split(" ");
                for(int i = 0; i < data.length; i++)
                {
                    if(i == 0)
                        j = Integer.parseInt(data[i]) - 1;
                    else 
                    {
                        if(sortedNumbers.contains(Integer.parseInt(data[i])))
                            continue;
                        sortedNumbers.add(Integer.parseInt(data[i]));
                    }
                }
                Collections.sort(sortedNumbers,Collections.reverseOrder());
                try
                {
                    System.out.println(sortedNumbers.get(j));
                }
                catch(Exception ex)
                {
                    System.out.println("-");
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