package iband.medikoe.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import javax.inject.Inject;

import iband.medikoe.BaseApp;
import iband.medikoe.R;
import iband.medikoe.Service.Service;
import iband.medikoe.model.adapter.HomeAdapter;
import iband.medikoe.model.pojo.StarwarDataResponse;
import iband.medikoe.model.pojo.StarwarResponse;
import iband.medikoe.presenter.HomePresenter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}
