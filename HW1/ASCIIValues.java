import java.util.*;
/**
 * write a method toIntArray(String s) that returns an array of the ASCII values of characters in the parameter s
 * 
 * Tam Duong
 * 2/05/14
 */
public class ASCIIValues
{
    public static int[] toIntArray(String s)
    {
        int[] ASCIIValues = new int[s.length()]; 
        for(int i = 0; i < ASCIIValues.length; i++) //cast each characters in string s and assign to array ASCIIValues
            ASCIIValues[i] = (int) s.charAt(i);
       
        return ASCIIValues;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        int[] ASCIIValues = toIntArray(text);
        System.out.println("The ASCII value of this string is:");
        
        //print values for array ASCIIValues
        for(int i = 0; i < ASCIIValues.length; i++)     //ASCIIValues.length not ASCIIValues.length() because this is an array not a string
            System.out.println(ASCIIValues[i]);
    }
}
