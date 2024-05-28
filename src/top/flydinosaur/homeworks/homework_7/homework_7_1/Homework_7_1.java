package top.flydinosaur.homeworks.homework_7.homework_7_1;

import java.util.Scanner;

public class Homework_7_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WaterBill water = new WaterBill(scanner.nextDouble());
        GasBill gas = new GasBill(scanner.nextDouble());

        System.out.println("该居民缴费总额为" + (water.getBill() + gas.getBill()));
    }

}

class Bill{
    protected double volume;

    public Bill(){

    }
    public Bill(double volume){
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public double getBill(){
        return 0.0;
    }
}

class GasBill extends Bill{
    private final double rate = 2.28;

    public GasBill() {

    }

    public GasBill(double volume) {
        super(volume);
    }

    @Override
    public double getBill() {
        return rate * volume;
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
    public double getBill(){
        double rate;
        if (volume > 0 & volume <= 180){
            rate = this.rate[0];
        } else if (volume > 180 & volume <= 260) {
            rate = this.rate[1];
        } else {
            rate = this.rate[2];
        }

        return rate * volume;
    }

}