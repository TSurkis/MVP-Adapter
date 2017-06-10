package com.tsurkis.genericspresentationexperiments.screens.userdisplay;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.genericspresentationexperiments.R;
import com.tsurkis.genericspresentationexperiments.baseclasses.Ad;
import com.tsurkis.genericspresentationexperiments.mvpadapter.BaseMVPViewHolder;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class AdViewHolderMVP extends ViewHolderUserDisplayMVPBase {
    private TextView textViewAd;

    public AdViewHolderMVP(View itemView) {
        super(itemView);

        textViewAd = (TextView) itemView.findViewById(R.id.adTextView);
    }

    @Override
    public void setDataInViews(ViewContract.IUserDisplayPresenter presenter) {
        Ad ad = presenter.getAdInPosition(getAdapterPosition());
        textViewAd.setText(ad.getAdText());
    }
}
