package com.tsurkis.mvpadapter.screens.userdisplay_modular;

import com.tsurkis.mvpadapter.baseclasses.architecture.IBaseAdapterController;
import com.tsurkis.mvpadapter.baseclasses.architecture.IPresenter;
import com.tsurkis.mvpadapter.baseclasses.architecture.IView;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.Ad;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.User;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public interface ViewContract {
    interface IUserDisplayView extends IView {
        void displayAdapter();
    }

    interface IUserDisplayPresenter extends IPresenter<IUserDisplayView> {
        interface IAdapterController extends IBaseAdapterController, IAdData, IUserData, IHeaderData {
        }

        IAdapterController getAdapterController();
    }

    interface IUserDisplayDataController {
        User getUserInPosition(int position);

        Ad getAdInPosition(int position);

        int getNumberOfAds();

        int getNumberOfUsers();
    }
}
