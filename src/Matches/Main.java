package Matches;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of squares (n): ");
        int n = in.nextInt();
        CountMinMatches matches = new CountMinMatches();
        System.out.println("Minimum number of Matches required: " + matches.count(n));
    }
}
