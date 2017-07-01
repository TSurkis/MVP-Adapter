package com.tsurkis.mvpadapter.screens.userdisplay_modular;

import android.view.View;
import android.widget.TextView;

import com.tsurkis.mvpadapter.App;
import com.tsurkis.mvpadapter.R;
import com.tsurkis.mvpadapter.baseclasses.dataobjects.Header;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
class ViewHolderHeader extends ViewHolderBase {
    private TextView userNumberTextView, serverStatusTextView;

    ViewHolderHeader(View itemView) {
        super(itemView);

        userNumberTextView = (TextView) itemView.findViewById(R.id.activeUsersTextView);
        serverStatusTextView = (TextView) itemView.findViewById(R.id.serverStatusTextView);
    }

    @Override
    public void setDataInViews(ViewContract.IUserDisplayPresenter.IAdapterController dataGetter) {
        Header header = dataGetter.getHeaderData();

        userNumberTextView.setText(
                App.getInstance().getString(R.string.user_display_view_holder_active_users, header.getNumberOfUsers()));
        serverStatusTextView.setText(
                App.getInstance().getString(
                        header.getServerState() ?
                                R.string.user_display_view_holder_server_status_ok :
                                R.string.user_display_view_holder_server_status_down));
    }
}
