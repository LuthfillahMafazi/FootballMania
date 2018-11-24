package com.example.lutfillahmafazi.footballmania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailClubActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.txtLogo)
    TextView txtLogo;
    @BindView(R.id.txtDetailLogo)
    TextView txtDetailLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_club);
        ButterKnife.bind(this);

        txtLogo.setText(getIntent().getStringExtra("nc"));
        txtDetailLogo.setText(getIntent().getStringExtra("dc"));
        Glide.with(this).load(getIntent().getIntExtra("gc",0)).into(imgLogo);
    }
}
