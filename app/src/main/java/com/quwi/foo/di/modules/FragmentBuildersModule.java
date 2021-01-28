package com.quwi.foo.di.modules;
import com.quwi.foo.ui.home.ProjectFragment;
import com.quwi.foo.ui.login.LoginFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = {LoginModule.class})
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector(modules = {ViewModelModule.class})
    abstract LoginFragment contributeLoginFragment();

    @ContributesAndroidInjector(modules = {ViewModelModule.class})
    abstract ProjectFragment contributeProjectFragment();
}
