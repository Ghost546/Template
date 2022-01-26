package com.tisbi.template;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class ViewModelMainActivity extends ViewModel implements IMyCallback{
    LiveDataPersonsList liveDataTextToView = new LiveDataPersonsList();
    ModelMainActivity modelMainActivity = new ModelMainActivity(this);

    public void sendRequest() {
        modelMainActivity.sendRequest();
    }
    @Override
    public void sendData() {
        liveDataTextToView.postValue(modelMainActivity.getList());
    }

//    public void setLiveDataTextToView(ArrayList<Person> list) {
//        liveDataTextToView.postValue(list);
//    }
}