class Denda {
    private Peminjaman peminjaman;
    private int jumlahDenda = 10000;
    private int HariTerlambat;

    public Denda(Peminjaman peminjaman, int HariTerlambat ) {
        this.peminjaman = peminjaman;
        this.HariTerlambat = HariTerlambat;
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }
    public int getJumlahDenda() {
        return jumlahDenda;
    }

    public void setJumlahDenda(int jumlahDenda) {
        this.jumlahDenda = jumlahDenda;
    }
    public int getHariTerlambat() {
        return HariTerlambat;
    }


}