package com.ashstudios.safana.ui.calendar;

import androidx.lifecycle.ViewModel;

import com.ashstudios.safana.models.TaskModel;

import java.util.ArrayList;

public class CalendarViewModel extends ViewModel {

    private ArrayList<TaskModel> arrayListMutableLiveData;
    public CalendarViewModel() {
        arrayListMutableLiveData = new ArrayList<>();
        getData();
    }

    public ArrayList<TaskModel> getArrayListMutableLiveData() {
        return arrayListMutableLiveData;
    }

    public void getData() {
        arrayListMutableLiveData.add(new TaskModel("Implement User Profile","28/03/2018"));
        arrayListMutableLiveData.add(new TaskModel("Implement User Orders","28/04/2019"));
        arrayListMutableLiveData.add(new TaskModel("Test User Profile","28/05/2019"));
        arrayListMutableLiveData.add(new TaskModel("Feedback from Client","25/03/2019"));
        arrayListMutableLiveData.add(new TaskModel("Implement User Profile","22/03/2019"));
    }
}