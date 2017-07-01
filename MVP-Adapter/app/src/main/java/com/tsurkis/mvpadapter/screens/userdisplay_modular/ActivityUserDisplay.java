package com.tsurkis.mvpadapter.screens.userdisplay_modular;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tsurkis.mvpadapter.R;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class ActivityUserDisplay extends AppCompatActivity implements ViewContract.IUserDisplayView {
    private ViewContract.IUserDisplayPresenter presenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_display_modular);

        recyclerView = (RecyclerView) findViewById(R.id.mvpRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        presenter = new PresenterUserDisplay();
        presenter.loadView(this);
    }

    @Override
    public void displayAdapter() {
        AdapterUserDisplay adapterUserDisplay = new AdapterUserDisplay(presenter.getAdapterController());
        recyclerView.setAdapter(adapterUserDisplay);
    }
}
