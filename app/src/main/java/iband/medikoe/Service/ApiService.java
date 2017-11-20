package iband.medikoe.Service;



import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;

import iband.medikoe.model.ParentProvider;
import iband.medikoe.model.StarWarProvider;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by dell on 20-11-2017.
 */

public interface ApiService {

    @GET("people/")
    Observable<StarWarProvider>getdata();
}
