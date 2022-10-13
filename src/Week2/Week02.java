package Week2;

import helpers.InputReader;

public class Week02 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        String name = InputReader.getString("Enter your name: ");
        System.out.println("Hello " + name);

        int age = InputReader.getInt("Enter your age: ");
        
        if (age >= 18)
        {
            System.out.println("You are 18 or over. ");
        } 
        else
        {
            System.out.println("You're under the age of 18. ");
        }

        String grade = InputReader.getString("Enter your mark: ");

        switch(grade)
        {
        case "A" : System.out.println("This is a 1st"); break; 
        case "B" : System.out.println("This is a 2:1"); break; 
        case "C" : System.out.println("This is a 2:2"); break;
        case "D" : System.out.println("This is a pass"); break; 
        case "F" : System.out.println("This is a failed attempt"); break;
        default : System.out.println("This is an invalid mark");
        }
    }     
}
