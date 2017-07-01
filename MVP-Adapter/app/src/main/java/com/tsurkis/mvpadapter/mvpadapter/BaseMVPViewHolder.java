package com.tsurkis.mvpadapter.mvpadapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.tsurkis.mvpadapter.baseclasses.IPresenter;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public abstract class BaseMVPViewHolder<PresenterType extends IPresenter> extends RecyclerView.ViewHolder {
    public BaseMVPViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setDataInViews(PresenterType presenter);
}
