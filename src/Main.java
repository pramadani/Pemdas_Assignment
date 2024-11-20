public class Main {
    public static void main(String[] args) {
        // Silahkan mengubah nama & nomor Pegawai dengan nama & NIM masing-masing
        Pegawai pegawaiPerpus = new Pegawai("Ararya Pramadani Alief Rahman", "215150207111030");
        Perpustakaan perpus = new Perpustakaan(pegawaiPerpus);

        Buku buku1 = new Buku("Tutorial Java", "Graita", 2);
        Buku buku2 = new Buku("Tutorial Python", "Safir", 2);
        pegawaiPerpus.tambahBuku(buku1);
        pegawaiPerpus.tambahBuku(buku2);

        pegawaiPerpus.tambahBuku(new Buku("Tutorial Javascript", "Bagus", 2));
        pegawaiPerpus.tambahBuku(new Buku("Tutorial Golang", "Budi", 2));

        Pelanggan pelanggan1 = new Pelanggan("Wildan", "1");
        Pelanggan pelanggan2 = new Pelanggan("Machsun", "2");
        pegawaiPerpus.tambahPelanggan(pelanggan1);
        pegawaiPerpus.tambahPelanggan(pelanggan2);
        
        pegawaiPerpus.tambahPelanggan(new Pelanggan("Adin", "3"));
        pegawaiPerpus.tambahPelanggan(new Pelanggan("Machsun", "4"));

        perpus.pinjam("Wildan", "Tutorial Java");
        perpus.pinjam("Machsun", "Tutorial Java");
        perpus.pinjam("Adin", "Tutorial Java");
        perpus.pinjam("Adin", "Tutorial Python");
        perpus.pinjam("Wildan", "Tutorial Golang");
        perpus.pinjam("Wildan", "Tutorial Javascript");
        perpus.pinjam("Wildan", "Tutorial Python");
        perpus.pinjam("Cantika", "Tutorial Golang");
        perpus.pinjam("Machsun", "Sastra Inggris");
        perpus.pinjam("Adin", "Tutorial Python");
        perpus.pinjam("Cantika", "Cara cepat belajar Python");

        perpus.tampilkanInfo();
    }
}
