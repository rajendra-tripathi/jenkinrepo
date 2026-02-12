package designpattern;

public class SingleTonInstanceBill {

    private SingleTonInstanceBill() {
    }

    private static class HELPER {
        static final SingleTonInstanceBill INSTANCE = new SingleTonInstanceBill();
    }

    public static SingleTonInstanceBill getInstance() {
        return HELPER.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(SingleTonInstanceBill.getInstance());
        System.out.println(SingleTonInstanceBill.getInstance());
        System.out.println(SingleTonInstanceBill.getInstance());
        System.out.println(SingleTonInstanceBill.getInstance());
    }
}
