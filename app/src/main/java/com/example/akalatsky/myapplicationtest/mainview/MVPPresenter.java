package com.example.akalatsky.myapplicationtest.mainview;

public interface MVPPresenter<V extends MVPVIew> {

    void attacheView(V mvpView);//метод для передачи View -> Presenter
    void viewIsReady(); //сигнал Presenter что вью готов к работе
    void detachView(); //Отсоединение View от Presenter
    void destroy(); // завершение работы
}
