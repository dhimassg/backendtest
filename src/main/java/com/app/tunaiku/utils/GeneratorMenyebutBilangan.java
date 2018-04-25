/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.tunaiku.utils;

/**
 *
 * @author <Dhimas Surya G>
 */
public class GeneratorMenyebutBilangan {

    static String[] huruf = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

    public static String getTerbilang(Long angka) {
        if (angka < 12) {
            return huruf[angka.intValue()];
        }
        if (angka >= 12 && angka <= 19) {
            return huruf[angka.intValue() % 10] + " Belas";
        }
        if (angka >= 20 && angka <= 99) {
            return getTerbilang(angka / 10) + " Puluh " + huruf[angka.intValue() % 10];
        }
        if (angka >= 100 && angka <= 199) {
            return "Seratus " + getTerbilang(angka % 100);
        }
        if (angka >= 200 && angka <= 999) {
            return getTerbilang(angka / 100) + " Ratus " + getTerbilang(angka % 100);
        }
        if (angka >= 1000 && angka <= 1999) {
            return "Seribu " + getTerbilang(angka % 1000);
        }
        if (angka >= 2000 && angka <= 999999) {
            return getTerbilang(angka / 1000) + " Ribu " + getTerbilang(angka % 1000);
        }
        if (angka >= 1000000 && angka <= 999999999) {
            return getTerbilang(angka / 1000000) + " Juta " + getTerbilang(angka % 1000000);
        }
        if (angka >= 1000000000 && angka <= 999999999999L) {
            return getTerbilang(angka / 1000000000) + " Milyar " + getTerbilang(angka % 1000000000);
        }
        if (angka >= 1000000000000L && angka <= 999999999999999L) {
            return getTerbilang(angka / 1000000000000L) + " Triliun " + getTerbilang(angka % 1000000000000L);
        }
        if (angka >= 1000000000000000L && angka <= 999999999999999999L) {
            return getTerbilang(angka / 1000000000000000L) + " Quadrilyun " + getTerbilang(angka % 1000000000000000L);
        }
        return "";
    }
}
