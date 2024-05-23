package top.flydinosaur.homeworks.homework_11.homework_11_2;

import java.util.Scanner;

public class Homework_11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WaterBill waterBill = new WaterBill(scanner.nextDouble());
        GasBill gasBill = new GasBill(scanner.nextDouble());
        System.out.println("该居民缴费总额为" + (waterBill.getBill() + gasBill.getBill()));
    }
}

abstract class Bill{
    protected double volume;

    public Bill() {
    }

    public Bill(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
    public abstract double getBill();

}

class GasBill extends Bill{
    private final double rate = 2.28;

    public GasBill() {
    }

    public GasBill(double volume) {
        super(volume);
    }
    @Override
    public double getBill(){
        return volume * rate;
    }

}

class WaterBill extends Bill{
    private final double[] rate = {5, 7, 9};

    public WaterBill() {
    }

    public WaterBill(double volume) {
        super(volume);
    }

    @Override
    public double getBill() {
        if (volume > 0 & volume <= 180) {
            return volume * rate[0];
        } else if (volume > 181 & volume <= 260 ) {
            return volume * rate[1];
        } else if (volume > 261) {
            return volume * rate[2];
        }  else{
            return 0;
        }
    }
}
