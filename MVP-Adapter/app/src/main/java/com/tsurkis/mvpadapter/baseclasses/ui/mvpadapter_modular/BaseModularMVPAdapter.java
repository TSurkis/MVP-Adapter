package com.tsurkis.mvpadapter.baseclasses.ui.mvpadapter_modular;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tsurkis.mvpadapter.baseclasses.architecture.IBaseAdapterController;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public abstract class BaseModularMVPAdapter
        <AdapterControllerType extends IBaseAdapterController,
        ViewHolderType extends BaseModularMVPViewHolder<AdapterControllerType>>
        extends RecyclerView.Adapter<ViewHolderType> {

    private final AdapterControllerType adapterController;

    public BaseModularMVPAdapter(AdapterControllerType adapterController) {
        this.adapterController = adapterController;
    }

    protected AdapterControllerType getAdapterController() {
        return adapterController;
    }

    @Override
    public int getItemCount() {
        return adapterController.getCollectionSize();
    }

    @Override
    public int getItemViewType(int position) {
        return adapterController.getViewItemTypeInPosition(position);
    }

    protected View inflate(ViewGroup parent, @LayoutRes int layout) {
        return LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
    }

    @Override
    public void onBindViewHolder(ViewHolderType holder, int position) {
        holder.setDataInViews(adapterController);
    }
}
