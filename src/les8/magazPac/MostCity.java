package les8.magazPac;

import java.util.Arrays;

/**
 * Created by java on 23.01.2018.
 */
public class MostCity {
    private Shop [] shops;

    public Shop[] getShops() {
        return shops;
    }

    public void setShops(Shop[] shops) {
        this.shops = shops;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MostCity mostCity = (MostCity) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(shops, mostCity.shops);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(shops);
    }
}
