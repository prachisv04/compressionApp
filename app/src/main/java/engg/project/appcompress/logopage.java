package engg.project.appcompress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import java.util.Timer;
import java.util.TimerTask;

public class logopage extends AppCompatActivity {
ProgressBar pb;
private Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logopage);
        pb=findViewById(R.id.pb);
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pb.setProgress(pb.getProgress() + 1);

                        if (pb.getProgress() == 100) {
                            timer.cancel();
                            Intent i1 = new Intent(logopage.this, Login.class);
                            logopage.this.startActivity(i1);
                            logopage.this.finish();
                        }
                    }
                });
            }
        }, 100, 100);
    }
}

