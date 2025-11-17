package kuis3_ppbo25_1124006_joshsatrionachemya;

import java.util.Scanner;

public class CLIUtil {

    static Scanner sc = new Scanner(System.in);

    public int nextInt() {
        return sc.nextInt();
    }

    public double nextDouble() {
        return sc.nextDouble();
    }

    public boolean nextBoolean() {
        return sc.nextBoolean();
    }

    public String nextLine() {
        return sc.nextLine();
    }

    public int getNumber() throws InvalidInputException{
        int input = nextInt();
        if (input < 1) {
            throw new InvalidInputException();
        }
        return input;

    }
}
