package pl.umk.themandi;

import java.util.Date;

public class Podpięcia {
    public int id_rezerwacji;
    public Date data_podpiecia;
    public int id_czytelnika;
    public int id_ksiazki;

    public Podpięcia(int id_rezerwacji, Date data_podpiecia, int id_czytelnika, int id_ksiazki)
    {
        this.id_rezerwacji = id_rezerwacji;
        this.data_podpiecia = data_podpiecia;
        this.id_czytelnika = id_czytelnika;
        this.id_ksiazki = id_ksiazki;
    }
}
