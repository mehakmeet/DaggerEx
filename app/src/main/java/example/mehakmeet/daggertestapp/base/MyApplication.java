package example.mehakmeet.daggertestapp.base;

import android.app.Application;

import dagger.android.DaggerApplication;

/**
 * Created by MEHAKMEET on 25-12-2017.
 */

public class MyApplication extends Application {

    private ApplicationComponent component;
    @Override
    public void onCreate() {
        super.onCreate();

        component= DaggerApplicationComponent.builder().
                applicationModule(new ApplicationModule(this))
                .build();

    }
}
