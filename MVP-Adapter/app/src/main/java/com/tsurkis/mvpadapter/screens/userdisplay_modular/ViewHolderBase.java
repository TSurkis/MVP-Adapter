package com.tsurkis.mvpadapter.screens.userdisplay_modular;

import android.view.View;

import com.tsurkis.mvpadapter.baseclasses.ui.mvpadapter_modular.BaseModularMVPViewHolder;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
abstract class ViewHolderBase extends BaseModularMVPViewHolder<ViewContract.IUserDisplayPresenter.IAdapterController> {
    ViewHolderBase(View itemView) {
        super(itemView);
    }
}
