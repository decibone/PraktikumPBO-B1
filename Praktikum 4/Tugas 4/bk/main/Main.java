package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    public static void main(String[] args) {
        bukuFiksi buku1 = new bukuNovel("Useless Information", "Joe Schmo", "2024", "Trivia", 250, 25000);
        bukunonFiksi buku2 = new bukuAkademik("Useful Information", "John Doe", "2024", "Education", 550, 35000);
        System.out.println("Informasi buku fiksi:");
        buku1.view();
        System.out.println("\nInformasi buku non fiksi:");
        buku2.view();
    }
}
