package com.tsurkis.genericspresentationexperiments.screens.userdisplay;

import android.view.View;

import com.tsurkis.genericspresentationexperiments.mvpadapter.BaseMVPViewHolder;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
abstract class ViewHolderUserDisplayMVPBase extends BaseMVPViewHolder<ViewContract.IUserDisplayPresenter> {
    public ViewHolderUserDisplayMVPBase(View itemView) {
        super(itemView);
    }
}
