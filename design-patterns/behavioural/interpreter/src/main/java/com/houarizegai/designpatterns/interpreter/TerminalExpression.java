package com.houarizegai.designpatterns.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer st = new StringTokenizer(context);
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            if(token.equals(data))
                return true;
        }
        return false;
    }
}
