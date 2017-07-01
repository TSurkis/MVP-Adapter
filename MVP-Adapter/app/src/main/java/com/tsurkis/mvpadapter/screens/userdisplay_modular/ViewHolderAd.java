package com.tsurkis.mvpadapter.screens.userdisplay_modular;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.Ad;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class ViewHolderAd extends ViewHolderBase {
    private TextView textViewAd;

    ViewHolderAd(View itemView) {
        super(itemView);

        textViewAd = (TextView) itemView.findViewById(R.id.adTextView);
    }

    @Override
    public void setDataInViews(ViewContract.IUserDisplayPresenter.IAdapterController dataGetter) {
        Ad ad = dataGetter.getAdInPosition(getAdapterPosition());
        textViewAd.setText(ad.getAdText());
    }
}
