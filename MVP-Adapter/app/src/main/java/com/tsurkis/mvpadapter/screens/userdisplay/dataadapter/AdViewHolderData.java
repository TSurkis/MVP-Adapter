package com.tsurkis.mvpadapter.screens.userdisplay.dataadapter;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.Ad;
import com.tsurkis.mvpadapter.baseclasses.ui.dataadapter.BaseDataViewHolder;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class AdViewHolderData extends BaseDataViewHolder<Ad> {
    private TextView textViewAd;

    AdViewHolderData(View itemView) {
        super(itemView);

        textViewAd = (TextView) itemView.findViewById(R.id.adTextView);
    }

    @Override
    public void setDataInViews(Ad ad) {
        textViewAd.setText(ad.getAdText());
    }
}
