package wzorzec_stan.egzample_1;

public abstract class VendingMachineState {

    public abstract void changeVendingMachineState(VendingMachine context);

    public abstract void getProduct(int amount, VendingMachine context);
}
