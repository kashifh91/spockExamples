package com.kashif.spock.example3

import spock.lang.Specification

class ToBeTestedSpec extends Specification {
    def "should return the message with foo prefixed"(){

        given:"ToBeMocked object is mocked"
        def toBeMocked = Mock(ToBeMocked)
        toBeMocked.method("test") >> "mock test"

        and: "An object of ToBeTested class is available"
        ToBeTested toBeTested = new ToBeTested(toBeMocked)

        when: "foo method is tested"
        def result = toBeTested.foo("test")

        then: "result should match the expected value"
        1 * toBeMocked.method("test")
    }
}
