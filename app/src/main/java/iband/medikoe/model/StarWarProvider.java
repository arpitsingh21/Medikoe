package iband.medikoe.model;

import java.util.List;

import iband.medikoe.model.adapter.ResultProvider;

/**
 * Created by dell on 20-11-2017.
 */

public class StarWarProvider {



    List<ResultProvider> results;

    public List<ResultProvider> getResult() {
        return results;
    }

    public void setResult(List<ResultProvider> result) {
        this.results = result;
    }


}
