package com.ashstudios.safana.ui.worker_details;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.lifecycle.ViewModel;

import com.ashstudios.safana.adapters.WorkerRVAdapter;
import com.ashstudios.safana.models.WorkerModel;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WorkerDetailsViewModel extends ViewModel {

    private ArrayList<WorkerModel> workerModels;
    FirebaseFirestore db;
    WorkerModel workerModel;

    public WorkerDetailsViewModel() {
        workerModels = new ArrayList<>();
    }

//    "https://i.imgur.com/[0-9a-zA-Z]*.(jpg|png)

    private void initData() {
        WorkerModel workerModel = new WorkerModel("Rohan gill","Designer","https://i.imgur.com/wnKtRoZ.png","emp123");
        workerModels.add(workerModel);

        workerModel = new WorkerModel("Harsh Saglani","UI/UX","https://i.imgur.com/wnKtRoZ.png","emp123");
        workerModels.add(workerModel);

        workerModel = new WorkerModel("Rohit Suthar","Developer","https://i.imgur.com/wnKtRoZ.png","emp133");
        workerModels.add(workerModel);

        workerModel = new WorkerModel("John Doe","Designer","https://i.imgur.com/wnKtRoZ.png","emp1223");
        workerModels.add(workerModel);

        workerModel = new WorkerModel("Akshay Kumar","DB Admin","https://i.imgur.com/wnKtRoZ.png","emp143");
        workerModels.add(workerModel);

        workerModel = new WorkerModel("Carry Minati","UI/UX","https://i.imgur.com/wnKtRoZ.png","emp143");
        workerModels.add(workerModel);

        workerModel = new WorkerModel("Raju Shriwastav","Architect","https://i.imgur.com/wnKtRoZ.png","emp143");
        workerModels.add(workerModel);

        workerModel = new WorkerModel("Aniket Pande ","SYS Admin","https://i.imgur.com/wnKtRoZ.png","emp143");
        workerModels.add(workerModel);
    }

    public ArrayList<WorkerModel> getWorkerModels() {
        return workerModels;
    }

    public void sort(Bundle b) {
        workerModels.remove(0);
    }
}