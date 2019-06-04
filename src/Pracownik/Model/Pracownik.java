package Pracownik.Model;

public class Pracownik {
    public int id_pracownika;
    public String login;
    public String haslo;

    public Pracownik(int id_pracownika, String login, String haslo)
    {

        this.id_pracownika = id_pracownika;
        this.login = login;
        this.haslo = haslo;
    }

    public Pracownik(){}

    public int getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(int id_pracownika) {
        this.id_pracownika = id_pracownika;
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
}