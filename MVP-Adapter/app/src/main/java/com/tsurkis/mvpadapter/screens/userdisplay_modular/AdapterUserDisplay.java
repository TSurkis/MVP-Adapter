package com.tsurkis.mvpadapter.screens.userdisplay_modular;

import android.view.ViewGroup;

import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.ui.mvpadapter_modular.BaseModularMVPAdapter;

import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.AD;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.HEADER;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.USER;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class AdapterUserDisplay extends BaseModularMVPAdapter<ViewContract.IUserDisplayPresenter.IAdapterController, ViewHolderBase> {
    AdapterUserDisplay(ViewContract.IUserDisplayPresenter.IAdapterController adapterController) {
        super(adapterController);
    }

    @Override
    public ViewHolderBase onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolderBase viewHolder = null;
        switch (viewType) {
            case USER: {
                viewHolder = new ViewHolderUser(inflate(parent, R.layout.item_user));
                break;
            }
            case HEADER: {
                viewHolder = new ViewHolderHeader(inflate(parent, R.layout.item_header));
                break;
            }
            case AD: {
                viewHolder = new ViewHolderAd(inflate(parent, R.layout.item_ad));
                break;
            }
        }

        return viewHolder;
    }
}
