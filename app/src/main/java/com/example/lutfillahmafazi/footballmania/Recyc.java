package com.example.lutfillahmafazi.footballmania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Recyc extends AppCompatActivity {
    // TODO 1 mengenerate butterknife untuk recyclerview
    @BindView(R.id.my_recycle_view)
    RecyclerView myRecycleView;

    //TODO 2 Membuat variable array untuk menampung data nama,detail dan gambar dari String Array pada
    String[] namaClub,detailClub;
    int[] gambarClub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        //TODO 3 Mengisi variable array
        namaClub = getResources().getStringArray(R.array.club_name);
        detailClub = getResources().getStringArray(R.array.club_detail);
        gambarClub = new int[]{R.drawable.img_barca,R.drawable.img_madrid,R.drawable.img_bayern,R.drawable.img_city
                ,R.drawable.img_mu,R.drawable.img_chelsea,R.drawable.img_acm,R.drawable.img_arsenal};

        Adapter adapter = new Adapter(this, gambarClub, namaClub, detailClub);
        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(this));
        myRecycleView.setAdapter(adapter);
    }
}
