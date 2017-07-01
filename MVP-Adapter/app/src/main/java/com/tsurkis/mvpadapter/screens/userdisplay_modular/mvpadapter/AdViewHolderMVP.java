package com.tsurkis.mvpadapter.screens.userdisplay.mvpadapter;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.Ad;
import com.tsurkis.mvpadapter.screens.userdisplay.ViewContract;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class AdViewHolderMVP extends ViewHolderUserDisplayMVPBase {
    private TextView textViewAd;

    AdViewHolderMVP(View itemView) {
        super(itemView);

        textViewAd = (TextView) itemView.findViewById(R.id.adTextView);
    }

    @Override
    public void setDataInViews(ViewContract.IUserDisplayPresenter presenter) {
        Ad ad = presenter.getAdInPosition(getAdapterPosition());
        textViewAd.setText(ad.getAdText());
    }
}
