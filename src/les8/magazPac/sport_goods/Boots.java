package les8.magazPac.sport_goods;

import les8.magazPac.Produser;

/**
 * Created by java on 19.01.2018.
 */
public class Boots {
    private String brend;
    private int size;
    private int prise;
    private int count;

    private Produser producer;

    public Boots() {
    }



    public Boots(String brend) {
        this.brend = brend;
    }

    public Boots(int size, String brend) {
        this.size = size;
        this.brend = brend;
    }

    public Boots(String brend, int prise, int size) {
        this.brend = brend;
        this.prise = prise;
        this.size = size;
    }

    public Boots(String brend, int size, int prise, int count) {
        this.brend = brend;
        this.size = size;
        this.prise = prise;
        this.count = count;
    }

    public Boots(String brend, int size, int prise, int count, Produser producer) {
        this.brend = brend;
        this.size = size;
        this.prise = prise;
        this.count = count;
        this.producer = producer;
    }

    public Produser getProducer() {
        return producer;
    }

    public void setProducer(Produser producer) {
        this.producer = producer;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
