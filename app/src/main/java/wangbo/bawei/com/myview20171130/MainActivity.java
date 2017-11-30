package wangbo.bawei.com.myview20171130;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadialGradientView radialGradientView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radialGradientView= new RadialGradientView(this);
        setContentView(radialGradientView);
        radialGradientView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"您点击了一下",Toast.LENGTH_LONG).show();
            }
        });
    }
}
