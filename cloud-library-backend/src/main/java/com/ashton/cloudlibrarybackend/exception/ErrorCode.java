package com.ashton.cloudlibrarybackend.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    SUCCESS(0, "Success"),
    PARAMS_ERROR(40000, "Invalid request parameters"),
    NOT_LOGIN_ERROR(40100, "User not logged in"),
    NO_AUTH_ERROR(40101, "Unauthorized access"),
    NOT_FOUND_ERROR(40400, "Requested resource not found"),
    FORBIDDEN_ERROR(40300, "Forbidden"),
    SYSTEM_ERROR(50000, "Internal system error"),
    OPERATION_ERROR(50001, "Operation failed");

    /**
     * Error code
     */
    private final int code;

    /**
     * Error message
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
