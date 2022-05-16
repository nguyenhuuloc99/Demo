package com.example.demo.Presenter;

import com.example.demo.Model.WeatherResponse;

public interface WeatherInterface {
    //trả về kết quả cho view
    void getSucess(WeatherResponse weatherResponse);
    void loginsucess(String message);
}
