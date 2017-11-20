package iband.medikoe.viewHolders;

import android.os.Parcel;
import android.os.Parcelable;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

/**
 * Created by dell on 20-11-2017.
 */

public class Child  implements Parcelable {

    private String name;
    private boolean isFavorite;

    public Child(String name) {
        this.name = name;

    }

    protected Child(Parcel in) {
        name = in.readString();
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Child)) return false;

        Child artist = (Child) o;


        return getName() != null ? getName().equals(artist.getName()) : artist.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;

        return result;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Child> CREATOR = new Creator<Child>() {
        @Override
        public Child createFromParcel(Parcel in) {
            return new Child(in);
        }

        @Override
        public Child[] newArray(int size) {
            return new Child[size];
        }
    };
}
