package com.devteria.identityservice.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(999,"Uncategorized exception"),
    INVALID_KEY(1001,"Uncategorized exception"),
    USER_EXISTED(1002,"User existed"),
    USERNAME_INVALID(1003, "Username must be at least 3 charactes"),
    INVALID_PASSWORD(1004, "Password must be at least 8 charactes"),
    USER_NOT_EXISTED(1005,"User not existed")
    ;
    private int code;
    private String message;

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
