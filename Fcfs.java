package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fcfs {

    public static void main(String[] args) {
        Queue<Proces> kolejkaProcesow = new LinkedList<Proces>();
        kolejkaProcesow.offer(new Proces(0, 3, 0));
        kolejkaProcesow.offer(new Proces(1, 6, 0));
        kolejkaProcesow.offer(new Proces(2, 21, 0));

        double aktualny_czas = 0;
        int aktualny_czas_oczekiwania = 0;

        Iterator<Proces> iteratorPoProcesach = kolejkaProcesow.iterator();
        while (iteratorPoProcesach.hasNext()) {

            Proces proc = iteratorPoProcesach.next();

            if (proc.getNumer() == 0) {
                proc.setCzas_oczekiwania(0);
                aktualny_czas_oczekiwania += proc.getDlugosc_fazy();
            } else {

                if (aktualny_czas_oczekiwania + proc.getDlugosc_fazy()>= proc.getMoment_zgloszenia()) {

                    aktualny_czas_oczekiwania -= proc.getMoment_zgloszenia();
                    proc.setCzas_oczekiwania(aktualny_czas_oczekiwania);
                    aktualny_czas_oczekiwania += proc.getDlugosc_fazy();

                } else {
                    proc.setCzas_oczekiwania(0);
                }
            }
            aktualny_czas+=proc.getCzas_oczekiwania();
        }

        System.out.println(aktualny_czas/ kolejkaProcesow.size());

        while (kolejkaProcesow.peek() != null) {
            System.out.println(kolejkaProcesow.poll());
        }
    }
}
