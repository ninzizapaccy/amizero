package myapp.example.teacher.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private EditText email;
    private EditText Password;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        email = (EditText) findViewById(R.id.etemail);
        Password = (EditText) findViewById(R.id.etPassword);
        Register = (Button) findViewById(R.id.Register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(email.getText().toString(), Password.getText().toString());
               // Intent intent = new Intent(MainActivity.this,  Main3Activity.class);
                //startActivity(intent);
            }
        });

    }
    private void validate (String Useremail,String userPassword){
        if ((Useremail=="Admin@gmail.com") && (userPassword=="12345")){

        }
        else{
            Register.setEnabled(false);
        }
    }
}
