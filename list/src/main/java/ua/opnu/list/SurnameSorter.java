package ua.opnu.list;

import java.util.Comparator;

public class SurnameSorter implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getLastName().compareTo(s2.getLastName());
    }
}
