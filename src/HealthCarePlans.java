public class HealthCarePlans
{
    private double dPremium;
    private double dDeductible;
    private double dCoinsurance;
    private double dBills;
    private double dNewBills;
    private double dTotalHealthCosts;

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

    public HealthCarePlans(double dPremium, double dDeductible, double dCoinsurance, double dBills)
    {
        this.dPremium = dPremium;
        this.dDeductible = dDeductible;
        this.dCoinsurance = dCoinsurance;
        this.dBills = dBills;
        dCalculateTotalHealthCosts();
    }

    public double getdBills()
    {
        return dBills;
    }
    public double getdCoinsurance()
    {
        return dCoinsurance;
    }
    public double getdDeductible()
    {
        return dDeductible;
    }
    public double getdPremium()
    {
        return dPremium;
    }

    public void setdBills(double dBills)
    {
        this.dBills = dBills;
    }
    public void setdCoinsurance(double dCoinsurance)
    {
        this.dCoinsurance = dCoinsurance;
    }
    public void setdDeductible(double dDeductible)
    {
        this.dDeductible = dDeductible;
    }
    public void setdPremium(double dPremium)
    {
        this.dPremium = dPremium;
    }

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
    public double getdTotalHealthCosts()
    {
        return dTotalHealthCosts;
    }
}
