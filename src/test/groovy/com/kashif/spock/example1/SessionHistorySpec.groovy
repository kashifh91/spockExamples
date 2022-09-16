package com.kashif.spock.example1

import spock.lang.Specification

class SessionHistorySpec extends Specification {
    def "capturing the history of sessions"() {

        given: "a service to capture history of sessions"
        def sessionHistory = new SessionHistory()

        and: "two valid sessions held"
        def session1 = Session.of("Kashif","SpockTesting","9th May")
        def session2 = Session.of("Volunteer","RandomTopic","Random Date")

        when: "first session is added in the service"
        sessionHistory.addSession(session1)

        then: "the service should have first session"
        sessionHistory.getAllSessions() == [session1]

//        when: "second session is added in the service"
//        sessionHistory.addSession(session2)
//
//        then: "the service should have both the sessions"
//        sessionHistory.getAllSessions() == [session1, session2]
    }
}
