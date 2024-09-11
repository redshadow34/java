package semaine1;

public class CountDown {
    private static int nb = 100;

    private int val;

    public CountDown() {
        val=nb;
        if(nb>0) nb--;
    }

    public static int getNb() {
        return nb;
    }
    public int getVal() {
        return val;
    }

    public static void main(String[] args) {
        CountDown c1 = new CountDown();
        c1.getVal();
        CountDown.getNb();
        System.out.println("Finish");
    }
}
