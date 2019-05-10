package myapp.example.teacher.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Username;
    private EditText Password;
    private Button Login;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username=(EditText)findViewById(R.id.etUserName);
        Password=(EditText)findViewById(R.id.etPassword);
        Login=(Button)findViewById(R.id.btnLogin);
        Register=(Button)findViewById(R.id.Register);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String User =Username.getText().toString();
                String Pass =Password.getText().toString();
                if ((User.equals("")) || (Pass.equals("")))
                {
                    Toast.makeText(getApplicationContext(), "enter your Username and Password",Toast.LENGTH_LONG).show();

                }
                else if (User.equals("Admin") && Pass.equals("12345")){
                    Toast.makeText(getApplicationContext(), "login successful",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"invalid username or password",Toast.LENGTH_LONG).show();
                }

            }

        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });
    }

}

