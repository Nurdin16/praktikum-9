class Denda {
    private Peminjaman peminjaman;
    private int jumlahDenda = 10000;
    private int HariTerlambat;
    private int TotalDenda;
    

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
    public void setHariTerlambat(int HariTerlambat) {
        this.HariTerlambat = HariTerlambat;
    }
    public int getTotalDenda() {
        return TotalDenda;
    }
    public void setTotalDenda(int totalDenda) {
        this.TotalDenda = totalDenda;
    }
    public int hitungDenda(){
        return this.HariTerlambat * this.jumlahDenda;
    }
   
}
