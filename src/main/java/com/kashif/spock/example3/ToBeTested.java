package com.kashif.spock.example3;

public class ToBeTested {
    ToBeMocked toBeMocked;
    public ToBeTested(ToBeMocked toBeMocked) {
        this.toBeMocked = toBeMocked;
    }

    public String foo(String str){
        String result = toBeMocked.method(str);
        return "foo "+result;
    }
}
