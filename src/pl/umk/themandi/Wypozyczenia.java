package pl.umk.themandi;

import java.util.Date;

public class Wypozyczenia {
    public Date data_wypozyczenia;
    public Date data_zwrotu;
    public int id_czytelnika;
    public int id_ksiazki;

    public Wypozyczenia(Date data_wypozyczenia, Date data_zwrotu, int id_czytelnika, int id_ksiazki)
    {
        this.data_wypozyczenia = data_wypozyczenia;
        this.data_zwrotu = data_zwrotu;
        this.id_czytelnika = id_czytelnika;
        this.id_ksiazki = id_ksiazki;
    }
}
