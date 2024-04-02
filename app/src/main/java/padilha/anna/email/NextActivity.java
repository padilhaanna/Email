package padilha.anna.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //Intent i = getIntent();//obtem Intent da primeira tela

        //String textoDigitado = i.getStringExtra("texto");//pega o texto que foi digitado
        //TextView tvTexto = findViewById(R.id.tv_texto);//obtem  textview
        //tvTexto.setText(textoDigitado);//faz aparecer o texto digitado no tvtextoo
    }
}