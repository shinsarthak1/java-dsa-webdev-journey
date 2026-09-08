package Intermediate;

import java.util.Scanner;

public class NcrNpr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = 1;
        int rfact = 1;
        int nrfact = 1;

        for(int i=1; i<=n; i++){
            nfact *= i;
        }
        for (int i = 1; i <= r; i++) {
            rfact *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            nrfact *= i;
        }

        int nPr = nfact / nrfact;
        int nCr = nfact / (rfact * nrfact);

        System.out.println("nPr = " + nPr);
        System.out.println("nCr = " + nCr);

    }
}
