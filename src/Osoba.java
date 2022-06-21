public class Osoba {
    protected String imie;
    protected String nazwisko;
    protected int wiek;

    //konstruktory
    public Osoba(){};

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, String nazwisko){
        this(imie, nazwisko, 1);
    }

    public Osoba(Osoba osoba){
        this(osoba.imie, osoba.nazwisko, osoba.wiek);
    }

    // Gettery i Settery


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    //metody
    void przedstawSie(){
        System.out.println("Mam na imie " +imie + " na nazwisko " + nazwisko + " mam " + wiek + " lat" );
    }
}