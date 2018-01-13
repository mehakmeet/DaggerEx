package example.mehakmeet.daggertestapp.base;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import example.mehakmeet.daggertestapp.home.MainActivity;
import example.mehakmeet.daggertestapp.home.MainActivityComponent;

/**
 * Created by MEHAKMEET on 25-12-2017.
 */
@Module(subcomponents = {
        MainActivityComponent.class,
})

public abstract class ActivityBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);

}
