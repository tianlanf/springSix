package com.thoughtworks.yafei;

public class Fruit {
    private String size;
    private String rank;

    public void pringMsg() {
        System.out.println("I am fruit. My size is " + size + " and my rank is No." +rank);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
