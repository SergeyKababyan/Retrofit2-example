package com.hfad.retrofitpostrequest;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hfad.retrofitpostrequest.webservice.MyPostData;
import com.hfad.retrofitpostrequest.webservice.MyResponseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8;
    private Button postBtn;
    private MyPostData postData;
    private MyResponseModel myResponseModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postData = new MyPostData(
                        ed1.getText().toString(),
                        ed2.getText().toString(),
                        ed3.getText().toString(),
                        ed4.getText().toString(),
                        ed5.getText().toString(),
                        ed6.getText().toString(),
                        ed7.getText().toString(),
                        ed8.getText().toString());
                postRequest(postData);
            }
        });

    }

    private void postRequest(MyPostData postData) {
        AppApplication
                .appApplication
                .getNetworkService()
                .register(postData)
                .enqueue(new Callback<MyResponseModel>() {
                    @Override
                    public void onResponse(@NonNull Call<MyResponseModel> call, @NonNull Response<MyResponseModel> response) {
                        if (response.isSuccessful()) {
                            if (response.body() !=null) {
                                Log.i("", "onResponse: ");
                                myResponseModel = response.body();

                            }
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<MyResponseModel> call, @NonNull Throwable t) {
                        Log.i("", "onFailure: ");
                    }
                });
    }

    private void initViews() {
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editText3);
        ed4 = findViewById(R.id.editText4);
        ed5 = findViewById(R.id.editText5);
        ed6 = findViewById(R.id.editText6);
        ed7 = findViewById(R.id.editText7);
        ed8 = findViewById(R.id.editText8);
        postBtn = findViewById(R.id.button);
    }
}
