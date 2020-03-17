package dataStructure.list.test.model;

public class Mahjong {

    /**
     * 类型 ：筒、 万 、索
     */
    public int suit;

    /**
     * 点数 : 1、2、3 、4、 5 、 6 、 7 、 8 、 9
     */
    public int rank;

    public Mahjong(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Mahjong{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
