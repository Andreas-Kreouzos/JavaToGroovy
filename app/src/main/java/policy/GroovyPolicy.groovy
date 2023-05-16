package policy


class GroovyPolicy {
	
	int companyId
	int branchId
	String policyNumber

	GroovyPolicy(int companyId, int branchId, String policyNumber) {
		this.companyId = companyId
		this.branchId = branchId
		this.policyNumber = policyNumber
	}
}
