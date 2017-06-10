package com.tsurkis.genericspresentationexperiments.baseclasses;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public abstract class BasePresenter<ViewInterfaceType extends IView> implements IPresenter<ViewInterfaceType> {
    private ViewInterfaceType view;

    @Override
    public void loadView(ViewInterfaceType view) {
        this.view = view;
    }

    protected ViewInterfaceType getView() {
        return view;
    }
}
