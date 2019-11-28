package com.houarizegai.adapter;

public class AdapterPatternDemo {
    // AdapterPatternDemo Represent the "School" in this example bellow
    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("This is just an assignment wanna do.");
    }
}
