package top.flydinosaur.experiments.experiment_2.experiment_2_2;

import java.util.Scanner;

public class Experiment_2_2 {  //记得改为TestTrolly

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        //创建购物车
        Good[] goods=new Good[2];
        String origin=input.next();
        String name1=input.next();
        double unitPrice1=input.nextDouble();
        double discount1=input.nextDouble();
        double amount1=input.nextDouble();
        goods[0]=new Fruit(origin,name1, unitPrice1, discount1, amount1);
        String breed=input.next();
        String name2=input.next();
        double unitPrice2=input.nextDouble();
        double discount2=input.nextDouble();
        double amount2=input.nextDouble();
        goods[1]=new Drink(breed,name2, unitPrice2, discount2, amount2);
        Trolly trolly=new Trolly("tid",goods);

        System.out.println();
        System.out.println(trolly.toString());

    }

}

class Trolly {
    private String tid;
    private Good[] goods;

    public Trolly(String tid, Good[] goods) {
        this.tid = tid;
        this.goods = goods;
    }

    public double sum() {
        double sum = 0;
        for (Good good : goods) {
            sum += good.count();
        }
        return sum;
    }

    @Override
    public String toString(){
        String temp= "";
        temp += "购物车" + tid + "共有" + goods.length + "件商品\n";
        for (Good good : goods) {
            temp += good.toString();
        }
        temp += "应付款" + sum() + "元";
        return temp;
    }

}

class Good {
    private String name;
    private double unitPrice;
    private double discount;
    private double amount;

    public Good() {
        discount = 1;
    }

    public Good(String name, double unitPrice, double discount, double amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.amount = amount;
    }

    public double count() {
        return unitPrice * discount * amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class Fruit extends Good {

    private String origin;

    public Fruit(String origin, String name, double unitPrice, double discount, double amount) {
        super(name, unitPrice, discount, amount);
        this.origin = origin;
    }

    @Override
    public String toString() {
        return super.getName() + "\t产地=" + origin + "\t单价(元/公斤)=" + super.getUnitPrice() + "\t折扣=" + super.getDiscount() + "\t重量(公斤)=" + super.getAmount() + "\n";
    }

}

class Drink extends Good {
    private String breed;

    public Drink(String breed, String name, double unitPrice, double discount, double amount) {
        super(name, unitPrice, discount, amount);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.getName() + "\t品牌=" + breed + "\t单价(元/瓶)=" + super.getUnitPrice() + "\t折扣=" + super.getDiscount() + "\t数量(瓶)=" + super.getAmount() + "\n";
    }

}