package com.kashif.spock.example1;


import java.util.ArrayList;
import java.util.List;

public class SessionHistory {
    private List<Session> sessionList;

    public SessionHistory() {
        sessionList= new ArrayList<>();
    }

    public void addSession(Session session){
        sessionList.add(session);
    }
    public List<Session> getAllSessions(){
        return sessionList;
    }
}
