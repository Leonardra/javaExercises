package com.incluctab.tddClasses.myersBrigg;

public class Responses {
    int[] response;

    public Responses(char answer) {
        response = new int[2];
        if(answer == 'a'){
            response[0] = 1;
        }
        if(answer == 'b'){
            response[1] = 1;
        }
    }


    public Responses() {
        this.response = new int[2];
    }

    public int[] getResponse() {
        return response;
    }
}
