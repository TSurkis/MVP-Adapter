package com.tsurkis.genericspresentationexperiments.mvpadapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tsurkis.genericspresentationexperiments.baseclasses.IPresenter;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public abstract class BaseMVPAdapter
        <PresenterType extends IPresenter,
        ViewHolderType extends BaseMVPViewHolder<PresenterType>>
        extends RecyclerView.Adapter<ViewHolderType> {

    private final PresenterType presenter;

    public BaseMVPAdapter(PresenterType presenterType) {
        presenter = presenterType;
    }

    protected PresenterType getPresenter() {
        return presenter;
    }

    protected View inflate(ViewGroup parent, @LayoutRes int layout) {
        return LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
    }
}
