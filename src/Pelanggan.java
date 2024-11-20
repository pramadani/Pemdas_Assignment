class Pelanggan {
    String nama;
    String nomorPelanggan;
    Buku[] listBukuPinjam = new Buku[3];
    int jumlahPinjaman = 0;

    Pelanggan(String nama, String nomorPelanggan) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    void tambahBuku(Buku bukuPinjam) {
        listBukuPinjam[jumlahPinjaman++] = bukuPinjam;
    }

    void tampilkanInfo() {
        System.out.printf("Nama Pelanggan: %s, Nomor Pelanggan: %s\n", nama, nomorPelanggan);
        System.out.println("Daftar Buku yang Dipinjam:");

        for (int i = 0; i < jumlahPinjaman; i++) {
            listBukuPinjam[i].tampilkanInfo();
        }
    }
}