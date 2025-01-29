public abstract class State {
    private String name;
    private SalesTaxBehavior taxBehavior;

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxBehavior(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
    }

    public void showTax(double value) {
        Double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, name, tax);
    }
}