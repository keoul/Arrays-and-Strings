import java.util.*;
public class Binbs
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String B = sc.next();
        
        int i = 0;
        int total = 0;
        while (i < B.length()-2) {
            if (B.substring(i,i+3).equals("010")) 
            {
                total++;
                i+=3;
            } 
            else 
            {
                i++;
            }
        }
        System.out.println(total);
    }
}