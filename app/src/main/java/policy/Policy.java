package policy;

public class Policy {
	
	private final int companyId;
	private final int branchId;
	private final String policyNumber;
	
	public Policy(int companyId, int branchId, String policyNumber) {
		this.companyId = companyId;
		this.branchId = branchId;
		this.policyNumber = policyNumber;
	}

	public int getCompanyId() {
		return companyId;
	}

	public int getBranchId() {
		return branchId;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}
	
}
