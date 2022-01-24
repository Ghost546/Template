package com.tisbi.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewModelMainActivity viewModelMainActivity;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModelMainActivity = new ViewModelProvider(this).get(ViewModelMainActivity.class);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModelMainActivity.setLiveDataTextToView("Я изменил данный текст через LiveData + ViewModel");
                textView.setText(viewModelMainActivity.liveDataTextToView.getValue());
            }
        });

        viewModelMainActivity.liveDataTextToView.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                //данный код срабатывает при измении LiveData
                textView.setText(s);
            }
        });

    }

}