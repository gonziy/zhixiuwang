package com.zxxapp.mall.maintenance.model;

import com.zxxapp.mall.maintenance.bean.shopping.ShopListBean;
import com.zxxapp.mall.maintenance.http.HttpClient;
import com.zxxapp.mall.maintenance.http.RequestImpl;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by jingbin on 2017/1/17.
 * 分类数据: http://gank.io/api/data/数据类型/请求个数/第几页  的Model
 * 好处之一是请求数据接口可以统一，不用每个地方都写请求的接口，更换接口方便。
 * 其实代码量也没有减少多少，但维护起来方便。
 */

public class ShopListModel {

    private String serviceId = "";

    public void setData(String serviceId) {

        this.serviceId = serviceId;
    }

    public void getData(final RequestImpl listener) {

        // 添加新的参数
        Subscription subscription = HttpClient.Builder.getZhiXiuServer().getShopListByServiceId(this.serviceId)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShopListBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.loadFailed();

                    }

                    @Override
                    public void onNext(ShopListBean userAddressBean) {
                        listener.loadSuccess(userAddressBean);

                    }
                });
        listener.addSubscription(subscription);
    }
}
