package com.oops3;

class SubClass extends SuperClass {
    private String subString;

    public SubClass(String value1, String value2) {
        super(value1); 
        subString = value2;
    }

    public String getSubString() {
        return subString;
    }

}
