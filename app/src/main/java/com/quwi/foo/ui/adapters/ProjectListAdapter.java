package com.quwi.foo.ui.adapters;

import android.content.DialogInterface;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.libizo.CustomEditText;
import com.quwi.foo.R;
import com.quwi.foo.databinding.ProjectItemBinding;
import com.quwi.foo.model.Project;
import com.quwi.foo.model.ProjectListResponse;
import com.quwi.foo.ui.home.ProjectFragment;
import com.quwi.foo.util.Router;

public class ProjectListAdapter extends RecyclerView.Adapter<ProjectListAdapter.ViewHolder> {

    private Router router;
    private static final String TAG = "PostListAdapter";
    private ProjectListResponse projectList;
    ProjectFragment parent;

    public ProjectListAdapter() {
    }

    public ProjectListAdapter(ProjectListResponse postList, ProjectFragment parent) {
        this.projectList = postList;
        this.parent = parent;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        router = new Router((AppCompatActivity) parent.getContext());
        ProjectItemBinding binding = ProjectItemBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(projectList.getProjects().get(position));
    }

    @Override
    public int getItemCount() {
        if (projectList.getProjects() == null)
            return 0;
        return projectList.getProjects().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ProjectItemBinding binding;

        public ViewHolder(ProjectItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Project project) {
            RequestOptions options = new RequestOptions()
                    .centerCrop()
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher);
            binding.txtItemTitle.setText(project.getName());
            Glide.with(binding.imgItem.getContext()).load(project.getLogoUrl()).apply(options).into(binding.imgItem);

            binding.item.setOnClickListener(v -> {

                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(v.getContext());
                builder.setTitle("change Project name");
                View view = View.inflate(v.getContext(), R.layout.txt_dialog, null);
                final CustomEditText input = view.findViewById(R.id.txt_input);
                input.setText(project.getName());
                builder.setView(view);

                builder.setPositiveButton("OK", (dialog, which)
                        -> parent.renameProject(project.getId(), input.getText().toString()));
                builder.setNegativeButton("Cancel", (dialog, which) -> dialog.cancel());

                builder.show();
                input.requestFocus();
            });
        }

    }
}
