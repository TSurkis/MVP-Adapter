package com.tsurkis.genericspresentationexperiments.screens.userdisplay;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.genericspresentationexperiments.R;
import com.tsurkis.genericspresentationexperiments.baseclasses.User;
import com.tsurkis.genericspresentationexperiments.dataadapter.BaseDataViewHolder;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class UserViewHolderData extends BaseDataViewHolder<User> {
    private TextView userNameAndAgeTextView, userMarriageStatusTextView;

    public UserViewHolderData(View itemView) {
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
