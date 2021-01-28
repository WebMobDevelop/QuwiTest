package com.quwi.foo.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.quwi.foo.data.remote.repo.LoginRepo;
import com.quwi.foo.model.LoginResponseEntity;
import com.quwi.foo.ui.base.BaseViewModel;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class LoginViewModel extends BaseViewModel {

    private static final String TAG = "LoginViewModel";
    private final LoginRepo loginRepo;
    private CompositeDisposable disposable;
    private MutableLiveData<LoginResponseEntity> loginResult = new MutableLiveData<>();

    @Inject
    public LoginViewModel(LoginRepo loginRepo) {
        this.loginRepo = loginRepo;
        disposable = new CompositeDisposable();
    }

    public LiveData<LoginResponseEntity> getLoginResult() {
        return loginResult;
    }


    public void loadData(String email,String pass) {

        disposable.add(loginRepo.Login(email,pass)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(s -> loadingStatus.setValue(true))
                .doAfterTerminate(() -> loadingStatus.setValue(false))
                .subscribeWith(new DisposableSingleObserver<LoginResponseEntity>() {

                    @Override
                    public void onSuccess(LoginResponseEntity resultsResponse) {
                        System.out.println("btoken:"+resultsResponse.getToken());
                        loginResult.setValue(resultsResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                       e.printStackTrace();
                       onError.setValue(e);
                    }
                }));

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (disposable != null) {
            disposable.clear();
            disposable = null;
        }
    }
}
