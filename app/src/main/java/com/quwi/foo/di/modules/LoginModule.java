package com.quwi.foo.di.modules;

import com.quwi.foo.data.remote.APIService;
import com.quwi.foo.data.remote.repo.LoginRepo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Singleton
    @Provides
    static LoginRepo provideNoteRepo(APIService noteAPI){
        return new LoginRepo(noteAPI);
    }
}
