package pl.umk.themandi;

public abstract class User
{
    private String Login;
    private String Haslo;
    private int Userid;

    public User(int userid, String login, String password) {
        this.Login = login;
        this.Haslo = password;
        this.Userid = userid;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getHaslo() {
        return Haslo;
    }

    public void setHaslo(String haslo) {
        Haslo = haslo;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }
}
