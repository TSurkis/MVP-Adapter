package com.tsurkis.mvpadapter.screens.userdisplay.dataadapter;

import android.view.ViewGroup;

import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.dataadapter.BaseDataAdapter;
import com.tsurkis.mvpadapter.dataadapter.BaseDataViewHolder;
import com.tsurkis.mvpadapter.screens.userdisplay.ViewContract;

import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.AD;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.HEADER;
import static com.tsurkis.mvpadapter.baseclasses.Constants.UserDisplayAdapterViewTypes.USER;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class AdapterUserDisplayData extends BaseDataAdapter<ViewContract.IUserDisplayPresenter, BaseDataViewHolder> {

    public AdapterUserDisplayData(ViewContract.IUserDisplayPresenter iUserDisplayPresenter) {
        super(iUserDisplayPresenter);
    }

    @Override
    public BaseDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseDataViewHolder viewHolder = null;
        switch(viewType) {
            case USER: {
                viewHolder = new UserViewHolderData(inflate(parent, R.layout.item_user));
                break;
            }
            case HEADER: {
                viewHolder = new HeaderViewHolderData(inflate(parent, R.layout.item_header));
                break;
            }
            case AD: {
                viewHolder = new AdViewHolderData(inflate(parent, R.layout.item_ad));
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
    public void onBindViewHolder(BaseDataViewHolder holder, int position) {
        switch(holder.getItemViewType()) {
            case USER: {
                holder.setDataInViews(getPresenter().getUserInPosition(position));
                break;
            }
            case HEADER: {
                holder.setDataInViews(getPresenter().getHeaderData());
                break;
            }
            case AD: {
                holder.setDataInViews(getPresenter().getAdInPosition(position));
                break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return getPresenter().getDataCollectionSize();
    }
}
