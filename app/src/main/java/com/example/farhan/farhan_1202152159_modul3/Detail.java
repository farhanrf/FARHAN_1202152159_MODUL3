package com.example.farhan.farhan_1202152159_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    private Button btnAdd, btnMin;
    private ImageView progress, lblImg;
    private TextView lblJudul, lblDesc, lblStats;
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailitem);

        btnAdd = findViewById(R.id.btnIsiTambah);
        btnMin = findViewById(R.id.btnIsiKurang);
        progress = findViewById(R.id.imgIsi);

        lblJudul = findViewById(R.id.lblJudul);
        lblDesc = findViewById(R.id.lblDeskripsi);
        lblImg = findViewById(R.id.lblImg);
        lblStats = findViewById(R.id.lblStatus);

        Intent in = getIntent();
        String title=in.getStringExtra("etitle");
        String description=in.getStringExtra("edesc");
        int imgRes = in.getIntExtra("eimg",0);

        setTitle(title);
        lblJudul.setText(title);
        lblDesc.setText(description);
        lblImg.setImageResource(imgRes);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });
    }


    public void tambahIsi(){
        status();
        if(level==6){Toast.makeText(this,"Full",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(++level);
    }

    public void kurangIsi(){
        status();
        if(level==0){Toast.makeText(this,"Empty",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
    }

    public void status(){
        lblStats.setText(""+level+"L");
    }
}
