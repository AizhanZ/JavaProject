package Replit;
/*
HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers).
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
Some of the codes and their meanings are listed below:

STATUS CODES
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable

Given an int variable status, write a switch statement that prints out, on a line by itself,
the appropriate label from the above list based on status. Otherwise, print warning message: "Invalid status code!".

Example:

Display message: "Enter status code:"
input: 200
Display message: "OK"
 */
import java.util.Scanner;

public class R49_HTTPStatusCode {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter status code:");
        int status = scan.nextInt();

        switch (status) {
            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanently");
                break;
            case 303:
                System.out.println("See Other");
                break;
            case 304:
                System.out.println("Not Modified");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorised");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 410:
                System.out.println("Gone");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            case 503:
                System.out.println("Service Unavailable");
                break;

            default:
                System.out.println("Invalid status code!");
                break;
        }
        /* Muhtar's Code
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int status = scan.nextInt();
        //WRITE YOUR CODE HERE

        String result = "";
        switch (status) {
            case 200:
                result = "Ok";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            case 301:
                result = "Moved Permanently";
                break;
            case 303:
                result = "See Other";
                break;
            case 304:
                result = "Not Modified";
                break;
            case 307:
                result = "Temporary Redirected";
                break;
            case 400:
                result = "Bad Request";
                break;
            case 401:
                result = "Unauthorized";
                break;
            case 403:
                result = "Forbidden";
                break;
            case 404:
                result = "Not Found";
                break;
            case 410:
                result = "Gone";
                break;
            case 500:
                result = "Internal Server Error";
                break;
            case 503:
                result = "Service Unavailable";
                break;
            default:
                result = "Invalid status code!";
        }

        System.out.println(result);

         */
    }

}
