package com.kononenko.kp32.new_book;

import static org.koin.java.KoinJavaComponent.get;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.kononenko.kp32.R;
import com.kononenko.kp32.data.BookDatabase;
import com.kononenko.kp32.databinding.ActivityNewBookBinding;
import com.kononenko.kp32.main_activity.MainActivityViewModel;

public class NewBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NewBookViewModel viewModel = get(NewBookViewModel.class);
        ActivityNewBookBinding binding = ActivityNewBookBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        viewModel.getState().observe(this,state -> {
            if(state.needFinish)
                NewBookActivity.this.finish();
        });
    }
}