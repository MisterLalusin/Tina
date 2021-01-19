package pro.gr.ams.tina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AppActivity extends AppCompatActivity {

    private String activeAct = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        try {
            mainActivity();
        }
        catch (Exception ex) {
            Toast.makeText(this, ""+ex, Toast.LENGTH_SHORT).show();
        }
    }

    private void mainActivity() {
        setContentView(R.layout.layout_login);
        activeAct = "login";
    }
}
