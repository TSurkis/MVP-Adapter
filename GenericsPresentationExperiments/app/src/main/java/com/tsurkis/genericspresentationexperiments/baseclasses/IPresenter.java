package com.tsurkis.genericspresentationexperiments.baseclasses;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public interface IPresenter<ViewInterfaceType extends IView> {
    void loadView(ViewInterfaceType viewInterfaceType);
    void onResume();
    void onPause();
}
