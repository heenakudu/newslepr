package CentralizaData;

public class AutoInsurancePolicy implements InsurancePolicy{
  private String PolicyDetails;
  private String PolicyHolder;
  private String CoverageAmount;
  private double PremiumAmount;

  public AutoInsurancePolicy(String PolicyDetails,String PolicyHolder,String CoverageAmount,double PremiumAmount){
      this.PolicyDetails=PolicyDetails;
      this.PolicyHolder=PolicyHolder;
      this.CoverageAmount=CoverageAmount;
      this.PremiumAmount=PremiumAmount;
  }


    @Override
    public String getPolicyNumber() {
        return PolicyDetails;
    }

    @Override
    public String getPolicyHolder() {
        return PolicyHolder;
    }

    @Override
    public double PremiumAmount() {
        return PremiumAmount;
    }

    @Override
    public void SetPremium(double Premium) {
      this.PremiumAmount=Premium;
    }

    @Override
    public String GetCoverageDetails() {
        return CoverageAmount;
    }
}
