package kuis3_ppbo25_1124006_joshsatrionachemya;

import java.util.List;

public class EmptyListException extends Exception {
    
    public EmptyListException(){
        super("List is empty");
    }

    public EmptyListException(List<?> list) throws EmptyListException{
        if(list.isEmpty()) {
            throw new EmptyListException();
        }
    }
}
