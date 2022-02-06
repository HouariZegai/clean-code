package com.houarizegai.designpatterns.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterpreterTest {

    @Test
    void TerminalExpressionInterpreter_ShouldReturnTrue() {
        String context = "Cats";
        Expression define = new TerminalExpression("Cats");

        assertTrue(define.interpret(context));
    }

    @Test
    void orTerminalExpression_ShouldReturnTrue() {
        Expression exp1 = new TerminalExpression("Cats");
        Expression exp2 = new TerminalExpression("Lions");
        Expression exp3 = new TerminalExpression("lions");

        Expression orExp = new AndExpression(exp1, new OrExpression(exp2, exp3));

        String search = "Cats lions";
        assertTrue(orExp.interpret(search));
    }
}
