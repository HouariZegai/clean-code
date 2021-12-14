package com.houarizegai.designpatterns.adapter;

import org.junit.jupiter.api.Test;

class AdapterTest {

    @Test
    public void testAdapter() {
        // This class Represent the "School" in the example bellow
        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("This is just an assignment we wanna do.");
    }
}