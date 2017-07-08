package com.tsurkis.mvpadapter.screens.userdisplay.mvpadapter;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.mvpadapter.App;
import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.Header;
import com.tsurkis.mvpadapter.screens.userdisplay.ViewContract;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class HeaderViewHolderMVP extends ViewHolderUserDisplayMVPBase {
    private TextView userNumberTextView, serverStatusTextView;

    HeaderViewHolderMVP(View itemView) {
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
