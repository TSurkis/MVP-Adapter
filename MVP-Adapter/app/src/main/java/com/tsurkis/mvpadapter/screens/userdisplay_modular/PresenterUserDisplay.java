package com.tsurkis.mvpadapter.screens.userdisplay_modular;

import com.tsurkis.mvpadapter.baseclasses.architecture.BasePresenter;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class PresenterUserDisplay extends BasePresenter<ViewContract.IUserDisplayView> implements ViewContract.IUserDisplayPresenter {
    private final ViewContract.IUserDisplayDataController dataController = new DataControllerUserDisplay();
    private final IAdapterController adapterController;

    PresenterUserDisplay() {
        adapterController = new AdapterController(dataController);
    }

    @Override
    public void loadView(ViewContract.IUserDisplayView view) {
        super.loadView(view);

        getView().displayAdapter();
    }

    @Override
    public IAdapterController getAdapterController() {
        return adapterController;
    }
}
