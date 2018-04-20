package com.zxxapp.mall.maintenance.bean;

/**
 * Created by Thinten on 2017-12-17
 * www.thinten.com
 * 9486@163.com.
 */

public class ResultBean {

    /**
     * success : false
     * msg : 发送订单失败
     */

    private String success;
    private String msg;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
