package kuis3_ppbo25_1124006_joshsatrionachemya;

public class InvalidInputException extends Exception{

    public InvalidInputException(){
        super("Input harus berupa angka antara 1 dan 6");
    }
    public static void validateInput(int input) throws InvalidInputException {
        if(input < 1 || input > 6) {
            throw new InvalidInputException();
        }
    }
}
