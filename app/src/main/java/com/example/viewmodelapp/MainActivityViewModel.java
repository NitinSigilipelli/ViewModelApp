package com.example.viewmodelapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int counter =0 ;
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();
    //When the app first launched
    public MutableLiveData<Integer> getInitialCounter(){
        countLiveData.setValue(counter);
        return countLiveData;
    }
    //when user clicks the button
    public  void getCounter(){
        counter++;
        countLiveData.setValue(counter);
    }
}
