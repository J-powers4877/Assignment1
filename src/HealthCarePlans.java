/**
 * This class consists of two (2) constructors, one for pre-defined health care plans and one for a user defined health care plan.
 * <p>It also contains a function to calculate the total health care costs.</p>
 *
 * @author Justin Powers
 */
public class HealthCarePlans
{
    private double dPremium;
    private double dDeductible;
    private double dCoinsurance;
    private double dBills;
    private double dNewBills;
    private double dTotalHealthCosts;

    /**
     * HealthCarePlans Constructor that is used for the pre-defined health care plans and user-defined medical bills.&nbsp;Calculates the total health costs based on the plan.
     *
     * @param sHealthCarePlan This is the user's Health Care Plan.
     * @param dBills This is the user's medical bills.
     */
    public HealthCarePlans(String sHealthCarePlan, double dBills)
    {
        if(sHealthCarePlan.equals("planA") || sHealthCarePlan.equals("PlanA"))
        {
            this.dPremium = 5000;
            this.dDeductible = 1000;
            this.dCoinsurance = .2;
            this.dBills = dBills;
            dCalculateTotalHealthCosts();
        }
        else if(sHealthCarePlan.equals("planB") || sHealthCarePlan.equals("PlanB"))
        {
            this.dPremium = 3000;
            this.dDeductible = 4000;
            this.dCoinsurance = .25;
            this.dBills = dBills;
            dCalculateTotalHealthCosts();
        }
    }

    /**
     * HealthCarePlans Constructor that takes the users defined Premium, Deductible, Coinsurance, and Medical Bills.&nbsp;Calculates the total health costs based on the user's input.
     *
     * @param dPremium User's Defined Premium
     * @param dDeductible User's Defined Deductible
     * @param dCoinsurance User's Defined Coinsurance
     * @param dBills User's Defined Medical Bills
     */
    public HealthCarePlans(double dPremium, double dDeductible, double dCoinsurance, double dBills)
    {
        this.dPremium = dPremium;
        this.dDeductible = dDeductible;
        this.dCoinsurance = dCoinsurance;
        this.dBills = dBills;
        dCalculateTotalHealthCosts();
    }

    /** Returns the private dBills variable.
     * @return The medical bills that are defined.
     */
    public double getdBills()
    {
        return dBills;
    }

    /** Returns the private dCoinsurance variable.
     * @return The defined coinsurance as a decimal.
     */
    public double getdCoinsurance()
    {
        return dCoinsurance;
    }

    /** Returns the private dDeductible variable.
     * @return The deductible that is defined.
     */
    public double getdDeductible()
    {
        return dDeductible;
    }

    /** Returns the private dBills variable.
     * @return The premium that is defined.
     */
    public double getdPremium()
    {
        return dPremium;
    }

    /**
     * @return The calculated bills over the deductible.
     */
    public double getdNewBills() { return dNewBills; }

    /** Returns the private dBills variable.
     * @return The calculated total health care costs.
     */
    public double getdTotalHealthCosts()
    {
        return dTotalHealthCosts;
    }


    /**
     * @param dBills The total medical bills that the users enters.
     */
    public void setdBills(double dBills)
    {
        this.dBills = dBills;
    }

    /**
     * @param dCoinsurance Either the defined coinsurance from the constructor or the user's defined coinsurance.
     */
    public void setdCoinsurance(double dCoinsurance)
    {
        this.dCoinsurance = dCoinsurance;
    }

    /**
     * @param dDeductible Either the defined deductible from the constructor or the user's defined deductible.
     */
    public void setdDeductible(double dDeductible)
    {
        this.dDeductible = dDeductible;
    }

    /**
     * @param dPremium Either the defined premium from the constructor or the user's defined deductible.
     */
    public void setdPremium(double dPremium)
    {
        this.dPremium = dPremium;
    }

    /**
     * dCalculateTotalHeathCosts takes no variables, but uses the defined variables to calculate the total health costs.
     */
    public void dCalculateTotalHealthCosts()
    {
        if(dBills > dDeductible)
        {
            dNewBills = dBills - dDeductible;
            dNewBills = dNewBills * dCoinsurance;

            this.dTotalHealthCosts = dPremium + dDeductible + dNewBills;
        }
        else if(dBills == 0)
        {
            this.dTotalHealthCosts = dPremium;
        }
        else
        {
            this.dTotalHealthCosts = dPremium + dBills;
        }
    }
}