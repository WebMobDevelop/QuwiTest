package com.quwi.foo.util;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.quwi.foo.model.LoginResponseEntity;
import com.quwi.foo.ui.home.ProjectFragment;

public class Router {

    private final Activity activity;

    public Router(Activity activity) {
        this.activity = activity;
    }

    public void  setProjectListFragment(int containerId, ProjectFragment fragment, LoginResponseEntity loginResult){

        Bundle bundle = new Bundle();
        bundle.putString(ProjectFragment.TOKEN_KEY,loginResult.getToken());
        fragment.setArguments(bundle);

        ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction()
                .replace(containerId,fragment)
                .addToBackStack(null)
                .commit();
    }

}
