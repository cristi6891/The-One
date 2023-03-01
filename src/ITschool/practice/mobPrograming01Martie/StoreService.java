package ITschool.practice.mobPrograming01Martie;

public class StoreService {

    Fruits fruits = new Fruits();

    public void setStock() {

        fruits.setApples(2000);
        fruits.setBananas(1000);
    }

    public void setPrice() {

        fruits.setPriceApples(4);
        fruits.setPriceBananas(20);
    }

    private boolean hasEnoughMoney(double purchasePrice, double clientBudget) {

        if (purchasePrice <= clientBudget) {
            return true;
        }
        System.out.println("You don't have enough money");
        return false;


    }

    public double getApplePurchasePrice(int appleQuantity) {

        if (fruits.getApples() >= appleQuantity) {
            fruits.setApples(fruits.getApples() - appleQuantity);
            System.out.println("You bought " + appleQuantity + " apples");
            return appleQuantity * fruits.getPriceApples();
        }
        return 0;

    }

    public int getApplesStock() {
        return fruits.getApples();
    }
}
