import java.util.ArrayList;
import java.util.List;



 // Daire sınıfı, bir dairenin temel özelliklerini içerir
 class Daire {
     private int daireNumarasi;

     // Daire sınıfının yapıcı metodu
     public Daire(int daireNumarasi) {
         this.daireNumarasi = daireNumarasi;
     }

     // Daire numarasını getiren metot
     public int getDaireNumarasi() {
         return daireNumarasi;
     }
 }

// Bina sınıfı, Konut ve EvSahibi nesnelerini içerir
class Bina {
    private Konut konut;
    private EvSahibi evSahibi;

    // Bina sınıfının yapıcı metodu
    public Bina(Konut konut, EvSahibi evSahibi) {
        this.konut = konut;
        this.evSahibi = evSahibi;
    }

    // Konutu getiren metot
    public Konut getKonut() {
        return konut;
    }

    // EvSahibini getiren metot
    public EvSahibi getEvSahibi() {
        return evSahibi;
    }
}

// Konut sınıfı, birden çok daire içeren bir yapıdır
class Konut {
    private List<Daire> daireler;

    // Konut sınıfının yapıcı metodu
    public Konut() {
        this.daireler = new ArrayList<>();
    }

    // Daire ekleyen metot
    public void daireEkle(Daire daire) {
        daireler.add(daire);
    }

    // Daireleri getiren metot
    public List<Daire> getDaireler() {
        return daireler;
    }
}

// Kiracı sınıfı, kiracının temel özelliklerini içerir
class Kiracı {
    private String ad;

    // Kiracı sınıfının yapıcı metodu
    public Kiracı(String ad) {
        this.ad = ad;
    }

    // Kiracının adını getiren metot
    public String getAd() {
        return ad;
    }
}

// EvSahibi sınıfı, ev sahibinin temel özelliklerini ve ev sahibinin sahip olduğu binayı içerir
class EvSahibi {
    private String ad;
    private Bina bina;

    // EvSahibi sınıfının yapıcı metodu
    public EvSahibi(String ad) {
        this.ad = ad;
    }

    // EvSahibinin adını getiren metot
    public String getAd() {
        return ad;
    }

    // EvSahibinin sahip olduğu binayı getiren metot
    public Bina getBina() {
        return bina;
    }

    // EvSahibinin sahip olduğu binayı ayarlayan metot
    public void setBina(Bina bina) {
        this.bina = bina;

    }
}

// Ana Main sınıfı
public class Main {
    public static void main(String[] args) {

        Daire daire1 = new Daire(11);
        Daire daire2 = new Daire(12);

        Konut konut = new Konut();
        konut.daireEkle(daire1);
        konut.daireEkle(daire2);

        EvSahibi evSahibi = new EvSahibi("Emre");

        Kiracı kiraci = new Kiracı("Fatma");

        Bina bina = new Bina(konut, evSahibi);
        evSahibi.setBina(bina);


        System.out.println("Ev Sahibi Adı: " + evSahibi.getAd());
        System.out.println("Ev Sahibinin Binasının Konutunda Bulunan Daireler:");
        for (Daire daire : konut.getDaireler()) {
            System.out.println("Daire Numarası: " + daire.getDaireNumarasi());
        }

        System.out.println("Ev Sahibi Kiracısı: " + kiraci.getAd());

        System.out.println("Bina Ev Sahibi: " + bina.getEvSahibi().getAd());
    }
}

