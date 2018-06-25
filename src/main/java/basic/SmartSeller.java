package basic;

public class SmartSeller implements Seller {
    public int sell(String goods, String clientName) {
        System.out.println("sell "+goods+" to "+clientName);
        return 100;
    }
}
