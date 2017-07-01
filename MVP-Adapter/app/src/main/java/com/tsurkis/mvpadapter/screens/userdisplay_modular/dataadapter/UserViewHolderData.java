package com.tsurkis.mvpadapter.screens.userdisplay.dataadapter;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.User;
import com.tsurkis.mvpadapter.dataadapter.BaseDataViewHolder;
import com.tsurkis.mvpadapter.App;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class UserViewHolderData extends BaseDataViewHolder<User> {
    private TextView userNameAndAgeTextView, userMarriageStatusTextView;

    UserViewHolderData(View itemView) {
        super(itemView);

        userNameAndAgeTextView = (TextView) itemView.findViewById(R.id.userNameAndAgeTextView);
        userMarriageStatusTextView = (TextView) itemView.findViewById(R.id.userMarriageStatusTextView);
    }

    @Override
    public void setDataInViews(User user) {
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
