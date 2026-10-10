public class PegawaiHarian extends Pegawai {

    private final double upahPerHari;
    private final int hariKerja;

    public PegawaiHarian(String nip, String nama, double upahPerHari, int hariKerja) {
        super(nip, nama, 0);
        this.upahPerHari = upahPerHari;
        this.hariKerja = hariKerja;
    }

    @Override
    public double hitungGaji() {
        return upahPerHari * hariKerja;
    }

    @Override
    public String jenis() { return "HARIAN"; }
}