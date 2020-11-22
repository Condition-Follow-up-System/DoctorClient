package com.hzd.doctorapp.firstpage;

import com.hzd.doctorapp.firstpage.emtity.PatientList;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

/***
 * 首页管理层
 */
public class MainPersenter {

    private MainView mainView;
    private MainModel mainModel;

    public void MainPersenter() {
        mainModel = new MainModel();
    }

    /***
     * 获取患者列表
     */
    public void getPatientList() {
        mainModel.getPatientList();

    }

    /**
     * 展示患者列表
     */
    public void showPatientList(PatientList patientList) {
        mainView.showPatientList(patientList);
    }

    /**
     * 展示错误
     */
    public void showError() {
        mainView.showError();
    }
}
