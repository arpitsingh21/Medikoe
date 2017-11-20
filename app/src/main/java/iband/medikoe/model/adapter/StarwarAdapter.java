package iband.medikoe.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;

import iband.medikoe.R;
import iband.medikoe.model.ChildProvider;
import iband.medikoe.model.ParentProvider;
import iband.medikoe.viewHolders.ChildTilteViewHolder;
import iband.medikoe.viewHolders.ParentTitleViewHolder;

/**
 * Created by dell on 20-11-2017.
 */

public class StarwarAdapter extends ExpandableRecyclerAdapter<ParentTitleViewHolder, ChildTilteViewHolder> {

   LayoutInflater inflater;

    public StarwarAdapter(Context context, List<ParentObject> parentItemList, LayoutInflater inflater) {
        super(context, parentItemList);
        this.inflater = inflater;
    }

    @Override
    public ParentTitleViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view= inflater.inflate(R.layout.list_item_title,viewGroup,false);
        return new ParentTitleViewHolder(view);

    }

    @Override
    public ChildTilteViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view= inflater.inflate(R.layout.list_item_title_child,viewGroup,false);
        return new ChildTilteViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(ParentTitleViewHolder parentTitleViewHolder, int i, Object o) {
        ParentProvider provider= (ParentProvider)o;
        parentTitleViewHolder.title.setText(provider.getTitle());

    }

    @Override
    public void onBindChildViewHolder(ChildTilteViewHolder childTilteViewHolder, int i, Object o) {
        ChildProvider provider= (ChildProvider)o;
        childTilteViewHolder.subTitle1.setText(provider.getDetail_one());
        childTilteViewHolder.subTitle2.setText(provider.getDetail_two());
    }
}
