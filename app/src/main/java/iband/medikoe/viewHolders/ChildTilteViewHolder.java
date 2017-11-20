package iband.medikoe.viewHolders;

import android.view.View;
import android.widget.TextView;


import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;



import iband.medikoe.R;


/**
 * Created by dell on 20-11-2017.
 */

public class ChildTilteViewHolder extends ChildViewHolder {
   public  TextView subTitle1,subTitle2;


    public ChildTilteViewHolder(View itemView) {
        super(itemView);
        subTitle1 = itemView.findViewById(R.id.character_detail1);
    }

    public void onBind(Child artist) {
        subTitle1.setText(artist.getName());
    }
}
