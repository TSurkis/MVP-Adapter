package com.tsurkis.mvpadapter.dataadapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public abstract class BaseDataViewHolder<Data> extends RecyclerView.ViewHolder {
    public BaseDataViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setDataInViews(Data data);
}
