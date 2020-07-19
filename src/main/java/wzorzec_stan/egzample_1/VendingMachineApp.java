package wzorzec_stan.egzample_1;

public class VendingMachineApp {
    public static void main(String[] args) {

        VendingMachine context = new VendingMachine();

        context.setState(new VendingDepositState());

        context.buyProduct(5);
        context.takeProduct();

        context.buyProduct(6);
        context.takeProduct();

        context.buyProduct(2);

        context.buyProduct(8);
        context.takeProduct();
    }
}
