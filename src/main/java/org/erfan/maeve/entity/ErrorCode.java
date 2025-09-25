package org.erfan.maeve.entity;

public enum ErrorCode {
    USER_ALREADY_EXISTS(540, "User already exists"),
    USER_NOT_FOUND(541, "User not found"),
    INVALID_PASSWORD(542, "Invalid password"),
    USER_BLOCKED(543, "User is blocked"),
    INTERNAL_ERROR(544, "Internal error");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

