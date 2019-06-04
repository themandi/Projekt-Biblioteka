package Pracownik.Model;
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

    public int getId_czytelnik() {
        return id_czytelnik;
    }

    public void setId_czytelnik(int id_czytelnik) {
        this.id_czytelnik = id_czytelnik;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

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

    public String getAdres_zamieszkania() {
        return adres_zamieszkania;
    }

    public void setAdres_zamieszkania(String adres_zamieszkania) {
        this.adres_zamieszkania = adres_zamieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getNumer_telefonu() {
        return numer_telefonu;
    }

    public void setNumer_telefonu(String numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}