package org.example;

public class Student {
    private int sid;
    private String name;
    private String address;
    private Teacher teacher = new Teacher();
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(int tid , String name) {
        teacher.setName(name);
        teacher.setTid(tid);
    }


    public String toString(){
        return "name of student : "+name+"\nid : "+sid+"\naddress : "+address+teacher;
    }
}
