package academy.learnprogramming;

public class WaterTank {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterTank wb = new WaterTank();

        System.out.print("Empty="+wb.empty);
        System.out.print(",Brand="+wb.brand);
        // the printed result will be: Empty=false,Brand=null
    }
}
