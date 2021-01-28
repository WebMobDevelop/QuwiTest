package com.quwi.foo.ui.login;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.quwi.foo.R;
import com.quwi.foo.databinding.LoginViewBinding;
import com.quwi.foo.model.LoginResponseEntity;
import com.quwi.foo.ui.base.BaseFragment;
import com.quwi.foo.ui.base.ViewModelFactory;
import com.quwi.foo.ui.home.ProjectFragment;
import com.quwi.foo.util.Router;

import java.util.Objects;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends BaseFragment implements View.OnClickListener {
    LoginViewBinding binding;
    private Router router;


    @Inject
    ViewModelFactory vmFactory;

    LoginViewModel vm;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        router = new Router((AppCompatActivity) getContext());
        binding = LoginViewBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.btnLogin.setOnClickListener(this);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vm = new ViewModelProvider(this, vmFactory).get(LoginViewModel.class);
        observeLoadStatus();
        observerErrorStatus();
    }

    public void loginClick(String email, String pass) {
        observePosts(email, pass);
    }

    private void observePosts(String email, String pass) {

        vm.loadData(email, pass);
        vm.getLoginResult().observe(this, new Observer<LoginResponseEntity>() {
            private static final String TAG = "LoginFragment";

            @Override
            public void onChanged(LoginResponseEntity loginResult) {
                if (loginResult != null) {

                    router.setProjectListFragment(R.id.main, new ProjectFragment(), loginResult);
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view == binding.btnLogin) {
            binding.lblErrPass.setVisibility(Objects.requireNonNull(binding.txtPass.getText()).toString().equals("") ? View.VISIBLE : View.GONE);
            binding.lblErrEmail.setVisibility(Objects.requireNonNull(binding.txtEmail.getText()).toString().equals("") ? View.VISIBLE : View.GONE);
            if (!binding.txtEmail.getText().toString().equals("") && !binding.txtPass.getText().toString().equals("")) {
                loginClick(binding.txtEmail.getText().toString(), binding.txtPass.getText().toString());
            }
        }
    }
}
