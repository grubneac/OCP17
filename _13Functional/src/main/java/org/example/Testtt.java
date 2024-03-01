package org.example;

public class Testtt {
    public static void main(String[] args) {
        Samples tt = new Samples(5);
        Integer ss = 5;
        changeTT(tt,ss);
        System.out.println(tt);
        System.out.println(ss);

    }

    public static void changeTT(Samples tt, Integer ss) {
        tt.setNum(6);
        ss = 6;

    }
}

class Samples{
    private int num;

    public Samples(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Samples{" +
                "num=" + num +
                '}';
    }
}
