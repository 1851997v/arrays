import java.util.Scanner;

/**
 * Created by TEJA on 6/24/2017.
 */
public class array3ex {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        int[] a = getIntegers(5);
        for(int i=0; i<a.length; i++)
        {

            System.out.println("element is" + i +",typed value was" + a[i]);
        }
    }

    public static int[] getIntegers(int number)
    {

        System.out.println("enter" + number + "integer values");
        int[] values = new int[number];
        for (int i=0;i<values.length;i++)
        {

            values[i]=scanner.nextInt();

        }
return values;

    }

}
