package com.example.vhs.activity;

import android.os.Bundle;

import com.example.vhs.base.BaseActivity;
import com.example.vhs.fragment.other.LoginFragment;

public class LoginActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        openPage(LoginFragment.class, getIntent().getExtras());
    }
}
