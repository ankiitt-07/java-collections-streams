package collections.InsurancePolicyManagementSystem.preformanceComparision;
import collections.InsurancePolicyManagementSystem.policy.*;

public class PerformanceTest {
    public static void start(){
        PolicyStore policyStore = new PolicyStore();

        int size = 100000;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Policy policy = new Policy("test", "test", i);
            policyStore.addToPolicySet(policy);
        }
        long hashSetTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Policy policy = new Policy("test", "test", i);
            policyStore.addToPolicyLinkedSet(policy);
        }
        long linkedSetTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Policy policy = new Policy("test", "test", i);
            policyStore.addToPolicyTreeSet(policy);
        }
        long treeSetTime = System.currentTimeMillis() - startTime;


        System.out.println("Policy HashSet: " + hashSetTime + "ms");
        System.out.println("Policy LinkedHashSet: " + linkedSetTime + "ms");
        System.out.println("Policy TreeHashSet: " + treeSetTime + "ms");
    }
}