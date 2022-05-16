package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demo.Model.WeatherResponse;
import com.example.demo.Presenter.MainPresenter;
import com.example.demo.Presenter.WeatherInterface;

public class MainActivity extends AppCompatActivity implements WeatherInterface {
    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter=new MainPresenter(this);
        mainPresenter.login("A","A");
    }

    @Override
    public void getSucess(WeatherResponse weatherResponse) {

    }

    @Override
    public void loginsucess(String message) {

    }
}