package com.company;

public class Job {
    private String role;
    private long salary;
    private int id;


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "i work as a role of " + this.role + "for the salary of " +this.salary +"and My ID is" + this.id;
    }
}
