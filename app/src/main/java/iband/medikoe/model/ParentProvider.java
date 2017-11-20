package iband.medikoe.model;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

/**
 * Created by dell on 20-11-2017.
 */

public class ParentProvider implements ParentObject {
    private List<Object> mChildrenList;
    private UUID id;
    private String title;

    public ParentProvider(String title) {
        this.title = title;
        id = UUID.randomUUID();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public List<Object> getChildObjectList() {
        return mChildrenList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        this.mChildrenList = list;
    }
}
