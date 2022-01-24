package com.tisbi.template;

import androidx.lifecycle.ViewModel;

public class ViewModelMainActivity extends ViewModel {
    LiveDataTextToView liveDataTextToView = new LiveDataTextToView();

    public void setLiveDataTextToView(String text) {
        liveDataTextToView.postValue(text);
    }
}