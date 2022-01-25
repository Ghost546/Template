package com.tisbi.template;

import androidx.lifecycle.ViewModel;

public class ViewModelMainActivity extends ViewModel implements IMyCallback{
    LiveDataTextToView liveDataTextToView = new LiveDataTextToView();
    ModelMainActivity modelMainActivity = new ModelMainActivity(this);

    public void sendRequest() {
        modelMainActivity.sendRequest();
    }
    @Override
    public void sendData() {
        liveDataTextToView.postValue(modelMainActivity.getList().get(0).getFirstname());
    }

    public void setLiveDataTextToView(String text) {
        liveDataTextToView.postValue(text);
    }
}