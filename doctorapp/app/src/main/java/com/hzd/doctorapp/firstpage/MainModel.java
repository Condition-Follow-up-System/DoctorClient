package com.hzd.doctorapp.firstpage;

import com.hzd.doctorapp.firstpage.emtity.PatientList;

/**
 * 首页数据请求层
 */
public class MainModel {
    private MainPersenter mainPersenter;

    public void MainModel() {
        mainPersenter = new MainPersenter();
    }

    /**
     * 请求后台数据
     */
    public void getPatientList() {
        // 异步请求

        // 请求成功后：
        PatientList patientList = new PatientList();
        mainPersenter.showPatientList(patientList);

        // 请求失败后：
        mainPersenter.showError();
    }
}
