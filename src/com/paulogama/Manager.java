package com.paulogama;

/**
 * Created by pgama on 04/07/17.
 */
public class Manager extends Post {

    public Manager(int performance) {
        super(performance);
    }

    @Override
    public int multiplier() {
        return 3;
    }

}
