package com.addindev.submission;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class DetailContentAdapter extends AppCompatActivity {
    public TextView textTitle, Detail;
    public ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail_content);
        textTitle = findViewById(R.id.tv_lang_title);
        Detail = findViewById(R.id.detail);
        imageView = findViewById(R.id.imgphoto);

        Content objek = getIntent().getParcelableExtra("objek");
        textTitle.setText(objek.getName());
        Detail.setText(objek.getDetails());
        imageView.setImageResource(objek.getPhoto());


    }
}
