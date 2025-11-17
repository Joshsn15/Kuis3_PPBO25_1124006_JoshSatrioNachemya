package kuis3_ppbo25_1124006_joshsatrionachemya;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StatisticList<T extends Number> {
    private List<T> list = new ArrayList<>();
    // private GenericUtil util = new GenericUtil<>();
    

    public void add(T value) throws EmptyListException {
        if (value.doubleValue() < 0) {
            throw new EmptyListException();
        }
        list.add(value);
    }

    public List<T> getList() {
        return list;
    }

    public double getAverage() throws EmptyListException {
        double hasilDouble = 0;
        if (list == null || list.isEmpty()) {
            throw new EmptyListException();
        }
        for (int i = 0; i < list.size(); i++) {
            hasilDouble += list.get(i).doubleValue();
        }
        return hasilDouble / list.size();
    }

    public T getMin() throws EmptyListException {
        if (list == null || list.isEmpty()) {
            throw new EmptyListException();
        }
        list.sort((Comparator<? super T>) list);
        return list.getFirst();

    }

    public T getMax(List<T> list) throws EmptyListException {
        if (list == null || list.isEmpty()) {
            throw new EmptyListException();
        }
        list.sort((Comparator<? super T>) list);
        return list.getLast();

    }

    public double getMedian(List<T> list) throws EmptyListException {
        if (list == null || list.isEmpty()) {
            throw new EmptyListException();
        }
        GenericUtil util = new GenericUtil<>();
        util.sort(list);
        int size = list.size();
        return list.get(size / 2).doubleValue();

    }
}
