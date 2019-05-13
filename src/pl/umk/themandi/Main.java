package pl.umk.themandi;

import java.sql.SQLException;


public class Main
{
    public static void main(String[] args) throws SQLException {
        Database database = new Database();
        Czytelnik czytelnik = database.getCzytelnik("1oo");

        System.out.println(czytelnik.getHaslo());
    }

    public Main() throws SQLException {}
}
