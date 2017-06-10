package com.tsurkis.genericspresentationexperiments.screens.userdisplay;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.genericspresentationexperiments.R;
import com.tsurkis.genericspresentationexperiments.baseclasses.Header;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class HeaderViewHolderMVP extends ViewHolderUserDisplayMVPBase {
    private TextView userNumberTextView, serverStatusTextView;

    public HeaderViewHolderMVP(View itemView) {
        super(itemView);

        userNumberTextView = (TextView) itemView.findViewById(R.id.activeUsersTextView);
        serverStatusTextView = (TextView) itemView.findViewById(R.id.serverStatusTextView);
    }

    @Override
    public void setDataInViews(ViewContract.IUserDisplayPresenter presenter) {
        Header header = presenter.getHeaderData();

        userNumberTextView.setText(
                App.getInstance().getString(R.string.user_display_view_holder_active_users, header.getNumberOfUsers()));
        serverStatusTextView.setText(
                App.getInstance().getString(
                        header.getServerState() ?
                                R.string.user_display_view_holder_server_status_ok :
                                R.string.user_display_view_holder_server_status_down));
    }
}
