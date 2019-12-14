public class operatoraritmatika1{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int tambah = a + b; // operator penambahan
        int kurang = a - b; // pengurangan
        int kali = a * b; // perkalian
        double bagi = a / b; // pembagian
        int mod = a % b; // operator modulus
        int c = 1;
        
        System.out.println(++c); // hasil nya c adalah 2 sama dengan c=c+1
        c--; // operator decrement (pengurangan 1)
        System.out.println(c); // hasil nya c adalah 1
        
        System.out.println(a + " + " + b + " = " + tambah);
        System.out.println(a + " - " + b + " = " + kurang);
        System.out.println(a + " * " + b + " = " + kali);
        System.out.println(a + " / " + b + " = " + bagi);
        System.out.println(a + " % " + b + " = " + mod);

        int alas = 10;
        int tinggi = 15;

        double luas = alas * tinggi / 2;
        double perhitungan = (2 + 3) * 5 / 2;//12.5 -> 2 + 3 didahulukan karena prioritas (2+3)
        System.out.println(perhitungan);
    }
}    
