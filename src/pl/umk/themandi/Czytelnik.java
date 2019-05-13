package pl.umk.themandi;

public class Czytelnik extends User
{
    public int id_czytelnika;
    public String email;
    public int telefon;
    /*nie moge znalezc odpowiednika daty*/
    public int data;

    public Czytelnik(int userid, String login, String password, int id_czytelnik, String mail, int telefon, int data)
    {
        super(userid, login, password);
        this.id_czytelnika = id_czytelnik;
        this.email = mail;
        this.telefon = telefon;
        this.data = data;
    }

    public Czytelnik(){}
}
