package com.tsurkis.mvpadapter.screens.userdisplay;

import com.tsurkis.mvpadapter.baseclasses.dataobjects.Ad;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.User;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class DataControllerUserDisplay implements ViewContract.IUserDisplayDataController {
    private ArrayList<User> users = new ArrayList<>();
    private final ArrayList<Ad> ads = new ArrayList<>();

    /**
     * Constructor.
     * <p>
     * An example of data, this data can also be retrieved from a server, or a database.
     */
    DataControllerUserDisplay() {
        Random r = new Random();
        int adDataCollectionSize = 4;

        for (int index = 0; index < adDataCollectionSize; index++) {
            ads.add(new Ad("Ad number #" + String.valueOf(index)));
        }

        users.add(new User("John Doe", 37, false));
        users.add(new User("Morgan Freeman", 80, true));
        users.add(new User("Joker", 30, false));
        users.add(new User("Bobbie Lovebread", 77, false));
        users.add(new User("Gonzals bibistrochi", 20, true));
        users.add(new User("Ishi moto", 19, true));
        users.add(new User("Abu dikra", 278, false));
    }

    @Override
    public User getUserInPosition(int position) {
        return users.get(position);
    }

    @Override
    public Ad getAdInPosition(int position) {
        return ads.get(position);
    }

    @Override
    public int getNumberOfAds() {
        return ads.size();
    }

    @Override
    public int getNumberOfUsers() {
        return users.size();
    }
}
