class Pegawai {
    String nama;
    String nomorPegawai;
    Perpustakaan perpustakaan;

    public Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        perpustakaan.listPelanggan[perpustakaan.jumlahPelanggan++] = pelanggan;
    }

    public void tambahBuku(Buku buku) {
        perpustakaan.listBuku[perpustakaan.jumlahBuku++] = buku;
    }

    public void tampilkanInfo() {
        System.out.printf("Nama Pegawai: %s, Nomor Pegawai: %s\n", nama, nomorPegawai);
    }
}