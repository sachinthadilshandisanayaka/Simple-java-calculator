package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static double x,y;

    public static void main(String args[]) throws IOException {

        Get_value object = new Get_value();
        object.setValues();
        x = object.getValues(0);
        y = object.getValues(1);

        if ( x != 0 || y != 0 ) {
            int userinput;
            Scanner scanner = new Scanner(System.in);
            System.out.println("values are:"+x +" and "+y);
            System.out.print("1 - multiplication (*) \n2 - subtraction (-) \n3 - division (/) \n4 - addition (+)" +
                    "\nselect:");
            userinput = scanner.nextInt();

            switch (userinput) {
                case 1:
                    System.out.println("mutiplication: " +x+"*"+y+" = "+(x*y));
                    break;
                case 2:
                    System.out.println("subtraction: " +x+"-"+y+" = "+(x-y));
                    break;
                case 3:
                    System.out.println("division: " +x+"/"+y+" = "+(x/y));
                    break;
                case 4:
                    System.out.println("addition: " +x+"+"+y+" = "+(x+y));
                    break;
                default:
                    System.out.println("Enter number is invalid!");
                    break;
            }
        } else {
            System.out.println("Can not do the oparation using existing values!");
            return;
        }
    }
}