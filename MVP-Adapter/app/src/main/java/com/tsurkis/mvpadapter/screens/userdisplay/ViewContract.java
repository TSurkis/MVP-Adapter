package com.tsurkis.mvpadapter.screens.userdisplay;

import com.tsurkis.mvpadapter.baseclasses.Ad;
import com.tsurkis.mvpadapter.baseclasses.Header;
import com.tsurkis.mvpadapter.baseclasses.IPresenter;
import com.tsurkis.mvpadapter.baseclasses.IView;
import com.tsurkis.mvpadapter.baseclasses.User;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public interface ViewContract {
    interface IUserDisplayView extends IView {
        void displayAdapter();
    }

    interface IUserDisplayPresenter extends IPresenter<IUserDisplayView> {
        Header getHeaderData();
        User getUserInPosition(int position);
        Ad getAdInPosition(int position);

        int getViewTypeForPosition(int position);

        int getDataCollectionSize();
    }

    interface IUserDisplayDataController {
        User getUserInPosition(int position);
        Ad getAdInPosition(int position);

        int getNumberOfAds();
        int getNumberOfUsers();
    }
}
