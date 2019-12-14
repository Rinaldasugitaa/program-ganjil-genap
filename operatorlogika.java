public class operatorlogika{
    public static void main(String[] args) {

        //AND
        
        System.out.println("Contoh AND :");
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false
        
        //OR
        System.out.println("Contoh OR :");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        //NOT 
        System.out.println(!true); // false
        boolean hujan = true;
        System.out.println(!hujan); //false 
        // kombinasi dengan operator perbandingan
        System.out.println((!hujan && true) ||(10 > 8)); // true
        int nilai = 102;
        System.out.println(nilai >= 80 && nilai <= 100); // false
    }
}    