package com.kononenko.kp32.main_activity;

import static org.koin.java.KoinJavaComponent.get;

import android.content.Intent;
import android.os.Bundle;
import com.kononenko.kp32.basic.mvvm.BaseActivity;
import com.kononenko.kp32.databinding.ActivityMainBinding;
import com.kononenko.kp32.new_book.NewBookActivity;


public class MainActivity extends BaseActivity {
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = get(MainActivityViewModel.class);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        viewModel.getState().observe(this, state -> {
            if (state.openNewBookActivity) {
                Intent intent = new Intent(MainActivity.this, NewBookActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.reInitList();
    }

    @Override
    public void onCloseScope() {

    }
}