package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.Model.Negocio;
import com.example.myapplication.Utils.NegocioService;
import static com.example.myapplication.Utils.Apis.getNegocioService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    NegocioService negocioService;
    Negocio negocio;
    List<Negocio> negocios =new ArrayList<>();
    final String  TAG = "MYAPP";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.txt1);
        tv2 = findViewById(R.id.txt2);
        negocioService= getNegocioService();
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "onClick: ");
                metodo();
            }
        });

    }
    public void metodo() {
        try {
            Log.e(TAG, "metodo1");
            Call<List<Negocio>> call = negocioService.getNegocio();
            Log.e(TAG, "metodo2");
            final String[] error = new String[1];
            call.enqueue(new Callback<List<Negocio>>() {
                @Override
                public void onResponse(Call<List<Negocio>> call, Response<List<Negocio>> response) {
                    try {
                        error[0] =response.errorBody().toString();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Log.e("onResponse", "1");
                    if (response.isSuccessful()) {
                        Log.e("onResponse", "2");
                        negocios = response.body();
                        try {
                            for (Negocio n: negocios) {
                                tv1.setText(n.getNombre());
                                tv2.setText(n.getArchivo());
                                Thread.sleep(2000);
                            }
                        }catch (NullPointerException e){
                            e.printStackTrace();
                        }catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }

                @Override
                public void onFailure(Call<List<Negocio>> call, Throwable t) {
                    Log.e("onFailure", "" + t.getMessage());
                }

            });
            Log.e(TAG, "metodo3");
            Log.e(TAG+" error", ""+ Arrays.toString(error));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //retroClient
        Log.e(TAG, "metodo4");
    }

}