package com.houarizegai.hr.documents;

public class WorkContract implements ExportablePdf, ExportableJson, ExportableText {

    private String content;

    public WorkContract(String content) {
        this.content = content;
    }

    @Override
    public byte[] toPdf() {
        return content.getBytes();
    }

    @Override
    public String toJson() {
        return "{'content':'" + this.content + "'}";
    }

    @Override
    public String toTxt() {
        return this.content;
    }
}
