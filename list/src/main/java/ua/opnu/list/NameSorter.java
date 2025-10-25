package ua.opnu.list;

import java.util.Comparator;

public class NameSorter implements Comparator<Student> {

    private boolean order;

    public NameSorter() {
    }

    public NameSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return order ? s1.getName().compareTo(s2.getName())
                : s2.getName().compareTo(s1.getName());
    }
}