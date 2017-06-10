package com.tsurkis.genericspresentationexperiments.screens.userdisplay;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.genericspresentationexperiments.R;
import com.tsurkis.genericspresentationexperiments.baseclasses.Ad;
import com.tsurkis.genericspresentationexperiments.dataadapter.BaseDataViewHolder;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class AdViewHolderData extends BaseDataViewHolder<Ad> {
    private TextView textViewAd;

    public AdViewHolderData(View itemView) {
        super(itemView);

        textViewAd = (TextView) itemView.findViewById(R.id.adTextView);
    }

    @Override
    public void setDataInViews(Ad ad) {
        textViewAd.setText(ad.getAdText());
    }
}
