package HW;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month= scan.next();

        if(month.equals("January")||month.equals("February")||month.equals("December")) {
            System.out.println("Your were born in winter");
        }else if(month.equals("March")||month.equals("April")||month.equals("May")) {
            System.out.println("You were born in spring");
        } else if (month.equals("June")||month.equals("July")||month.equals("August")) {
            System.out.println("You were born in summer");
        } else if (month.equals("September")||month.equals("October")||month.equals("November")){
            System.out.println("You were born in fall");

        }
    }

    }

