import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celcius = 0;
        String trash ="";

        System.out.println("enter the temprature in clecius to convert to fahrenheit: ");

        if (in.hasNextDouble())
        {
            celcius = in.nextDouble();
            in.nextLine(); // MUST CLEAR BUFFER AFTER READING A NUMBER
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }
        celcius = in.nextDouble();

        System.out.println("The temprature in Fahrenheit is " + (celcius * 1.8 + 32));
        //(fahrenheit-32)*5/9




    }
}