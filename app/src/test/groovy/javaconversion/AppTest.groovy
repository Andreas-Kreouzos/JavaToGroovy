package javaconversion

import spock.lang.Specification

class AppTest extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result != null
		
		and:
		app.getGreeting() == 'Hello World!'
    }
}
