public class PegawaiHarian extends Pegawai {
    private final hariKerja;
    public PegawaiHarian(String nip, String nama, double gajiPokok, int hariKerja) {
        super(nip, nama, gajiPokok);

        this.hariKerja = hariKerja;
    }

    @Override
    public double hitungGaji(){ 
        return super.hitungGaji() + this.hariKerja; 
        }

    @Override
    public String jenis(){
        return "PegawaiHarian";
    }