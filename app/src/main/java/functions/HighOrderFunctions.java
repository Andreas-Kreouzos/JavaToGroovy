package functions;

import policy.Policy;

import java.util.ArrayList;
import java.util.List;

public class HighOrderFunctions {

    public static void main(String[] args) {
        List<Policy> policies = new ArrayList<>();
        policies.add(new Policy(2,3, "22222222"));
        policies.add(new Policy(2,5, "11111111"));
        policies.add(new Policy(2,3, "22222229"));
        policies.add(new Policy(2,5, "11111115"));
        policies.add(new Policy(1,1, "77777777"));

        printPolicyNumbers(policies);
        printPolicyNumbers(new ArrayList<>());
    }

    private static void printPolicyNumbers(List<Policy> policies) {
        if (policies != null) {
            if (policies.size() > 0) {
                System.out.printf("There are %d policies. \n", policies.size());
                System.out.print("The policy numbers are: ");
                for (int i = 0; i < policies.size(); i++) {
                    System.out.print(policies.get(i).getPolicyNumber());
                    if (i != policies.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("");
                return;
            }
        }
        System.out.println("There are no policies");
    }
}
