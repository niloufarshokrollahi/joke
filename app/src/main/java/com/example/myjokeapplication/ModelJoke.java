package com.example.myjokeapplication;

public class ModelJoke {
    private int id;
    private String setup;
    private  String punchline;

    public ModelJoke(int id,String setup,String punchline){
        this.id=id;
        this.setup=setup;
        this.punchline=punchline;
    }
    public int getId(){return id;}
    public String getSetup(){return setup;}
    public  String getPunchline(){return punchline;}




}


