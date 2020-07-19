package wzorzec_stan.egzample_1;


public class VendingDepositState extends VendingMachineState {

    @Override
    public void changeVendingMachineState(VendingMachine context) {
        context.setState(new VendingStockState());
    }

    @Override
    public void getProduct(int amount, VendingMachine context) {

        System.out.println("thrown into machine: " + amount);

        if (amount == 5) {
            System.out.println("payment accepted");
            changeVendingMachineState(context);
        } else if (amount > 5) {
            int sum = amount - 5;
            System.out.println("payment accepted, pay rest of money: " + sum);
            changeVendingMachineState(context);
        } else {
            System.out.println("not enough money");
        }
    }
}
