package com.ashton.cloudlibrarybackend.common;

import com.ashton.cloudlibrarybackend.exception.ErrorCode;

public class ResultUtils {

    /**
     * Success response
     *
     * @param data response data
     * @param <T>  data type
     * @return BaseResponse with success code
     */
    public static <T> BaseResponse<T> success(T data) {return new BaseResponse<>(0, data, "ok");
    }

    /**
     * Error response using ErrorCode
     *
     * @param errorCode predefined error code
     * @return BaseResponse with error code and default message
     */
    public static BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * Error response with custom code and custom message
     *
     * @param code    error code
     * @param message error message
     * @return BaseResponse containing custom error details
     */
    public static BaseResponse<?> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * Error response using ErrorCode but with custom message
     *
     * @param errorCode error code definition
     * @param message   custom error message
     * @return BaseResponse with error code and custom message
     */
    public static BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}