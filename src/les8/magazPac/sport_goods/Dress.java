package les8.magazPac.sport_goods;

import les7.magazPac.Produser;

import java.io.PrintWriter;

/**
 * Created by java on 19.01.2018.
 */
public class Dress {
    private String brend;
    private int size;
    private int prise;
    private int count;

    private Produser produser;

    public Dress() {
    }

    public Dress(String brend, int size, int prise, int count, Produser produser) {
        this.brend = brend;
        this.size = size;
        this.prise = prise;
        this.count = count;
        this.produser = produser;
    }

    public Dress(String brend) {
        this.brend = brend;
    }

    public Dress(int size, String brend) {
        this.size = size;
        this.brend = brend;
    }

    public Dress(String brend, int prise, int size) {
        this.brend = brend;
        this.prise = prise;
        this.size = size;
    }

    public Dress(String brend, int size, int prise, int count) {
        this.brend = brend;
        this.size = size;
        this.prise = prise;
        this.count = count;
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
