package iband.medikoe.viewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import iband.medikoe.R;

/**
 * Created by dell on 20-11-2017.
 */

public class ParentTitleViewHolder extends ParentViewHolder {

   public TextView title;
   public ImageView dropdownImage;

    public ParentTitleViewHolder(View itemView) {

        super(itemView);
        title = (TextView) itemView.findViewById(R.id.character_name);
        dropdownImage = (ImageView) itemView.findViewById(R.id.dropdown_image);
    }
}
