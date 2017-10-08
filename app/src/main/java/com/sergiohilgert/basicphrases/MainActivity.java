package com.sergiohilgert.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  
  public void buttonTapped(View view){
    int id = view.getId();
    String textId = view.getResources().getResourceEntryName(id);
    int resourceId = getResources().getIdentifier(textId, "raw", "com.sergiohilgert.basicphrases");
  
    MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
    mediaPlayer.start();
    
    Toast.makeText(this, "CLicou", Toast.LENGTH_SHORT).show();
  }
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
