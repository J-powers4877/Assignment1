/**
 * This class consists of One (1) constructors, which takes the user-defined fraction, splits .
 * <p>It also contains a function to calculate the total health care costs.</p>
 */
public class FractionToDecimal
{
    /** Used in the FractionToDecimal constructor and setdDecimal, is the first value split from the fraction.
     *
     */
    private double dNumerator;

    /** Used in the FractionToDecimal constructor and setdDecimal, is the second value split from the fraction.
     *
     */
    private double dDenominator;

    /** Used in the setdDecimal, is value of dNumerator divided by dDenominator.
     *
     */
    private double dDecimal;

    /** FractionToDecimal Constructor that takes the fraction the user inputs, splits it into the numerator and denominator, then calculates the decimal equivalent.
     * @param sFraction The user inputted fraction from the main function.
     */
    public FractionToDecimal(String sFraction)
    {
        String[] sSplitFraction = sFraction.split("/");
        setdNumerator(Integer.parseInt(sSplitFraction[0]));
        setdDenominator(Integer.parseInt(sSplitFraction[1]));
        setdDecimal(dNumerator/dDenominator);
    }

    /** Returns the private dDenominator variable that was split from the fraction.
     * @return dDenominator
     */
    public double getdDenominator()
    {
        return dDenominator;
    }

    /** Returns the private dNumerator variable that was split from the fraction.
     * @return dNumerator
     */
    public double getdNumerator()
    {
        return dNumerator;
    }

    /** Returns the private dDecimal variable that calculated from the dNumerator and dDenominator.
     * @return dDecimal
     */
    public double getdDecimal()
    {
        return dDecimal;
    }

    /** Sets the dDenominator variable.
     * @param dDenominator Denominator from the user-defined fraction.
     */
    public void setdDenominator(double dDenominator)
    {
        this.dDenominator = dDenominator;
    }

    /** Sets the dNumerator variable.
     * @param dNumerator Numerator from the user-defined fraction.
     */
    public void setdNumerator(double dNumerator)
    {
        this.dNumerator = dNumerator;
    }

    /** Sets the dDecimal variable.
     * @param dDecimal Decimal Equivalent of the user-defined fraction.
     */
    public void setdDecimal(double dDecimal)
    {
        this.dDecimal = dDecimal;
    }
}
