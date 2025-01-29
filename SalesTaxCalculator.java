public class SalesTaxCalculator {
    public static void main(String[] args) {
        // validate arguments
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <state> <saleAmount>");
            return;
        }

        String stateName = args[0];
        double saleAmount;

        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid sale amount. Please provide a valid number.");
            return;
        }

        State state;
        // determine the state based on the input
        switch(stateName.toLowerCase()) {
            case "alaska":
                state = new Alaska();
                state.setTaxBehavior(new NoTax());
                break;
            case "indiana":
                state = new Indiana();
                state.setTaxBehavior(new SevenPercent());
                break;
            case "hawaii":
                state = new Hawaii();
                state.setTaxBehavior(new FourPointFivePercent());
                break;
            default:
                System.out.println("Unsupported state. Please use 'Alaska', 'Indiana', or 'Hawaii'.");
                return;
        }

        // show the sales tax
        state.showTax(saleAmount);
    }
}