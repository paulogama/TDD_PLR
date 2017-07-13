package com.paulogama;

/**
 * Created by pgama on 04/07/17.
 */
public class Analyst extends Post {

    Analyst(int performance) {
        super(performance);
    }

    @Override
    public int multiplier() {
        return 2;
    }

}
