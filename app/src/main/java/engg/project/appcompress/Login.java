package engg.project.appcompress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
TextView pwd;
TextView name;
Button blogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pwd=findViewById(R.id.text2)
                blogin=findViewById(R.id.button5)
                        //ithe setonclicklistener method add karaychi ahe
       if(pwd.getText().equals("1234"))
       {
           Intent i1=new Intent(Login.this,MainActivity.class)
                   Login.this.startActivity(i1);
           Login.this.finish();
        }

    }
}
