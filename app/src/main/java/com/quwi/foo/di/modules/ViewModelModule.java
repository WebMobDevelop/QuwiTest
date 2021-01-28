package com.quwi.foo.di.modules;

import androidx.lifecycle.ViewModel;

import com.quwi.foo.di.keys.ViewModelKey;
import com.quwi.foo.ui.home.ProjectsViewModel;
import com.quwi.foo.ui.login.LoginViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    public abstract ViewModel bindPostViewModel(LoginViewModel postViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ProjectsViewModel.class)
    public abstract ViewModel bindPostProjectViewModel(ProjectsViewModel postViewModel);
}
