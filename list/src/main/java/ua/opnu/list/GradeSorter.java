package ua.opnu.list;

import java.util.Comparator;

public class GradeSorter implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAvgMark(), s2.getAvgMark());
    }
}

