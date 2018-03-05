package tendencias1.tendenciesexercici1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LoginScreen(View view){
        Intent loginIntent = new Intent(this,LoginActivity.class);
        startActivity(loginIntent);
    }

    public void RecoverScreen(View view){
        Intent recoverIntent = new Intent(this,RecoverActivity.class);
        startActivity(recoverIntent);
    }

    @Override
    public void onBackPressed()
    {
        moveTaskToBack(true);
        finish();
    }

}
