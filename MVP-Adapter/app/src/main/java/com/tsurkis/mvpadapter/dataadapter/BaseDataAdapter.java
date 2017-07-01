package com.tsurkis.mvpadapter.dataadapter;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tsurkis.mvpadapter.baseclasses.IPresenter;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public abstract class BaseDataAdapter
        <PresenterType extends IPresenter,
        ViewHolderType extends BaseDataViewHolder>
        extends RecyclerView.Adapter<ViewHolderType> {

    private final PresenterType presenter;

    public BaseDataAdapter(PresenterType presenterType) {
        presenter = presenterType;
    }

    protected PresenterType getPresenter() {
        return presenter;
    }

    protected View inflate(ViewGroup parent, @LayoutRes int layout) {
        return LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
    }
}
