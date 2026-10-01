public class Persegi extends BangunDatar {

    private final double sisi;

    public Persegi(double sisi) {
        super("Persegi");  // panggil constructor parent dengan nama bangun datar
        
        // TODO 1: tolak sisi <= 0
        if (sisi <= 0) {
            throw new IllegalArgumentException("Sisi tidak boleh <= 0");
        }
        this.sisi = sisi;
    }

    // TODO 2: lengkapi luas() dan keliling()
    @Override
    public double luas() {
        return Math.pow(this.sisi, 2);   // atau Math.pow(this.sisi, 2)
    }

    @Override
    public double keliling() {
        return 4 * this.sisi;
    }
}