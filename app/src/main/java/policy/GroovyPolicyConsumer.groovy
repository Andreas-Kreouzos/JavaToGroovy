package policy

class GroovyPolicyConsumer {
	
	static void main(String[] args) {
		
		GroovyPolicy policy = new GroovyPolicy(2, 5, "12345678")
		
		println("Company id: ${policy.companyId}, branch id: ${policy.branchId}, policy number: ${policy.policyNumber}")
	}
}
