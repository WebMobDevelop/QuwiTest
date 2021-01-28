package com.quwi.foo.di.modules;

import androidx.lifecycle.ViewModelProvider;

import com.quwi.foo.ui.base.ViewModelFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory modelProvider);

}
