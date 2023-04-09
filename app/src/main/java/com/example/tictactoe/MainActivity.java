package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    String b11,b12,b13,b21,b22,b23,b31,b32,b33;
    TextView textView;
    int flag=0;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.txtResult);
        init();

    }
    private void init()
    {

        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
    }
    public void tap(View view)
    {
        //we don't know where will be first tap in one of
        //9 buttons But One thing we are sure that it will be
        //on any button So we can make object of Button and proceed
        Button currentButton=(Button)view;
        if(currentButton.getText().toString().equals("")) {

            count++;
            if (flag == 0) {
                currentButton.setText("X");
                currentButton.setBackgroundColor(getResources().getColor(R.color.green));
                flag = 1;
            } else {
                currentButton.setText(("O"));
                currentButton.setBackgroundColor(getResources().getColor(R.color.red));
                flag = 0;
            }
            if (count > 4) {
                b11 = b1.getText().toString();
                b12 = b2.getText().toString();
                b13 = b3.getText().toString();
                b21 = b4.getText().toString();
                b22 = b5.getText().toString();
                b23 = b6.getText().toString();
                b31 = b7.getText().toString();
                b32 = b8.getText().toString();
                b33 = b9.getText().toString();
                //conditions
                if (b11.equals(b12) && b12.equals(b13) && !b11.equals("")) {
                    textView.setText(b11);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    }, 2000); // 5000 milliseconds = 5 seconds

//                    reset();
                } else if (b11.equals(b21) && b21.equals(b31) && !b21.equals("")) {
                    textView.setText(b11);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    }, 2000); // 5000 milliseconds = 5 seconds

//                    reset();
                } else if (b11.equals(b22) && b22.equals(b33) && !b11.equals("")) {
                    textView.setText(b11);
//                    reset();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    }, 2000); // 5000 milliseconds = 5 seconds

                } else if (b21.equals(b22) && b22.equals(b23) && !b23.equals("")) {
                    textView.setText(b21);
//                    reset();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    }, 2000); // 5000 milliseconds = 5 seconds
                } else if (b31.equals(b32) && b32.equals(b33) && !b33.equals("")) {
                    textView.setText(b31);
//                    reset();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    }, 2000); // 5000 milliseconds = 5 seconds
                } else if (b31.equals(b22) && b22.equals(b13) && !b22.equals("")) {
                    textView.setText(b31);
//                    reset();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    }, 2000); // 5000 milliseconds = 5 seconds
                } else if (b12.equals(b22) && b22.equals(b32) && !b22.equals("")) {
                    textView.setText(b12);
//                    reset();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    }, 2000); // 5000 milliseconds = 5 seconds
                } else if (b13.equals(b23) && b23.equals(b33) && !b33.equals("")) {
                    textView.setText(b13);
//                    reset();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    }, 2000); // 5000 milliseconds = 5 seconds
                }else if(count==9)
                {
//                    reset();
                    textView.setText("Tie");
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    }, 2000); // 5000 milliseconds = 5 seconds
                }

            }
        }

    }
    private void reset()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        textView.setText("");
        b1.setBackgroundColor(getResources().getColor(R.color.transparent));
        b2.setBackgroundColor(getResources().getColor(R.color.transparent));
        b3.setBackgroundColor(getResources().getColor(R.color.transparent));
        b4.setBackgroundColor(getResources().getColor(R.color.transparent));
        b5.setBackgroundColor(getResources().getColor(R.color.transparent));
        b6.setBackgroundColor(getResources().getColor(R.color.transparent));
        b7.setBackgroundColor(getResources().getColor(R.color.transparent));
        b8.setBackgroundColor(getResources().getColor(R.color.transparent));
        b9.setBackgroundColor(getResources().getColor(R.color.transparent));
        flag=0;
        count=0;
    }
}