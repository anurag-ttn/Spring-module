package org.example;

/*
this code is loosely coupled because even now also the student class is dependent on teacher
class however we do not need to change the student class directly because we created teacher for
student in main class then pass this teacher to student.
 */

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setTid(12);
        t.setName("Anurag");
        Student s = new Student();
        s.setTeacher(t);
        s.setAddress("faridabad");
        s.setSid(100);
        s.setName("Anurag Kundu");
        System.out.println(s);
    }
}