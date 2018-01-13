package example.mehakmeet.daggertestapp.base;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by MEHAKMEET on 25-12-2017.
 */

@Singleton
@Component(modules={
        ApplicationModule.class,
})
public interface ApplicationComponent {
}
