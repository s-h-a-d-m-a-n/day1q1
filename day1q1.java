//02.12.2025 by shadman...
import java.util.*;
import java.io.File;
public class day1q1
{   public static void main(String args[])throws Exception
    {
        Scanner in=new Scanner(new File("doc.txt"));
        int pass = 0, x, y, sum = 50; String s;                           //x = direction (l=-, r=+)...y = value....
        while(in.hasNextLine())
        {   s = in.nextLine();
            s.trim();
            x = s.charAt(0) == 'L' ? -1 : +1;
            s = s.substring(1);
            y = Integer.parseInt(s);
            x = x * y;
            sum = sum + x;
            sum = (sum < 0)? (sum+100) : (sum > 99)? (sum-100) : sum;
            pass = (sum == 0)? (pass+1) : pass; 
        }
        System.out.println(pass);
        in.close();
    }
}
