package com.tsurkis.mvpadapter.screens.userdisplay_modular;

import android.util.SparseIntArray;

import com.tsurkis.mvpadapter.baseclasses.dataobjects.Ad;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.Header;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.User;

import java.util.ArrayList;

import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.AD;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.HEADER;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.USER;

/**
 * Created by T.Surkis on 01-Jul-17.
 */
class AdapterController implements ViewContract.IUserDisplayPresenter.IAdapterController {
    private final ViewContract.IUserDisplayDataController dataController;

    private final ArrayList<Integer> viewTypes = new ArrayList<>();
    private final SparseIntArray viewIndexToDataIndexLocation = new SparseIntArray();

    private Header header;

    AdapterController(ViewContract.IUserDisplayDataController dataController) {
        this.dataController = dataController;
        viewTypes.add(HEADER);
        int numberOfUsers = dataController.getNumberOfUsers();
        boolean serverWorking = dataController.getNumberOfUsers() != 0;
        header = new Header(numberOfUsers, serverWorking);

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
    public int getCollectionSize() {
        return dataController.getNumberOfAds() + dataController.getNumberOfUsers() + 1;
    }

    @Override
    public int getViewItemTypeInPosition(int position) {
        return viewTypes.get(position);
    }

    @Override
    public Ad getAdInPosition(int position) {
        return dataController.getAdInPosition(viewIndexToDataIndexLocation.get(position));
    }

    @Override
    public User getUserInPosition(int position) {
        return dataController.getUserInPosition(viewIndexToDataIndexLocation.get(position));
    }

    @Override
    public Header getHeaderData() {
        return header;
    }
}
