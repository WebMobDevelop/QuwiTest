package com.quwi.foo.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.quwi.foo.data.remote.repo.ProjectsRepo;
import com.quwi.foo.model.ProjectListResponse;
import com.quwi.foo.ui.base.BaseViewModel;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class ProjectsViewModel extends BaseViewModel {

    private static final String TAG = "ProjectsViewModel";

    private final ProjectsRepo projectRepo;
    private CompositeDisposable disposable;
    private MutableLiveData<ProjectListResponse> projectListResult = new MutableLiveData<>();
    private MutableLiveData<ProjectListResponse> renameResult = new MutableLiveData<>();

    @Inject
    public ProjectsViewModel(ProjectsRepo projectRepo) {
        this.projectRepo = projectRepo;
        disposable = new CompositeDisposable();
    }

    public LiveData<ProjectListResponse> getProjectListResult() {
        return projectListResult;
    }
    public LiveData<ProjectListResponse> getRenameResult() {
        return renameResult;
    }

    public void updateItem(String token, long id, String name) {

        disposable.add(projectRepo.RenameProject(id,token,name)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(s -> loadingStatus.setValue(true))
                .doAfterTerminate(() -> loadingStatus.setValue(false))
                .subscribeWith(new DisposableSingleObserver<ProjectListResponse>() {

                    @Override
                    public void onSuccess(ProjectListResponse resultsResponse) {
                        renameResult.setValue(resultsResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        onError.setValue(e);
                    }
                }));

    }
    public void loadData(String token) {

        disposable.add(projectRepo.ProjectList(token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(s -> loadingStatus.setValue(true))
                .doAfterTerminate(() -> loadingStatus.setValue(false))
                .subscribeWith(new DisposableSingleObserver<ProjectListResponse>() {

                    @Override
                    public void onSuccess(ProjectListResponse resultsResponse) {
                        projectListResult.setValue(resultsResponse);
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
