package org.example;

/*

this code is highly coupled as the student class need teacher class and if we introduce any change like
add or remove any fields in teacher then we must change our student class to correctly use teacher in student
thus there is high coupling between teacher and student class.

 */
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setSid(1);
        s.setName("Anurag Kundu");
        s.setAddress("faridabad");
        s.setTeacher(1100,"Anurag");
        System.out.println(s);
    }
}