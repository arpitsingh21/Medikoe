package iband.medikoe.viewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import iband.medikoe.R;
import iband.medikoe.model.ChildProvider;
import iband.medikoe.model.ParentProvider;

/**
 * Created by dell on 20-11-2017.
 */

public class ParentTitleViewHolder extends GroupViewHolder {

    private TextView parentTitle;

    public ParentTitleViewHolder(View itemView) {
        super(itemView);
        parentTitle = itemView.findViewById(R.id.character_name);
    }

    public void setGenreTitle(ExpandableGroup group) {
        parentTitle.setText(group.getTitle());
    }
}
