package com.houarizegai.hr.documents;

public class WorkContract implements
        ExportableJson,
        ExportableText,
        ExportablePdf {
    private String content;

    public WorkContract(String content) {
        this.content = content;
    }

    @Override
    public byte[] toPdf() {
        // Test implementation, in reality this would
        // be more complex
        return content.getBytes();
    }

    @Override
    public String toJson() {
        // Test implementation, in reality this would
        // be more complex
        return "{'content':'" + this.content + "'}";
    }

    @Override
    public String toTxt() {
        // Test implementation, in reality this would
        // be more complex
        return this.content;
    }
}
