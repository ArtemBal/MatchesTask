package Matches;

public class CountMinMatches {

    public int count(int n){
        int nn = 0;
        if(n <= 0){
            System.out.println("Incorrect data entry!");
            System.exit(0);
        }
        if (n == 4) {
            nn = 12;
        }
        if (n < 4) {
            nn = 4 + (n - 1) * 3;
        }
        if (n > 4) {
            int z = n / 4;
            nn = 12 + (z - 1) * 10;
            n = n % 4;
            if (n == 1) {
                nn = nn + 3;
            } if (n == 2) {
                nn = nn + 5;
            } if (n == 3) {
                nn = nn + 8;
            }
        }
        return nn;
    }
}
