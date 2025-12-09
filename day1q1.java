import java.util.*;
import java.io.File;
public class day1q1
{   public static void main(String args[])throws Exception
    {
        Scanner in=new Scanner(new File("ans.txt"));
        int password = 0, rotation, value, sum = 50; String subString;                          
        while(in.hasNextLine())
        {   subString = in.nextLine();
            subString.trim();
            rotation = subString.charAt(0) == 'L' ? -1 : +1;
            subString = subString.substring(1);
            value = Integer.parseInt(subString);
            rotation = rotation * value;
            sum = (sum + rotation) % 100;
            if (sum < 0) sum += 100;        
            if (sum == 0) password++; 
        }
        System.out.println(password);
        in.close();
    }
}
