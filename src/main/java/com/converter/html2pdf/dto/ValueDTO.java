package com.converter.html2pdf.dto;

public class ValueDTO {

    private String name;

    private String emailAddress;

    private String extra;

    public String getName() {
        return name;
    }

    public ValueDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public ValueDTO setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getExtra() {
        return extra;
    }

    public ValueDTO setExtra(String extra) {
        this.extra = extra;
        return this;
    }
}
