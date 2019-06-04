package pl.umk.themandi;

import java.util.Date;

public class Ksiazka{
    public int id_ksiazki;
    public String tytul;
    public String autor;
    public Date rok_wydania;
    public String opis;
    public int id_kategorii;
    public int id_wydawnictwa;

    public Ksiazka(int id_ksiazki, String tytul, String autor, Date rok_wydania, String opis, int id_kategorii, int id_wydawnictwa)
    {
        this.id_ksiazki = id_ksiazki;
        this.tytul = tytul;
        this.autor = autor;
        this.rok_wydania = rok_wydania;
        this.opis = opis;
        this.id_kategorii = id_kategorii;
        this.id_wydawnictwa = id_wydawnictwa;
    }
}
