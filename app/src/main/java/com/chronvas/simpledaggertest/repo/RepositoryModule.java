package com.chronvas.simpledaggertest.repo;

import com.chronvas.simpledaggertest.repo.api.ApiSource;
import com.chronvas.simpledaggertest.repo.api.IApiSource;

import dagger.Binds;
import dagger.Module;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */
@Module
public abstract class RepositoryModule {

    @Binds
    abstract IRepository provideRepository(Repository repository);

    @Binds
    abstract IApiSource provideApiSource(ApiSource apiSource);


//    ISharedPrefsDataSource provideSharedPrefsDataSource() { return new SharedPrefsDataSource();}
}
