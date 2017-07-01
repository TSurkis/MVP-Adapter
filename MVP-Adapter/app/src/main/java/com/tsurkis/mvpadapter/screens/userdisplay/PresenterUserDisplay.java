package com.tsurkis.mvpadapter.screens.userdisplay;

import android.util.SparseIntArray;

import com.tsurkis.mvpadapter.baseclasses.Ad;
import com.tsurkis.mvpadapter.baseclasses.BasePresenter;
import com.tsurkis.mvpadapter.baseclasses.Header;
import com.tsurkis.mvpadapter.baseclasses.User;

import java.util.ArrayList;

import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.AD;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.HEADER;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.USER;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class PresenterUserDisplay extends BasePresenter<ViewContract.IUserDisplayView> implements ViewContract.IUserDisplayPresenter {
    private final ViewContract.IUserDisplayDataController dataController = new DataControllerUserDisplay();
    private final ArrayList<Integer> viewTypes = new ArrayList<>();
    private final SparseIntArray viewIndexToDataIndexLocation = new SparseIntArray();

    private Header header;

    PresenterUserDisplay() {
        viewTypes.add(HEADER);
        int numberOfUsers = dataController.getNumberOfUsers();
        boolean serverStatus = dataController.getNumberOfUsers() == 0;
        header = new Header(numberOfUsers, serverStatus);

        for (int index = 0; index < dataController.getNumberOfAds() - 2; index++) {
            viewIndexToDataIndexLocation.put(viewTypes.size(), index);
            viewTypes.add(AD);
        }

        //
        // Stopping user creation in the middle
        for (int index = 0; index < dataController.getNumberOfUsers() / 2; index++) {
            viewIndexToDataIndexLocation.put(viewTypes.size(), index);
            viewTypes.add(USER);
        }

        //
        // Placing ads in the middle
        for (int index = dataController.getNumberOfAds() - 2; index < dataController.getNumberOfAds(); index++) {
            viewIndexToDataIndexLocation.put(viewTypes.size(), index);
            viewTypes.add(AD);
        }

        //
        // putting the last users;
        for (int index = dataController.getNumberOfUsers() / 2; index < dataController.getNumberOfUsers(); index++) {
            viewIndexToDataIndexLocation.put(viewTypes.size(), index);
            viewTypes.add(USER);
        }
    }

    @Override
    public void loadView(ViewContract.IUserDisplayView view) {
        super.loadView(view);

        getView().displayAdapter();
    }

    @Override
    public Header getHeaderData() {
        return header;
    }

    @Override
    public User getUserInPosition(int position) {
        return dataController.getUserInPosition(viewIndexToDataIndexLocation.get(position));
    }

    @Override
    public Ad getAdInPosition(int position) {
        return dataController.getAdInPosition(viewIndexToDataIndexLocation.get(position));
    }

    @Override
    public int getViewTypeForPosition(int position) {
        return viewTypes.get(position);
    }

    @Override
    public int getDataCollectionSize() {
        return dataController.getNumberOfAds() + dataController.getNumberOfUsers() + 1;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }
}
