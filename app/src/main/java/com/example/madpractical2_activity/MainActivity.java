package com.example.madpractical2_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User(
                "Hello World!",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                1,
                false
        );

        TextView nameTextView = findViewById(R.id.textView);
        TextView descriptionTextView = findViewById(R.id.textView2);
        Button followButton = findViewById(R.id.button);
        Button messageButton = findViewById(R.id.button2);

        nameTextView.setText(user.getName());
        descriptionTextView.setText(user.getDescription());
        messageButton.setText("Message");

        if(user.isFollowed() == false){
            followButton.setText("Follow");
        }
        else{
            followButton.setText("Unfollow");
        }

        followButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(user.isFollowed()){
                    followButton.setText("Follow");
                    user.setFollowed(false);
                }
                else{
                    followButton.setText("Unfollow");
                    user.setFollowed(true);
                }
            }
        });
    }
}