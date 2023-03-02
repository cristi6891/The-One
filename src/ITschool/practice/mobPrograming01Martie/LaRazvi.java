package ITschool.practice.mobPrograming01Martie;

public class LaRazvi {

    public static void main(String[] args) {

        StoreService storeService = new StoreService();
        storeService.setStock();
        storeService.setPrice();
        int appleStock = storeService.getApplesStock();
        System.out.println(appleStock);

        Client client = new Client();
        client.setBudget(90000);

        storeService.getApplePurchasePrice(15);
        storeService.getApplesStock();
        System.out.println(appleStock);


    }
}
