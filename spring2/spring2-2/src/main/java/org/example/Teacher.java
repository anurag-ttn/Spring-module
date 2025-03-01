package org.example;

public class Teacher {
    private int tid;
    private String name;

    public void setTid(int id){
        this.tid=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getTid(){
        return tid;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "\nname of teacher : "+name+"\nteacher id : "+tid;
    }

}
