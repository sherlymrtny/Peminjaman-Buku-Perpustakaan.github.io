package com.company;

//Mahasiswa
class Mahasiswa{
    String nama;
    String NPM;
    String jurusan;
    Buku bukuPinjaman;


    //Method
    void identitasBuku(Buku bukuPinjaman){
        this.bukuPinjaman = bukuPinjaman;
    }

    //Constructor
    Mahasiswa(String nama, String NPM, String jurusan){
        this.nama = nama;
        this.NPM = NPM;
        this.jurusan = jurusan;
    }

    //Method
    void displayDataPinjaman(){
        System.out.println("Nama               : " + nama);
        System.out.println("NPM                : " + NPM);
        System.out.println("Jurusan            : " + jurusan);
        bukuPinjaman.displayDataBuku();
    }

}

// Buku
class Buku{
    String namaBuku;
    String namaPenulis;
    String tglPinjam; //dd/mm/yy

    //Constructor
    Buku(String namaBuku, String namaPenulis, String tglPinjam){
        this.namaBuku= namaBuku;
        this.namaPenulis = namaPenulis;
        this.tglPinjam = tglPinjam;
    }

    //Method
    void displayDataBuku(){
        System.out.println("Nama Buku          : " + namaBuku);
        System.out.println("Penulis            : " + namaPenulis);
        System.out.println("Tanggal Peminjaman : " + tglPinjam);
    }

}

public class Main {

    public static void main(String[] args) {
        System.out.println("Peminjaman Buku Perpustakaan");
        System.out.println("Daftar Mahasiswa yang Meminjam Buku");
        System.out.println();

        Mahasiswa angelia = new Mahasiswa("Angelia", "1715701123", "Teknik Elektro");

        Buku kalkulus1 = new Buku("Kalkulus Edisi Kesembilan Jilid 1", "Purcell", "25/03/22");

        angelia.identitasBuku(kalkulus1);

        angelia.displayDataPinjaman();
    }
}