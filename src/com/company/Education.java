package com.company;

import java.util.ArrayList;
import java.util.List;

public class Education {
    private String schlAttended;

    public Education(List<String> schAttend) {
        this.schAttend = schAttend;
    }

    List<String> schAttend = new ArrayList<>();



    public String toString(){

        return "the list of School that i attended  are " ;
    }
}




