package designpattern;

public class SingleTonInstanceDoubleCheck {
    private static volatile SingleTonInstanceDoubleCheck INSTANCE = null;

    private SingleTonInstanceDoubleCheck(){}

    public static SingleTonInstanceDoubleCheck getInstance(){
        if(INSTANCE == null){
            synchronized (SingleTonInstanceDoubleCheck.class){
                if(INSTANCE == null){
                    INSTANCE = new SingleTonInstanceDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(SingleTonInstanceDoubleCheck.getInstance());
        System.out.println(SingleTonInstanceDoubleCheck.getInstance());
        System.out.println(SingleTonInstanceDoubleCheck.getInstance());
    }
}
