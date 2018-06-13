package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Person {
      private  Job job;
      private  Education edu;

    public Person(Education edu) {
        this.edu = new Education();
    }

    public Person() {
        this.job = new Job();
        job.setSalary(1000L);
        job.setRole("one");
        job.setId(12987);
    }
public long getSalary(){
            return  job.getSalary();
}

    @Override
    public String toString() {
        return edu.toString();
    }
}
