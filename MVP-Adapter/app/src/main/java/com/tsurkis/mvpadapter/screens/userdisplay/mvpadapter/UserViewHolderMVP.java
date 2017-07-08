package com.tsurkis.mvpadapter.screens.userdisplay.mvpadapter;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.mvpadapter.App;
import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.User;
import com.tsurkis.mvpadapter.screens.userdisplay.ViewContract;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class UserViewHolderMVP extends ViewHolderUserDisplayMVPBase {
    private TextView userNameAndAgeTextView, userMarriageStatusTextView;

    UserViewHolderMVP(View itemView) {
        super(itemView);

        userNameAndAgeTextView = (TextView) itemView.findViewById(R.id.userNameAndAgeTextView);
        userMarriageStatusTextView = (TextView) itemView.findViewById(R.id.userMarriageStatusTextView);
    }

    @Override
    public void setDataInViews(ViewContract.IUserDisplayPresenter presenter) {
        User user = presenter.getUserInPosition(getAdapterPosition());

        userNameAndAgeTextView.setText(
                App.getInstance().getString(
                        R.string.user_display_view_holder_name_and_age,
                        user.getName(),
                        user.getAge()));
        userMarriageStatusTextView.setText(
                App.getInstance().getString(
                        user.isMarried() ?
                                R.string.user_display_view_holder_married :
                                R.string.user_display_view_holder_not_married));
    }
}
