package com.tsurkis.genericspresentationexperiments.screens.userdisplay;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.genericspresentationexperiments.R;
import com.tsurkis.genericspresentationexperiments.baseclasses.Header;
import com.tsurkis.genericspresentationexperiments.dataadapter.BaseDataViewHolder;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class HeaderViewHolderData extends BaseDataViewHolder<Header> {
    private TextView userNumberTextView, serverStatusTextView;

    public HeaderViewHolderData(View itemView) {
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
