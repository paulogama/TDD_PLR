package com.paulogama;

/**
 * Created by pgama on 13/07/17.
 */
public class Post implements IPost {

    int performance;

    public Post(int performance) {
        this.performance = performance;
    }

    @Override
    public int multiplier() {
        return 0;
    }
}
