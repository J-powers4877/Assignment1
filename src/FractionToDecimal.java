public class FractionToDecimal
{
    private double dNumerator;
    private double dDenominator;
    private double dDecimal;

    public FractionToDecimal(String sFraction)
    {
        String[] sSplitFraction = sFraction.split("/");
        setdNumerator(Integer.parseInt(sSplitFraction[0]));
        setdDenominator(Integer.parseInt(sSplitFraction[1]));
        setdDecimal(dNumerator/dDenominator);
    }

    public double getdDenominator()
    {
        return dDenominator;
    }

    public double getdNumerator()
    {
        return dNumerator;
    }

    public double getdDecimal()
    {
        return dDecimal;
    }

    public void setdDenominator(double dDenominator)
    {
        this.dDenominator = dDenominator;
    }

    public void setdNumerator(double dNumerator)
    {
        this.dNumerator = dNumerator;
    }

    public void setdDecimal(double dDecimal)
    {
        this.dDecimal = dDecimal;
    }
}
