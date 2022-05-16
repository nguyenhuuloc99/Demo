package com.example.demo.Presenter;

import android.util.Log;

import com.example.demo.Api.RetrofitClient;
import com.example.demo.Api.WeatherService;
import com.example.demo.Model.WeatherResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
    private WeatherInterface weatherInterface;
    public static String lat = "21";
    public static String lon = "105";
    public static String appid="2b0f1c2e6a3deab6d7f78949d22deb33";
    public MainPresenter(WeatherInterface weatherInterface) {
        this.weatherInterface = weatherInterface;
    }
    public void getCurrent()
    {
        WeatherService weatherService= RetrofitClient.getIntance().create(WeatherService.class);
        Call call=weatherService.getCurrentWeatherData(lat,lon,appid);
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                if(response.isSuccessful())
                {
                    WeatherResponse weatherResponse = (WeatherResponse) response.body();
                    weatherInterface.getSucess(weatherResponse);
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Log.d("Err",t.getMessage());
            }
        });
    }
    public void login(String email,String pass)
    {
            //get sucess
        //sua cai này
    }
}
