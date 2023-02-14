package com.example.vhs.fragment.expands;

import android.annotation.SuppressLint;

import com.example.vhs.R;
import com.example.vhs.base.BaseFragment;
import com.example.vhs.base.http.entity.Book;
import com.example.vhs.base.http.subscriber.TipRequestSubscriber;
import com.example.vhs.utils.TypeUtils;
import com.xuexiang.xhttp2.XHttp;
import com.xuexiang.xhttp2.exception.ApiException;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;

import java.lang.reflect.Type;
import java.util.List;

import io.reactivex.Observable;

@Page(name = "ex", anim = CoreAnim.none)
public class ExFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_cm;
    }

    @SuppressLint("CheckResult")
    @Override
    protected void initViews() {
        Observable<List<Book>> observable = XHttp.post("/test/t3")
                .syncRequest(false)
                .onMainThread(true)
                .execute((Type) TypeUtils.getListType(Book.class));

        observable.subscribeWith(new TipRequestSubscriber<List<Book>>() {
            @Override
            protected void onSuccess(List<Book> books) {
                int b = books.size();
                for (int a = 0; a < b; a++) {
                    Book k = books.get(a);
                    System.out.println(k.getYw());
                    System.out.println(k.getFy());
                }
            }

            @Override
            public void onError(ApiException e) {
                System.out.println(e.toString());
            }
        });
    }

    @Override
    protected void initListeners() {

    }
}
