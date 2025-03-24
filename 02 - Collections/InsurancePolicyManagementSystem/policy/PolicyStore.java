package collections.InsurancePolicyManagementSystem.policy;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PolicyStore {
    HashSet<Policy> policySet;
    LinkedHashSet<Policy> policyLinkedSet;
    TreeSet<Policy> policyTreeSet;

    public PolicyStore() {
        policySet = new HashSet<>();
        policyLinkedSet = new LinkedHashSet<>();
        policyTreeSet = new TreeSet<>(Comparator.comparing(Policy::getExpirationDate));
    }

    public HashSet<Policy> getPolicySet() {
        return policySet;
    }

    public void addToPolicySet(Policy policy) {
        policySet.add(policy);
    }

    public LinkedHashSet<Policy> getPolicyLinkedSet() {
        return policyLinkedSet;
    }

    public void addToPolicyLinkedSet(Policy policy) {
        policyLinkedSet.add(policy);
    }

    public TreeSet<Policy> getPolicyTreeSet() {
        return policyTreeSet;
    }

    public void addToPolicyTreeSet(Policy policy) {
        policyTreeSet.add(policy);
    }


    public void addPolicy(Policy policy) {
        policySet.add(policy);
        policyLinkedSet.add(policy);
        policyTreeSet.add(policy);
    }

    public void removePolicy(Policy policy) {
        policySet.remove(policy);
        policyLinkedSet.remove(policy);
        policyTreeSet.remove(policy);
    }

    public void displayPolicies(){
        for (Policy policy : policySet) {
            System.out.println(policy);
        }
    }

    public void displayPolicies(int days){
        LocalDate today = LocalDate.now();
        LocalDate limitDate = today.plusDays(days);
        for (Policy p : policySet) {
            if (!p.getExpirationDate().isBefore(today) && !p.getExpirationDate().isAfter(limitDate)) {
                System.out.println(p);
            }
        }
    }

    public void displayPolicies(String coverageType){
        for (Policy p : policySet) {
            if (p.getCoverageType().equals(coverageType)) {
                System.out.println(p);
            }
        }
    }
}