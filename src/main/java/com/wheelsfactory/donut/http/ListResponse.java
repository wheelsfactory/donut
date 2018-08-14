package com.wheelsfactory.donut.http;

import com.wheelsfactory.donut.domain.Baby;

import java.util.ArrayList;
import java.util.List;

public class ListResponse extends BaseResponse {

    private List<Object> data = new ArrayList<>();

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
