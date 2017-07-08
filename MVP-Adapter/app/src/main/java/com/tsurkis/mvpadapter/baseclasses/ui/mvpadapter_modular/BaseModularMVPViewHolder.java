package com.tsurkis.mvpadapter.baseclasses.ui.mvpadapter_modular;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.tsurkis.mvpadapter.baseclasses.architecture.IBaseAdapterController;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public abstract class BaseModularMVPViewHolder<AdapterController extends IBaseAdapterController> extends RecyclerView.ViewHolder {
    public BaseModularMVPViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setDataInViews(AdapterController presenter);
}
