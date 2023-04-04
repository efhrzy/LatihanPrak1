package Latihan2_modul1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        //breakfast
        Makanan mie = new Makanan();
        mie.setNamaHidangan("Mie Goreng");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Indonemilk");
        breakfast.setKonsumsi(mie, susu);
        listKonsumsi.add(breakfast);

        //lunch
        Makanan ayam = new Makanan();
        ayam.setNamaHidangan("Ayam Kalasan");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKonsumsi(ayam, air);
        listKonsumsi.add(lunch);

        //output
        System.out.println("Menu Yang Dimakan");
        for (Konsumsi<Makanan, Minuman> konsumsi : listKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}
