package com.pqcuong.server.model.response;

public class BaseResponse {
    private boolean isSuccess;
    private String message;
    private Object data;

    public BaseResponse(Object data) {
        this.data = data;
        isSuccess=true;
    }

    public BaseResponse(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
