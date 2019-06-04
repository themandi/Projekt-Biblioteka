package pl.umk.themandi;

public class Czytelnik
{
    public int id_czytelnik;
    public String login;
    public String haslo;
    public String imie;
    public String nazwisko;
    public String adres_zamieszkania;
    public String miasto;
    public String numer_telefonu;
    public String email;

    public Czytelnik(int id_czytelnik, String login, String haslo, String imie, String nazwisko, String adres_zamieszkania, String miasto, String numer_telefonu, String email)
    {
        this.id_czytelnik = id_czytelnik;
        this.login = login;
        this.haslo = haslo;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres_zamieszkania = adres_zamieszkania;
        this.miasto = miasto;
        this.numer_telefonu = numer_telefonu;
        this.email = email;
    }

    public Czytelnik(){}
}
