class Buku {
    String judul;
    String penulis;
    int jumlah;

    Buku(String judul, String penulis, int jumlah) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    void tampilkanInfo() {
        System.out.printf("Judul Buku: %s, Penulis: %s\n", judul, penulis);
    }
}