package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.Scope;

public class MainActivity extends AppCompatActivity {

    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_clear,btn_bracket,btn_percent,btn_devide,btn_multiply,btn_minus,btn_plus,btn_equal,btn_sign,btn_decimal,btn_erase;
    TextView input,output;
    String process,con;
    int h=0,flag=0,n=1;
    boolean checkBracket =true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0=findViewById(R.id.zero);
        btn_1=findViewById(R.id.one);
        btn_2=findViewById(R.id.two);
        btn_3=findViewById(R.id.three);
        btn_4=findViewById(R.id.four);
        btn_5=findViewById(R.id.five);
        btn_6=findViewById(R.id.six);
        btn_7=findViewById(R.id.seven);
        btn_8=findViewById(R.id.eight);
        btn_9=findViewById(R.id.nine);
        btn_clear=findViewById(R.id.clear);
        btn_bracket=findViewById(R.id.bracket);
        btn_percent=findViewById(R.id.percent);
        btn_devide=findViewById(R.id.devide);
        btn_multiply=findViewById(R.id.multiply);
        btn_minus=findViewById(R.id.minus);
        btn_plus=findViewById(R.id.plus);
        btn_equal=findViewById(R.id.equal);
        btn_sign=findViewById(R.id.sign);
        btn_decimal=findViewById(R.id.decimal);
        input=findViewById(R.id.input);
        output=findViewById(R.id.output);
        con=output.getText().toString();
        btn_erase=findViewById(R.id.erase);

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                con="";
                process="";
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"0");
                        h=0;
                    }

                }
                else {
                    input.setText(process+"0");
                }
            }
        });


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"1");
                        h=0;
                    }

                }
                else {
                    input.setText(process+"1");
                }
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"2");
                        h=0;
                    }

                }
                else {
                    input.setText(process+"2");
                }
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"3");
                        h=0;
                    }

                }
                else {
                    input.setText(process+"3");
                }
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"4");
                        h=0;
                    }

                }
                else {
                    input.setText(process+"4");
                }
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"5");
                        h=0;
                    }

                }
                else {
                    input.setText(process+"5");
                }
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"6");
                        h=0;
                    }

                }
                else {
                    input.setText(process+"6");
                }
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"7");
                        h=0;
                    }

                }
                else {
                    input.setText(process+"7");
                }
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"8");
                        h=0;
                    }

                }
                else {
                    input.setText(process+"8");
                }
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                flag=1;
                if(h==1){
                    if(n==1){
                        con="";
                        input.setText(con+process+"9");
                        h=0;
                    }
                }
                else {
                    input.setText(process+"9");
                }
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                if(flag==1){
                    if(h==1){
                        input.setText(con+process+"+");
                        h=0;
                    }
                    else {
                        input.setText(process+"+");
                    }
                    flag=0;
                }
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                if(flag==1){
                    if(h==1){
                        input.setText(con+process+"-");
                        h=0;
                    }
                    else {
                        input.setText(process+"-");
                    }
                    flag=0;
                }
            }
        });
        btn_devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                if(flag==1){
                    if(h==1){
                        input.setText(con+process+"÷");
                        h=0;
                    }
                    else {
                        input.setText(process+"÷");
                    }
                    flag=0;
                }
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                if(flag==1){
                    if(h==1){
                        input.setText(con+process+"X");
                        h=0;
                    }
                    else {
                        input.setText(process+"X");
                    }
                    flag=0;
                }
            }
        });
        btn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                if(flag==1){
                    if(h==1){
                        input.setText(con+process+"%");
                        h=0;
                    }
                    else {
                        input.setText(process+"%");
                    }
                    flag=0;
                }
            }
        });
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                if(h==1){
                    input.setText(con+process+".");
                    h=0;
                }
                else {
                    input.setText(process+".");
                }
            }
        });

        btn_erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=input.getText().toString();
                int l=str.length();
                if(l!=0){
                    input.setText(str.substring(0,input.length()-1));
                }
                flag=1;
            }
        });

        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                if(h==1){
                    input.setText(con+process+"X(-1)");
                    h=0;
                }
                else {
                    input.setText(process+"X(-1)");
                }
            }
        });
        btn_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                int len=process.length();
                String str1=process.substring(len-1,len);
                if(checkBracket){
                    switch (str1){
                        case "+":
                            if(h==1){
                                input.setText(con+process+"(");
                                h=0;
                            }
                            else {
                                input.setText(process+"(");
                            }
                            break;
                        case "-":
                            if(h==1){
                                input.setText(con+process+"(");
                                h=0;
                            }
                            else {
                                input.setText(process+"(");
                            }
                            break;
                        case "÷":
                            if(h==1){
                                input.setText(con+process+"(");
                                h=0;
                            }
                            else {
                                input.setText(process+"(");
                            }
                            break;
                        case "X":
                            if(h==1){
                                input.setText(con+process+"(");
                                h=0;
                            }
                            else {
                                input.setText(process+"(");
                            }
                            break;
                        default:
                            if(h==1){
                                input.setText(con+process+"X(");
                                h=0;
                            }
                            else {
                                input.setText(process+"X(");
                            }
                            break;
                    }
                    checkBracket=false;
                }
                else {
                    switch (str1) {
                        case "+":
                            if (h == 1) {
                                input.setText(con + process + "(");
                                h = 0;
                            } else {
                                input.setText(process + "(");
                            }
                            checkBracket=false;
                            break;
                        case "-":
                            if (h == 1) {
                                input.setText(con + process + "(");
                                h = 0;
                            } else {
                                input.setText(process + "(");
                            }
                            checkBracket=false;
                            break;
                        case "÷":
                            if (h == 1) {
                                input.setText(con + process + "(");
                                h = 0;
                            } else {
                                input.setText(process + "(");
                            }
                            checkBracket=false;
                            break;
                        case "X":
                            if (h == 1) {
                                input.setText(con + process + "(");
                                h = 0;
                            } else {
                                input.setText(process + "(");
                            }
                            checkBracket=false;
                            break;
                            case ")":
                            if (h == 1) {
                                input.setText(con + process + ")");
                                h = 0;
                            } else {
                                input.setText(process + ")");
                            }
                            checkBracket=false;
                            break;
                        default:
                            if (h == 1) {
                                input.setText(con + process + ")");
                                h = 0;
                            } else {
                                input.setText(process + ")");
                            }
                            checkBracket=true;
                            break;
                    }
                }
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                process=process.replaceAll("X","*");
                process=process.replaceAll("÷","/");
                process=process.replaceAll("%","/100");

                String str1=process;
                String str3="";
                int k,i,j=0;
                String [] str2 =new String[50];
                int a=str1.length();
                for(k=0;k<a;k++){
                    str2[k]="";
                }
                for(i=0;i<a;i++){
                    str3="";
                    str3=str1.substring(i,i+1);
                    switch (str3){

                        case "+":
                            j=j+1;
                            str2[j]=str3;
                            j=j+1;
                            break;
                        case "-":
                            j=j+1;
                            str2[j]=str3;
                            j=j+1;
                            break;
                        case "*":
                            j=j+1;
                            str2[j]=str3;
                            j=j+1;
                            break;
                        case "/":
                            j=j+1;
                            str2[j]=str3;
                            j=j+1;
                            break;
                        case "(":
                            str2[j]=str3;
                            j=j+1;
                            break;
                        case ")":
                            j=j+1;
                            str2[j]=str3;
                            break;
                        default:
                            str2[j]=str2[j]+str3;

                    }

                }

                int len=j;
                String[] sol = new String[50];
                sol[0]="(";
                sol[j+2]=")";
                for (i = 1; i <= j+1; i++) {
                    sol[i] = str2[i-1];
                }

                int sol_len=j+2;

                int [] open =new int[10];
                int [] close =new int[10];
                int count_open=0;
                int count_close=0;
                for(i=0;i<=sol_len;i++) {

                    switch (sol[i]){

                        case "(":
                            open[count_open]=i;
                            count_open++;
                            break;
                        case ")":
                            close[count_close]=i;
                            count_close++;
                            break;

                    }

                }

                int loop;
                int run=count_close;

                for(loop=1;loop<=run;loop++){


                    count_close=0;
                    count_open=0;
                    for(i=0;i<=sol_len-1;i++) {

                        switch (sol[i]){

                            case "(":
                                open[count_open]=i;
                                count_open++;
                                break;
                            case ")":
                                close[count_close]=i;
                                count_close++;
                                break;

                        }

                    }
                    int l;
                    j=0;

                    int[][] diff = new int[50][3];
                    for (i = 0; i < count_open; i++) {
                        for (l = 0; l < count_open; l++) {
                            if (open[i] < close[l]) {
                                diff[j][0] = open[i];
                                diff[j][1] = close[l];
                                diff[j][2] = close[l]-open[i] ;
                                j++;
                            }
                        }
                    }
                    int diff_len=j;
                    int small = diff[0][2];
                    int index = 0;
                    for (i = 1; i < j; i++) {
                        if (diff[i][2] < small) {
                            small = diff[i][2];
                            index = i;
                        }
                    }



                    int m;
                    String[] subsol=new String[25];
                    for(i=0;i<diff[index][2]-1;i++){
                        m=diff[index][0]+i+1;
                        subsol[i]=sol[m];
                    }
                    int counter=0;
                    for(j=0;j<i;j++){
                        counter++;
                    }


                    double c,b;

                    for (i = 1; i < counter; i += 2) {

                        switch (subsol[i]) {
                            case "/":
                                c = Double.parseDouble(subsol[i - 1]);
                                double d = Double.parseDouble(subsol[i + 1]);
                                int e = (int) Math.round(d);
                                subsol[i - 1] = "" + (c / e);
                                for (k = i + 2; k < counter + 2; k++) {
                                    subsol[k - 2] = subsol[k];
                                }
                                counter = counter - 2;
                                i -= 2;
                                break;
                        }

                    }
                    for (i = 1; i <counter; i += 2) {

                        switch (subsol[i]) {
                            case "*":
                                c = Double.parseDouble(subsol[i - 1]);
                                b = Double.parseDouble(subsol[i + 1]);
                                subsol[i - 1] = "" + (c * b);
                                for (k = i + 2; k < counter + 2; k++) {
                                    subsol[k - 2] = subsol[k];
                                }
                                counter = counter - 2;
                                i -= 2;
                                break;
                        }

                    }
                    for (i = 1; i <counter; i += 2) {

                        switch (subsol[i]) {
                            case "+":
                                c = Double.parseDouble(subsol[i - 1]);
                                b = Double.parseDouble(subsol[i + 1]);
                                subsol[i - 1] = "" + (c + b);
                                for (k = i + 2; k < counter + 2; k++) {
                                    subsol[k - 2] = subsol[k];
                                }
                                counter = counter - 2;
                                i -= 2;
                                break;
                        }


                    }
                    for (i = 1; i <counter; i += 2) {

                        switch (subsol[i]) {
                            case "-":
                                c = Double.parseDouble(subsol[i - 1]);
                                b = Double.parseDouble(subsol[i + 1]);
                                subsol[i - 1] = "" + (c - b);
                                for (k = i + 2; k < counter + 2; k++) {
                                    subsol[k - 2] = subsol[k];
                                }
                                counter = counter - 2;
                                i -= 2;
                                break;
                        }

                    }

                    int leave=diff[index][2];
                    sol[diff[index][0]]=subsol[0];
                    for(i=diff[index][0];i<=sol_len-diff[index][2];i++){
                        sol[i+1]=sol[i+leave+1];
                    }

                    sol_len=sol_len-diff[index][2];
                }

                output.setText(""+sol[0]);
                con=output.getText().toString();
                process="";
                input.setText("");
                h=1;
                n=1;
            }
        });


    }
}
