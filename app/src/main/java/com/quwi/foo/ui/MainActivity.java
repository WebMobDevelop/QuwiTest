package com.quwi.foo.ui;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.quwi.foo.R;
import com.quwi.foo.databinding.ActivityMainBinding;
import com.quwi.foo.ui.home.ProjectFragment;
import com.quwi.foo.ui.login.LoginFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setFragment(R.id.main, new LoginFragment());
    }


    public void setFragment(int layoutId, Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(layoutId, fragment)
                .commit();
    }

    @Override
    public void onBackPressed() {
        if(getSupportFragmentManager().getFragments().size() > 0) {
            Fragment currentFragment = getSupportFragmentManager().getFragments().get(0);
            if (currentFragment instanceof ProjectFragment) {
                finish();
                return;
            }
        }
        super.onBackPressed();
    }
}
