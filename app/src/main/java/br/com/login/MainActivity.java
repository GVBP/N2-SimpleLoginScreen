package br.com.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editUsername = findViewById(R.id.editUsername);
        EditText editPassword = findViewById(R.id.editPassword);

        Button buttonLogin = findViewById(R.id.buttonLogin);

        TextView textViewMessage = findViewById(R.id.textViewMessage);

        editUsername.setText("");
        editPassword.setText("");

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editUsername.getText().toString().equals("admin") && editPassword.getText().toString().equals("admin@123")) {
                    textViewMessage.setText("Login efetuado com sucesso!");
                    textViewMessage.setVisibility(View.VISIBLE);
                } else {
                    textViewMessage.setText("Usuário ou senha inválido.");
                    textViewMessage.setVisibility(View.VISIBLE);
                }
            }
        };

        buttonLogin.setOnClickListener(listener);
    }
}