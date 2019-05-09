package com.kashif.spock.example1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class Session {
    private String speakerName;
    private String topic;
    private String date;
}
