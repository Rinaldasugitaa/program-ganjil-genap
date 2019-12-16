public class tugasganjilgenap{
    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        int b = 2;
        int mod = nilai % b;

        System.out.println(nilai +" % " + b +" = " + mod);
        String hasil = nilai % 2 == 0 ? "Maka Nilai Genap" : "Maka Nilai Ganjil";
        System.out.println(hasil);

    }
}        