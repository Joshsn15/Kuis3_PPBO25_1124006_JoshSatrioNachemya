package kuis3_ppbo25_1124006_joshsatrionachemya;
import java.util.List;
import java.util.Collections;



public class GenericUtil<T extends Number & Comparable<T>> {
    
    public List<T> sort(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
