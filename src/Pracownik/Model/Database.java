package Pracownik.Model;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
    public Database() throws SQLException {
        polacz();
    }

    protected String jdbcurl = "jdbc:oracle:thin:@localhost:1521:xe";
    protected String userid = "hr";
    protected String password = "hr";
    protected Connection conn;
    protected Statement zapytanie;
    public ResultSet wynik = null;

    public void polacz() throws SQLException {
        OracleDataSource ds = new OracleDataSource();
        ds.setURL(jdbcurl);
        conn = ds.getConnection(userid, password);
    }

    public void pobierzPracownikow() throws SQLException {
        zapytanie = conn.createStatement();
        wynik = zapytanie.executeQuery("SELECT * FROM Pracownik");

    }

    public Pracownik getPracownik(String ID_PRACOWNIKA) throws SQLException {
        Pracownik temp = new Pracownik();
        zapytanie = conn.createStatement();
        String quest = "SELECT * FROM Pracownik WHERE login = '" + ID_PRACOWNIKA + "'";
        wynik = zapytanie.executeQuery(quest);
        while (wynik.next()) {
            temp.setLogin(wynik.getString("LOGIN"));
            temp.setHaslo(wynik.getString("HASLO"));
            temp.setId_pracownika(wynik.getInt("ID_PRACOWNIKA"));

        }
        return temp;
    }

    protected static String logowanie(ResultSet wynik, String login, String password) throws SQLException {
        String tmpLogin = null, tmpPass = null;

        while (wynik.next()) {

            tmpLogin = wynik.getString("LOGIN");
            tmpPass = wynik.getString("HASLO");
            if(tmpLogin.equals(login)) {
                break;
            }

        }
        if(!(tmpPass.equals(password))) return "niezalogowany";


        return "zalogowany";
    }

}