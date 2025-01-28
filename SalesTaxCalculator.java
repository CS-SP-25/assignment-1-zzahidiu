public class SalesTaxCalculator {
    public static void main(String[] args) {
        // validate arguments
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <state> <saleAmount>");
            return;
        }

        String stateName = args[0];
        double saleAmount;

        try { // Make sure it's a valid argument
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid sale amount. Please provide a valid number.");
            return;
        }

        State state;
        // determine the state based on the input and ensure argument check
        if (stateName.equalsIgnoreCase("Alaska")) {
            state = new Alaska();
        } else if (stateName.equalsIgnoreCase("Indiana")) {
            state = new Indiana();
        } else {
            System.out.println("Unsupported state. Please use 'Alaska' or 'Indiana'.");
            return;
        }

        // show the sales tax
        state.showTax(saleAmount);
    }
}

