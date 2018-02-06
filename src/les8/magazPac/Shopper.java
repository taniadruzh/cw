package les8.magazPac;

/**
 * Created by java on 19.01.2018.
 */
public class Shopper {
    private int shopperMoneyLimit;
    private String Name;

    public Shopper() {
    }

    public Shopper(String name, int shopperMoneyLimit) {
        Name = name;
        this.shopperMoneyLimit = shopperMoneyLimit;
    }

    public int getShopperMoneyLimit() {
        return shopperMoneyLimit;
    }

    public void setShopperMoneyLimit(int shopperMoneyLimit) {
        this.shopperMoneyLimit = shopperMoneyLimit;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
