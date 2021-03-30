package br.edu.uniritter.mobile.nossaprimeiraappnoite;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.uniritter.mobile.nossaprimeiraappnoite.model.Photo;
import br.edu.uniritter.mobile.nossaprimeiraappnoite.model.Todo;

public class DetalhePhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_photo);
        Intent intent = getIntent();
        //Parcelable prc = intent.getParcelableExtra("objPhoto");

        Photo photo = intent.getParcelableExtra("objPhoto");
        bind(photo);

    }
    public void trocaLayout(View v) {
        setContentView(R.layout.layout);
        Intent intent = getIntent();
        Photo photo = intent.getParcelableExtra("objPhoto");
        bind(photo);

    }
    public void cbClick(View v) {
        CheckBox cb = findViewById(R.id.cbCompleted);
        Intent intent = getIntent();
        Todo todo = intent.getParcelableExtra("objPhoto");
        todo.setCompleted(cb.isChecked());
    }
    private void bind(Photo obj) {
        TextView tv = findViewById(R.id.tvAlbumPhoto);
        tv.setText(obj.getAlbumId()+"");
        tv = findViewById(R.id.tvIdPhoto);
        tv.setText(obj.getId()+"");
        tv = findViewById(R.id.tvTitlePhoto);
        tv.setText(obj.getTitle());
        tv = findViewById(R.id.tvUrlPhoto);
        tv.setText(obj.getUrl());
        tv = findViewById(R.id.tvThumbnailUrl);
        tv.setText(obj.getThumbnailUrl());

       // cb.setChecked(obj.isCo);

    }
}