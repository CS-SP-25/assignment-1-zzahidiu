public class FourPointFivePercent implements SalesTaxBehavior {
    @Override
    public Double compute(Double value) {
        return value * 0.045; // 4.5% sales tax
    }
}