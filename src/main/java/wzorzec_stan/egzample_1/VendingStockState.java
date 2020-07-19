package wzorzec_stan.egzample_1;

public class VendingStockState extends VendingMachineState {
    @Override
    public void changeVendingMachineState(VendingMachine context) {
        context.setState(new VendingDepositState());
    }

    @Override
    public void getProduct(int amount, VendingMachine context) {
        System.out.println("money delivered, amount " + amount + " give product which costing 5");
        changeVendingMachineState(context);
    }
}