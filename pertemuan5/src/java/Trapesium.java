

public class Trapesium extends BangunDatar{
    private final double tinggi;
    private final double sisiAtas;
    private final double sisiSamping;
    private final double sisiBawah;

    public Trapesium(double tinggi, double sisiAtas, double sisiSamping, double sisiBawah){
        super("Trapesium");
        if(tinggi <= 0 || sisiAtas <= 0 || sisiSamping <= 0 || sisiBawah <= 0){
            throw new Error("Tiggi dan semua sisi tidak boleh <= 0");
        }
        this.tinggi = tinggi;
        this.sisiAtas = sisiAtas;
        this.sisiSamping = sisiSamping;
        this.sisiBawah = sisiBawah;
    }

    @Override   
    public double luas() {
        return 0.5 * (this.sisiAtas + this.sisiBawah) * this.tinggi;
    }
    @Override
    public  double  keliling() {
        return  this.sisiAtas + this.sisiBawah + this.sisiSamping;
    }
}