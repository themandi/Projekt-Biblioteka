package pl.umk.themandi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;


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


    //    public void pobierzDaneTeacher() throws SQLException {
//        zapytanie = conn.createStatement();
//        wynik = zapytanie.executeQuery("SELECT * FROM Nauczyciele");
//
//    }
    public Czytelnik getCzytelnik(String ID_CZYTELNIK) throws SQLException {
        Czytelnik temp = new Czytelnik();
        zapytanie = conn.createStatement();
        String quest = "SELECT * FROM Czytelnik WHERE login = '" + ID_CZYTELNIK + "'";
        wynik = zapytanie.executeQuery(quest);
        while (wynik.next()) {
//            temp.id_czytelnika = wynik.getString("ID_CZYTELNIK");
            temp.setLogin(wynik.getString("LOGIN"));
            temp.setHaslo(wynik.getString("HASLO"));
//            temp.imie = wynik.getString("IMIE");
//            temp.nazwisko = wynik.getString("NAZWISKO");

        }
        return temp;
//        return Usr
    }

}