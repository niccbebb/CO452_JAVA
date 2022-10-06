package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);

        int id = InputReader.getInt("Entre your ID: ");
        System.out.println("Your ID is: " + id);

        double mark = InputReader.getDouble("Enter your mark ");
        System.out.println("your mark is " + mark);

        //This shows how Java works out the perimeter and area of a triangle.
        int length = InputReader.getInt("Enter the length: ");
        int height = InputReader.getInt("Enter the height: ");

        int area = length * height;
        int perimeter = (length + height) *2;

        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);

        //This is how Java works out the Average.
        double total = 0;
        int count = 0;
        while( count < 3)
        {
            total = total + InputReader.getDouble("Enter number : ");
            count++;
        }

        double average = total / (count+1);

        System.out.println("The average is " + average);
    } 
}
