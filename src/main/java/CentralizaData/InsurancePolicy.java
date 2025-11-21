package CentralizaData;

public interface InsurancePolicy {
    String getPolicyNumber();
    String getPolicyHolder();
    double PremiumAmount();
    void SetPremium(double Premium);
    String GetCoverageDetails();

}
