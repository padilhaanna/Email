package padilha.anna.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = (Button) findViewById(R.id.btnEnviar); //pega botao de enviar

        // Definicao da acao do click do botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtendo dados digitados pelo usuario
                EditText etEmail = (EditText) findViewById(R.id.etEmail); //pegamos o campo de texto do email
                String email = etEmail.getText().toString(); //pegamos o email q foi escrito

                EditText etAssunto = (EditText) findViewById(R.id.etAssunto); //pegamos o campo de texto do assunto
                String assunto = etAssunto.getText().toString(); //pegamos o assunto q foi escrito

                EditText etTexto = (EditText) findViewById(R.id.etTexto); //pegamos o campo de texto do texto
                String texto = etTexto.getText().toString(); //pegamos o texto q foi escrito

                Intent i = new Intent(Intent.ACTION_SENDTO); //criando intent para mandar email

                i.setData(Uri.parse("mailto:")); //mandar para apps q resolvem o URI “mailto:”

                String[] emails = new String[]{email}; //cria string emails com os emails
                i.putExtra(Intent.EXTRA_EMAIL, emails); //acrescenta emails
                i.putExtra(Intent.EXTRA_SUBJECT, assunto); //acrescenta assunto
                i.putExtra(Intent.EXTRA_TEXT, texto); //acrescenta texto

                try { //tentar
                    startActivity(Intent.createChooser(i, "Escolha o APP")); //chamando o intent
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity.this, "Não há nenhum app que posso realizar essa operação", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}