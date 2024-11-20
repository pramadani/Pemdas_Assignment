class Perpustakaan {
    Pegawai pegawai;
    Pelanggan[] listPelanggan = new Pelanggan[20];
    Buku[] listBuku = new Buku[100];
    int jumlahPelanggan = 0;
    int jumlahBuku = 0;

    Perpustakaan(Pegawai pegawai) {
        this.pegawai = pegawai;
        pegawai.perpustakaan = this;
    }

    Pelanggan cariPelanggan(String namaPelanggan) {
        for (int i = 0; i < jumlahPelanggan; i++) {
            if (listPelanggan[i].nama.equals(namaPelanggan)) return listPelanggan[i];
        }

        return null;
    }

    Buku cariBuku(String namaBuku) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (listBuku[i].judul.equals(namaBuku)) return listBuku[i];
        }

        return null;
    }

    void pinjam(String namaPelanggan, String judulBuku) {
        Pelanggan pelanggan = cariPelanggan(namaPelanggan);
        Buku buku = cariBuku(judulBuku);

        if (pelanggan == null) return;
        if (buku == null) return;
        if (buku.jumlah == 0) return;
        if (pelanggan.jumlahPinjaman == 3) return;

        pelanggan.tambahBuku(buku);
        buku.jumlah--;
    }

    void tampilkanInfo() {
        System.out.println("Informasi Perpustakaan:");

        System.out.println();

        System.out.println("Pegawai: ");
        pegawai.tampilkanInfo();

        System.out.println();

        System.out.println("Daftar Pelanggan:");
        System.out.println();
        for (int i = 0; i < jumlahPelanggan; i++) {
            listPelanggan[i].tampilkanInfo();
            System.out.println();
        }

        System.out.println("Daftar Buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            listBuku[i].tampilkanInfo();
        }
    }
}