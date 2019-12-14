public class tugasganjilgenap{
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        System.out.println(a);

        int genap = a;
        String ganjilgenap = a<5 ? "genap":"ganjil";
        System.out.println(ganjilgenap);
    }
}        