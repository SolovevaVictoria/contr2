package org.example;

import java.util.Comparator;

public class ToyComparator implements Comparator<Toy> {
    private SortType sortType;

    public ToyComparator(SortType sortType) {
        this.sortType = sortType;
    }
    @Override
    public int compare(Toy t1, Toy t2) {

        return sortType == SortType.Ascending ? Integer.compare(t1.getWeight(), t2.getWeight()) :
                Integer.compare(t2.getWeight(), t1.getWeight());
    }
}
