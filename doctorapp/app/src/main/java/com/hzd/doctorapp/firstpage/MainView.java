package com.hzd.doctorapp.firstpage;

import com.hzd.doctorapp.firstpage.emtity.PatientList;

/**
 * 首页展示层
 */
public interface MainView {

    public void showPatientList(PatientList patientList);

    public void showError();
}
