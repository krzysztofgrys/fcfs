package com.company;

/**
 * Created by Krzysztof on 2015-03-16.
 */
public class Proces {
    private int numer=0;
    private int dlugosc_fazy;
    private int moment_zgloszenia;
    private int czas_oczekiwania;

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getDlugosc_fazy() {
        return dlugosc_fazy;
    }

    public void setDlugosc_fazy(int dlugosc_fazy) {
        this.dlugosc_fazy = dlugosc_fazy;
    }

    public int getMoment_zgloszenia() {
        return moment_zgloszenia;
    }

    public void setMoment_zgloszenia(int moment_zgloszenia) {
        this.moment_zgloszenia = moment_zgloszenia;
    }

    public int getCzas_oczekiwania() {
        return czas_oczekiwania;
    }

    public void setCzas_oczekiwania(int czas_oczekiwania) {
        this.czas_oczekiwania = czas_oczekiwania;
    }

    public Proces(int numer, int dlugosc_fazy, int moment_zgloszenia) {
        setNumer(numer);
        setDlugosc_fazy(dlugosc_fazy);
        setMoment_zgloszenia(moment_zgloszenia);
        setCzas_oczekiwania(0);
    }

    @Override
    public String toString(){
        return getNumer()+" "+getDlugosc_fazy()+" "+getMoment_zgloszenia()+" "+getCzas_oczekiwania();
    }
}
