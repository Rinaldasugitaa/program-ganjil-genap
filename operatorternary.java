public class operatorternary{
    public static void main(String[] args) {
        int nilai = 80;
        String hasilUjian = nilai>75 ? "lulus":"Tidak lulus";
        System.out.println(hasilUjian);

        boolean isRaining = true;
        String answer = isRaining ? "Tidak boleh keluar rumah":"Boleh keluar rumah";
        System.out.println(answer);

        int battery = 0;
        boolean isPowerOn = battery > 0 ? true : false;
        System.out.println("PowerOn is "+isPowerOn);

        boolean isAvailable = false;
        String checkProductAvail = isAvailable? "cmon buy me !":"Im sorry, the stock is empty";
        System.out.println(checkProductAvail);
    }
}        



    }
}        