package college_lab;

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int time = 0,hour = 0, min = 0,sec = 0;
    System.out.println("Enter a time in seconds:");
    Scanner ob=new Scanner(System.in);
     time =ob.nextInt();
    hour = time/3600;
    time = time%3600;
    min = time/60;
    time = time%60;
    sec = time;
    System.out.println("\nThe time is: "+hour+":"+min+":"+sec);
    }
}