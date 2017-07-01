package com.tsurkis.mvpadapter.baseclasses;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class Header {
    private int numberOfUsers;
    private boolean serverOn;

    public Header(int numberOfUsers, boolean serverState) {
        this.numberOfUsers = numberOfUsers;
        this.serverOn = serverState;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public boolean getServerState() {
        return serverOn;
    }
}
