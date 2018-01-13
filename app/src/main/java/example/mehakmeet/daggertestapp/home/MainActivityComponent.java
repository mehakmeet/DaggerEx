package example.mehakmeet.daggertestapp.home;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import example.mehakmeet.daggertestapp.DI.ActivityScope;

/**
 * Created by MEHAKMEET on 25-12-2017.
 */

@ActivityScope
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{



    }
}
