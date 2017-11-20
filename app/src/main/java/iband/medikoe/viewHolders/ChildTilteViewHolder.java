package iband.medikoe.viewHolders;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import org.w3c.dom.Text;

import iband.medikoe.R;

/**
 * Created by dell on 20-11-2017.
 */

public class ChildTilteViewHolder extends ChildViewHolder{
   public  TextView subTitle1,subTitle2;
    public ChildTilteViewHolder(View itemView) {
        super(itemView);
        subTitle1= (TextView)itemView.findViewById(R.id.character_detail1);
        subTitle2= (TextView)itemView.findViewById(R.id.character_detail2);

    }
}
