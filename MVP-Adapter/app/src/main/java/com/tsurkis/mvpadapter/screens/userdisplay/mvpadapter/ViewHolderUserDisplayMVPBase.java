package com.tsurkis.mvpadapter.screens.userdisplay.mvpadapter;

import android.view.View;

import com.tsurkis.mvpadapter.baseclasses.ui.mvpadapter.BaseMVPViewHolder;
import com.tsurkis.mvpadapter.screens.userdisplay.ViewContract;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
abstract class ViewHolderUserDisplayMVPBase extends BaseMVPViewHolder<ViewContract.IUserDisplayPresenter> {
    ViewHolderUserDisplayMVPBase(View itemView) {
        super(itemView);
    }
}
