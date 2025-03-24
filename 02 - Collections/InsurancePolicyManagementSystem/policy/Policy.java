package collections.InsurancePolicyManagementSystem.policy;
import java.time.LocalDate;

public class Policy {
    private static int totalPolicies = 0;
    private int policyNumber;
    private String policyHolderName;
    private LocalDate expirationDate;
    private String coverageType;
    private int premiumAmount;

    public Policy(String policyHolderName, String coverageType, int premiumAmount) {
        totalPolicies++;
        this.policyNumber = totalPolicies;
        this.policyHolderName = policyHolderName;
        this.expirationDate = LocalDate.now().plusYears(2); // Sets the expiration date to 2 years from the current date.
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public static int getTotalPolicies() {
        return totalPolicies;
    }

    public static void setTotalPolicies(int totalPolicies) {
        Policy.totalPolicies = totalPolicies;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(int premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Policy Holder Name: " + policyHolderName + ", Policy Expiration Date: " + expirationDate;
    }
}