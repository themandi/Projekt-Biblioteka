package pl.umk.themandi;

public class Pracownik{
    public int id_pracownika;
    public String login;
    public String haslo;

    public Pracownik(int id_pracownika, String login, String haslo)
    {

        this.id_pracownika = id_pracownika;
        this.login = login;
        this.haslo = haslo;
    }
}