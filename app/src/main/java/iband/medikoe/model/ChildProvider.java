package iband.medikoe.model;

/**
 * Created by dell on 20-11-2017.
 */

public class ChildProvider  {

    public String detail_one;
    public String detail_two;

    public ChildProvider(String detail_one, String detail_two) {
        this.detail_one = detail_one;
        this.detail_two = detail_two;
    }

    public String getDetail_one() {
        return detail_one;
    }

    public void setDetail_one(String detail_one) {
        this.detail_one = detail_one;
    }

    public String getDetail_two() {
        return detail_two;
    }

    public void setDetail_two(String detail_two) {
        this.detail_two = detail_two;
    }
}
