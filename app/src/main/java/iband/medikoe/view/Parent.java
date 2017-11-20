package iband.medikoe.view;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

import iband.medikoe.viewHolders.Child;

/**
 * Created by dell on 20-11-2017.
 */

public class Parent extends ExpandableGroup<Child> {


    private int iconResId;

    public Parent(String title, List<Child> items) {
        super(title, items);

    }

    public int getIconResId() {
        return iconResId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parent)) return false;

        Parent genre = (Parent) o;

        return getIconResId() == genre.getIconResId();

    }

    @Override
    public int hashCode() {
        return getIconResId();
    }
}
