package top.flydinosaur.homeworks.homework_3.homework_3_2.homework_3_2_1;

import java.util.Scanner;

public class Homework_3_2_1 {

    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        Scanner scanner = new Scanner(System.in);
        tv.setVolume(scanner.nextInt());
        tv.setChannel(scanner.nextInt());
        System.out.println("tv的音量和频道为" + tv.getVolume() + "和" + tv.getChannel());
        tv.channelUp();
        tv.volumeDown();
        System.out.println("调频道和音量后的音量和频道为" + tv.getVolume() + "和" + tv.getChannel());
        tv.turnOff();
    }


    static class TV{

        private int channel;
        private int volumeLevel;
        private boolean on;

        public TV(){
            this.channel = 1;
            this.volumeLevel = 1;
            this.on = false;
        }

        public void turnOn(){
            this.on = true;
        }
        public void turnOff(){
            this.on = false;
        }

        public void setChannel(int channel){
            if (channel >=1 & channel <= 120){
                this.channel = channel;
            }
        }

        public int getChannel(){
            return this.channel;
        }

        public void setVolume(int volume){
            if (volume >=1 & volume <= 7){
                this.volumeLevel = volume;
            }
        }

        public int getVolume() {
            return volumeLevel;
        }

        public void channelUp(){
            if (this.channel <120 & this.channel > 0){
                this.channel += 1;
            }
        }

        public void channelDown(){
            if (this.channel > 1 & this.channel <= 120){
                this.channel -= 1;
            }
        }

        public void volumeUp(){
            if (this.volumeLevel >= 0 & this.volumeLevel < 7){
                this.volumeLevel += 1;
            }
        }

        public void volumeDown(){
            if (this.volumeLevel > 1 & this.volumeLevel <= 7){
                this.volumeLevel -= 1;
            }
        }

    }



}