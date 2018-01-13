package example.mehakmeet.daggertestapp.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MEHAKMEET on 25-12-2017.
 */

@Module
public class ApplicationModule {

    private final Application application;

    ApplicationModule(Application application){
        this.application=application;
    }

    @Provides
    Context provideApplicationContext(){
        return application;
    }
}
