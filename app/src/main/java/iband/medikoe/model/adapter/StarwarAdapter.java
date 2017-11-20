package iband.medikoe.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;


import iband.medikoe.R;

import iband.medikoe.view.Parent;
import iband.medikoe.viewHolders.Child;
import iband.medikoe.viewHolders.ChildTilteViewHolder;
import iband.medikoe.viewHolders.ParentTitleViewHolder;

/**
 * Created by dell on 20-11-2017.
 */

public class StarwarAdapter extends ExpandableRecyclerViewAdapter<ParentTitleViewHolder,ChildTilteViewHolder> {


    LayoutInflater inflater;
    public StarwarAdapter(Context context,List<? extends ExpandableGroup> groups) {
        super(groups);
        inflater=LayoutInflater.from(context);
    }

    @Override
    public ParentTitleViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item_title, parent, false);
        return new ParentTitleViewHolder(view);
    }

    @Override
    public ChildTilteViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item_title_child, parent, false);
        return new ChildTilteViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(ChildTilteViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final Child artist = ((Parent) group).getItems().get(childIndex);

        holder.subTitle1.setText(artist.getName());
    }

    @Override
    public void onBindGroupViewHolder(ParentTitleViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setGenreTitle(group);
    }
}
