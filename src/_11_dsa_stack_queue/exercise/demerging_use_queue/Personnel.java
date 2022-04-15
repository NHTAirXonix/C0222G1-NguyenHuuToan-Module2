package _11_dsa_stack_queue.exercise.demerging_use_queue;

import java.util.Date;

public class Personnel implements Comparable<Personnel> {
    private String name;
    private boolean gender = true;
    private int age;
    private Date date;

    public Personnel() {
    }

    public Personnel(String name, boolean gender, Date date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Personnel {" +
                "name = '" + name + '\'' +
                ", gender = " + gender +
                ", date = " + date +
                '}';
    }

    @Override
    public int compareTo(Personnel o) {
        return this.getDate().compareTo(o.getDate());
    }
}
