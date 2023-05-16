package policy;

public class PolicyConsumer {
	
	public static void main(String[] args) {
		
		Policy policy = new Policy(2, 5, "12345678");
		
		System.out.println("Company id: " + policy.getCompanyId()
		+ ", branch id: " + policy.getBranchId()
		+ ", policy number: " + policy.getPolicyNumber());
	}
}
