package com.tisbi.template;

import java.util.ArrayList;

public class ModelMainActivity {

    IMyCallback iMyCallback;

    private ArrayList<Person> list = new ArrayList<>();

    public ArrayList<Person> getList() {
        return list;
    }

    public void setList(ArrayList<Person> list) {
        this.list = list;
    }

    public void sendRequest() {
        iMyCallback.sendData();
    }

    ModelMainActivity(IMyCallback iMyCallback) {
        this.iMyCallback = iMyCallback;
        list.add(new Person("Alex"));
        list.add(new Person("Morti", 22));
    }
}
