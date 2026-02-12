package com.StudentRackTracker;

import java.util.*;

public class StudentService {

    public List<Student> addStudents(List<Student> list, Student s) {
        list.add(s);
        return list;
    }

    public List<Student> getTopN(List<Student> list, int n) {

        Set<Student> set = new TreeSet<>((s1, s2) -> {
            if (s1.getTotal() != s2.getTotal()) {
                return s2.getTotal() - s1.getTotal(); // total DESC
            }
            return s1.getName().compareTo(s2.getName()); // name ASC
        });

        set.addAll(list);

        List<Student> result = new ArrayList<>();
        int count = 0;

        for (Student s : set) {
            if (count == n) break;
            result.add(s);
            count++;
        }

        return result; // ✅ important
    }
}
