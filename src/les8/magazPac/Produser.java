package les8.magazPac;

/**
 * Created by java on 23.01.2018.
 */
public class Produser {
    private String adres;
    private String eMail;
    private String index;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Produser(String adres, String eMail, String index) {
        this.adres = adres;
        this.eMail = eMail;
        this.index = index;
    }

    public Produser() {
    }
}
