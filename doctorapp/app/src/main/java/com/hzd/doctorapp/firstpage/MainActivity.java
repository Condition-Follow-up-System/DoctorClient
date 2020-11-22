package com.hzd.doctorapp.firstpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hzd.doctorapp.R;
import com.hzd.doctorapp.firstpage.emtity.PatientList;

public class MainActivity extends AppCompatActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void showPatientList(PatientList patientList) {

    }

    @Override
    public void showError() {

    }
}