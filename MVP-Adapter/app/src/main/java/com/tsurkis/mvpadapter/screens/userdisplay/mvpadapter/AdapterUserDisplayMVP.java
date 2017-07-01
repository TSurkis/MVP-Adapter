package com.tsurkis.mvpadapter.screens.userdisplay.mvpadapter;

import android.view.ViewGroup;

import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.ui.mvpadapter.BaseMVPAdapter;
import com.tsurkis.mvpadapter.screens.userdisplay.ViewContract;

import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.AD;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.HEADER;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.USER;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class AdapterUserDisplayMVP extends BaseMVPAdapter<ViewContract.IUserDisplayPresenter, ViewHolderUserDisplayMVPBase> {
    public AdapterUserDisplayMVP(ViewContract.IUserDisplayPresenter iUserDisplayPresenter) {
        super(iUserDisplayPresenter);
    }

    @Override
    public ViewHolderUserDisplayMVPBase onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolderUserDisplayMVPBase viewHolder = null;
        switch (viewType) {
            case USER: {
                viewHolder = new UserViewHolderMVP(inflate(parent, R.layout.item_user));
                break;
            }
            case HEADER: {
                viewHolder = new HeaderViewHolderMVP(inflate(parent, R.layout.item_header));
                break;
            }
            case AD: {
                viewHolder = new AdViewHolderMVP(inflate(parent, R.layout.item_ad));
                break;
            }
        }


        return viewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return getPresenter().getViewTypeForPosition(position);
    }

    @Override
    public void onBindViewHolder(ViewHolderUserDisplayMVPBase holder, int position) {
        holder.setDataInViews(getPresenter());
    }

    @Override
    public int getItemCount() {
        return getPresenter().getDataCollectionSize();
    }
}
