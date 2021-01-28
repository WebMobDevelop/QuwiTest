package com.quwi.foo.ui.home;


import android.content.Context;
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
import androidx.recyclerview.widget.GridLayoutManager;

import com.quwi.foo.databinding.ProjectOverviewBinding;
import com.quwi.foo.model.ProjectListResponse;
import com.quwi.foo.ui.adapters.ProjectListAdapter;
import com.quwi.foo.ui.base.BaseFragment;
import com.quwi.foo.ui.base.ViewModelFactory;
import com.quwi.foo.util.Router;
import com.quwi.foo.util.Utils;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectFragment extends BaseFragment implements View.OnClickListener {
    ProjectOverviewBinding binding;
    private Router router;
    public final static  String TOKEN_KEY="token";

    @Inject
    public ViewModelFactory vmFactory;
    ProjectsViewModel vm;
    private String token;

    public ProjectFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (getArguments() != null) {
            token=getArguments().getString(TOKEN_KEY,null);
        }
        router = new Router((AppCompatActivity) getContext());
        binding = ProjectOverviewBinding.inflate(inflater, container, false);
        binding.progressBar.getIndeterminateDrawable().setColorFilter(0xff5782b3, android.graphics.PorterDuff.Mode.MULTIPLY);
        View view = binding.getRoot();
        setRecyclerView();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vm = new ViewModelProvider(this, vmFactory).get(ProjectsViewModel.class);
        observeLoadStatus();
        observerErrorStatus();
        observeProject(token);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Utils.hideSoftKeyboard(getActivity());
    }

    private void observeProject(String token) {
        vm.loadData(token);
        vm.getProjectListResult().observe(getViewLifecycleOwner(), new Observer<ProjectListResponse>() {
            private static final String TAG  =  "ProjectFragment";

            @Override
            public void onChanged(ProjectListResponse projectList) {
                if (projectList != null) {
                    response.setProjects(projectList.getProjects());
                    Objects.requireNonNull(binding.recyclerProjectList.getAdapter()).notifyDataSetChanged();
                    System.out.println(projectList.getProjects().size());
                }
            }
        });
    }

    public void renameProject(long id,String name) {
        vm.updateItem(token,id,name);
        vm.getRenameResult().observe(this, new Observer<ProjectListResponse>() {
            private static final String TAG  =  "ProjectFragment";

            @Override
            public void onChanged(ProjectListResponse result) {
                if (result != null) {
                    observeProject(token);
                }
            }
        });
    }

    @Override
    protected void observerErrorStatus() {
        vm.getErrorStatus().observe(getViewLifecycleOwner(),
                error -> {
                    if (error != null) {
                        onError(getContext(),error.getMessage());
                        showProgressBar(false);
                    }
                });
    }

    @Override
    protected void observeLoadStatus() {
        vm.getLoadingStatus().observe(
                getViewLifecycleOwner(),
                this::showProgressBar
        );
    }

    private void showProgressBar(boolean isVisible) {
        if (isVisible)
            binding.loading.setVisibility(View.VISIBLE);
        else
            binding.loading.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View view) {

    }

    ProjectListResponse response=new ProjectListResponse();
    private void setRecyclerView() {
        ProjectListAdapter adapter = new ProjectListAdapter(response,this);
        binding.recyclerProjectList.setLayoutManager(new GridLayoutManager(getContext(), 1));
        binding.recyclerProjectList.setHasFixedSize(true);
        binding.recyclerProjectList.setAdapter(adapter);
    }
}
