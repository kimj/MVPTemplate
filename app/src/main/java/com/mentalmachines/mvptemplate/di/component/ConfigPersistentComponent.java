package com.mentalmachines.mvptemplate.di.component;

/**
 * Created by jinn on 3/5/17.
 */

import com.mentalmachines.mvptemplate.di.ConfigPersistent;
import com.mentalmachines.mvptemplate.di.module.ActivityModule;
import com.mentalmachines.mvptemplate.di.module.FragmentModule;

import dagger.Component;

/**
 * A dagger component that will live during the lifecycle of an Activity or Fragment but it won't
 * be destroy during configuration changes. Check {@link BaseActivity} and {@link BaseFragment} to
 * see how this components survives configuration changes.
 * Use the {@link ConfigPersistent} scope to annotate dependencies that need to survive
 * configuration changes (for example Presenters).
 */
@ConfigPersistent
@Component(dependencies = ApplicationComponent.class)
public interface ConfigPersistentComponent {

    ActivityComponent activityComponent(ActivityModule activityModule);

    FragmentComponent fragmentComponent(FragmentModule fragmentModule);

}
