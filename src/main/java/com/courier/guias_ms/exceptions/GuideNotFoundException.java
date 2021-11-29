package com.courier.guias_ms.exceptions;

public class GuideNotFoundException extends  RuntimeException {
    public GuideNotFoundException (String message) {
        super(message);
    }
}
