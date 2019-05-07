package pl.umk.themandi;

public class Pracownik extends User {
    public int id_pracownika;

    public Pracownik(int userid, String login, String password, int id_pracownik)
    {
        super(userid, login, password);
        this.id_pracownika = id_pracownik;
    }
}