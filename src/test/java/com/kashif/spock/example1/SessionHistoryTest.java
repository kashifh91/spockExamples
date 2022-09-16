package com.kashif.spock.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SessionHistoryTest {

    @Test
    @DisplayName("capturing the history of sessions")
    public void testSessionHistory(){
        SessionHistory sessionHistory = new SessionHistory();
        Session session1 = Session.of("Kashif","SpockTesting","9th May");
        Session session2 = Session.of("Test","SpockTesting","9th May");
        Session[] expectedSessions = new Session[1];
        expectedSessions[0] = session2;
        sessionHistory.addSession(session1);
        List<Session> allSessions = sessionHistory.getAllSessions();
        Assertions.assertArrayEquals(allSessions.toArray(), expectedSessions);
    }
}
