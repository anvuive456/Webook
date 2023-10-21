package com.example.webook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;

import com.example.webook.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {
    ActivitySignInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        SpannableString span = new SpannableString(binding.txtSignUp.getText());
        span.setSpan(new UnderlineSpan(),0,binding.txtSignUp.getText().length(),0);
        binding.txtSignUp.setText(span);

        binding.txtSignUp.setOnClickListener(v -> {

        });
    }
}