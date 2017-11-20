package iband.medikoe.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;
import java.util.List;

import iband.medikoe.R;
import iband.medikoe.Service.ApiService;
import iband.medikoe.model.ChildProvider;
import iband.medikoe.model.ParentProvider;
import iband.medikoe.model.StarWarProvider;
import iband.medikoe.model.adapter.ResultProvider;
import iband.medikoe.model.adapter.StarwarAdapter;
import iband.medikoe.presenter.HomePresenter;
import iband.medikoe.viewHolders.Child;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    protected HomePresenter presenter;
    //protected  void initializePresenter();
    List<Parent> list;
    StarwarAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();

        List<Child> child = new ArrayList<>();
                    /*ParentProvider parentProvider = new ParentProvider();
                    child.add(new ChildProvider(p.get(i).getHeight(), p.get(i).getMass()));
                    parentProvider.setChildObjectList(child);
                    list.add(parentProvider);
                */
        child.add(new Child("asd"));
        child.add(new Child("asdfgh"));
        list.add(new Parent("asdfg",child));




        adapter = new StarwarAdapter(this, list);
        recyclerView.setAdapter(adapter);

        getProductData();
    }


    public void getProductData() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://swapi.co/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);

        Observable<StarWarProvider> observable = apiService.getdata().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
        observable.subscribe(new Observer<StarWarProvider>() {
            @Override
            public void onCompleted() {
                Toast.makeText(MainActivity.this, "Noerror", Toast.LENGTH_SHORT).show();

                Log.v("Data Reveived", list.size() + "");
            }

            @Override
            public void onError(Throwable e) {

                Toast.makeText(MainActivity.this, "Error " + e.toString(), Toast.LENGTH_SHORT).show();
                Log.v("Error", e.toString());

            }

            @Override
            public void onNext(StarWarProvider products) {

                //Toast.makeText(MainActivity.this, products.size()+"", Toast.LENGTH_SHORT).show();

                list = new ArrayList<>();
                List<ResultProvider> p = products.getResult();


                for (int i = 0; i < p.size(); i++) {
                    Log.v("Data Reveived", p.get(i).getName());

                    List<Child> child = new ArrayList<>();
                    /*ParentProvider parentProvider = new ParentProvider();
                    child.add(new ChildProvider(p.get(i).getHeight(), p.get(i).getMass()));
                    parentProvider.setChildObjectList(child);
                    list.add(parentProvider);
                */
                    child.add(new Child(p.get(i).getMass()));
                    child.add(new Child(p.get(i).getHeight()));
                    child.add(new Child(p.get(i).getHaircolor()));
                   list.add(new Parent(p.get(i).getName(),child));


                }

                adapter.notifyDataSetChanged();

            }
        });

    }

    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        adapter.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        adapter.onRestoreInstanceState(savedInstanceState);
    }
}