public class Uczen extends Osoba{
    private int ocenaMatematyka;
    private String klasa;

    public Uczen(String imie, String nazwisko, int wiek, int ocenaMatematyka, String klasa){
        super(imie, nazwisko, wiek);
        this.ocenaMatematyka = ocenaMatematyka;
        this.klasa = klasa;
    }

    public void przedstawSie(){
        System.out.println("Mam na imie " +imie + " na nazwisko " + nazwisko + " mam " + wiek + " lat, ocena mat: " + ocenaMatematyka + ", klasa: " + klasa );
    }
}