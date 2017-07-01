package com.tsurkis.mvpadapter.screens.userdisplay.dataadapter;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.Header;
import com.tsurkis.mvpadapter.dataadapter.BaseDataViewHolder;
import com.tsurkis.mvpadapter.App;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class HeaderViewHolderData extends BaseDataViewHolder<Header> {
    private TextView userNumberTextView, serverStatusTextView;

    HeaderViewHolderData(View itemView) {
        super(itemView);

        userNumberTextView = (TextView) itemView.findViewById(R.id.activeUsersTextView);
        serverStatusTextView = (TextView) itemView.findViewById(R.id.serverStatusTextView);
    }

    @Override
    public void setDataInViews(Header header) {
        userNumberTextView.setText(
                App.getInstance().getString(R.string.user_display_view_holder_active_users, header.getNumberOfUsers()));
        serverStatusTextView.setText(
                App.getInstance().getString(
                        header.getServerState() ?
                                R.string.user_display_view_holder_server_status_ok :
                                R.string.user_display_view_holder_server_status_down));
    }
}
