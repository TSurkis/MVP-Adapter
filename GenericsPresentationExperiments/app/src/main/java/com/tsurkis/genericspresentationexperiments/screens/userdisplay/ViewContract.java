package com.tsurkis.genericspresentationexperiments.screens.userdisplay;

import com.tsurkis.genericspresentationexperiments.baseclasses.Ad;
import com.tsurkis.genericspresentationexperiments.baseclasses.Header;
import com.tsurkis.genericspresentationexperiments.baseclasses.IPresenter;
import com.tsurkis.genericspresentationexperiments.baseclasses.IView;
import com.tsurkis.genericspresentationexperiments.baseclasses.User;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
interface ViewContract {
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
