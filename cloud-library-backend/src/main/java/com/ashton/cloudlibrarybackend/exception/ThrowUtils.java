package com.ashton.cloudlibrarybackend.exception;

/**
 * Utility class for throwing exceptions based on conditions.
 */
public class ThrowUtils {

    /**
     * Throw the provided exception if the condition is true.
     *
     * @param condition        condition to evaluate
     * @param runtimeException the exception to throw
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * Throw BusinessException with the specified ErrorCode if the condition is true.
     *
     * @param condition condition to evaluate
     * @param errorCode error code for the exception
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    /**
     * Throw BusinessException with ErrorCode and custom message if the condition is true.
     *
     * @param condition condition to evaluate
     * @param errorCode error code for the exception
     * @param message   custom error message
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }
}
