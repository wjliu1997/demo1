package com.example.demo.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    private boolean flag;
    private Object data;

    public R(Boolean flag) {
        this.flag = flag;
    }
}
