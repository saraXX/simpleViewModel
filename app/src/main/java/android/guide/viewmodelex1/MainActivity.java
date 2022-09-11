package android.guide.viewmodelex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
Button button;
int counter;
MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.addBtnView);

//        TODO 2: declare viewModel class.
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
//        TODO 3: put the ui related data in the ui
        textView.setText(String.valueOf(viewModel.counter));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ------------- normal way : ---------------------
//                textView.setText(String.valueOf(counter));
//                --------------------------------------------------------

//                ------------- with ViewModel : ---------------------
                textView.setText(String.valueOf(viewModel.counter+=1));

            }
        });



    }
}