package com.houarizegai.hr.documents;

/*
Common interface used in application when there is
a need for document exports
 */
public interface ExportableDocument {
    String toTxt();
    byte[] toPdf();
    String toJson();
}
