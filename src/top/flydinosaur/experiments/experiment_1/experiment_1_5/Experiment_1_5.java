package top.flydinosaur.experiments.experiment_1.experiment_1_5;

import java.util.Scanner;

public class Experiment_1_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Star star = new Star();
        star.setType(scanner.nextInt());
        Position p = new Position();
        p.setRow(scanner.nextInt());
        p.setColumn(scanner.nextInt());
        star.setPosition(p);
        System.out.println(star.toString());
    }

}

class Star{
    private final int RED = 0;
    private final int BLUE = 1;
    private final int YELLOW = 2;
    private final int GREEN = 3;
    private int type;
    private Position position = new Position();

    public Star(){

    }
    public Star(Position position, int type){
        this.position = position;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString(){
        String color = "";
        if (type == 0){
            color = "红色";
        }else if (type == 1){
            color = "蓝色";
        }else if (type == 2){
            color = "黄色";
        }else{
            color = "绿色";
        }
        return "颜色" + "\t" + color + position.toString();
    }
}

class Position{
    private int row;
    private int column;
    public Position(){

    }
    public Position(int row, int colunm){
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    @Override
    public String toString(){
        return "\n行" + "\t" + row + "\n列" + "\t" + column;
    }

}

