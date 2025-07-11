package com.gatekeeper.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {
    private boolean success;
    private T data;
    private String errorCode;
    private String errorMessage;

    public static <T> Response<T> OK(T data){
        return new Response<>(true, data, null, null);
    }
}
