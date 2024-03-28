package padilha.anna.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar = findViewById(R.id.btn_enviar); //determina o botão "Enviar"
        btnEnviar.setOnClickListener(new View.OnClickListener() { //configura o botão para determinar o que acontece quando alguém clicar nele
            @Override
            public void onClick(View v) { //metodo para determinar oq o botao faz depois de clicar (classe: View, v: elemento que foi clicado
                Button b = (Button) v; //operador de casting (transforma objeto do tipo View em um do tipo Button e guarda em b
                EditText etDigiteAqui = findViewById(R.id.et_digiteaqui); //pega a caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString(); //pega o texto digitado nessa caixa

                Intent i = new Intent(MainActivity.this, NextActivity.class);//cria classe Intent (determina uma intenção)
                i.putExtra("texto", textoDigitado); //chave "texto" associado a um valor textoDigitado
                startActivity(i); //executa a intenção - passa para próxima página (i: guarda a intenção)
            }
        });
    }
}