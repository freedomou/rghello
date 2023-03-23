package cn.ncjti.demo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void jump(View view){
        Log.d("m3", "jump: to m1");
        Intent intent=new Intent(MainActivity3.this,MainActivity.class);
        startActivityForResult(intent,1);
//        Intent intent = new Intent();
//        intent.setAction("cn.itcast.START_ACTIVITY");
//        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==2){
            String d = data.getStringExtra("data");
            Toast.makeText(this, d, Toast.LENGTH_SHORT).show();
        }
    }
}