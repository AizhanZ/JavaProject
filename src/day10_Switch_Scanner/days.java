package day10_Switch_Scanner;

public class days {
/*
2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF

			precondition: valid number for the day
 */
    public static void main(String[] args) {
        int num = 9;
        String result = "";

        if(num > 0 && num < 8) {

            if(num == 1){
                result = "Monday";
            } else if (num == 2){
                result = "Tuesday";
            } else if (num == 3){
                result = "Wednesday";
            } else if (num == 4){
                result = "Thursday";
            } else if (num == 5){
                result = "Friday";
            } else if (num == 6){
                result = "Saturday";
            } else {
                result = "Sunday";
            }

        } else {
            result = "Invalid";
        }

        String result2 = "";

        if(num > 0 && num < 8){}else{
            result = "Invalid";
        }

        result2 = (num == 1) ? "Monday" : (num == 2) ? "Tuesday"
                : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday"
                : (num == 5) ? "Friday" : (num == 6) ? "Saturday"
                : (num == 7) ? "Sunday": "Invalid";

        System.out.println(result);
        System.out.println(result2);

        //result = (num == 1) ? "Monday"


    }
}
