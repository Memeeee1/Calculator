package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;




import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    Button zero,one,two,three,four,five,six,svn,egt,nine,div,mult,naqis,som,point,cl,eql;
    EditText res;
    ArrayList<Character> arraylist= new ArrayList<>();

    ArrayList<String> chiffre=new ArrayList<>();
    ArrayList<String> numbers = new ArrayList<>();

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        res=findViewById(R.id.res);
        zero=findViewById(R.id.zero);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        svn=findViewById(R.id.svn);
        egt=findViewById(R.id.egt);
        nine=findViewById(R.id.nine);
        div=findViewById(R.id.div);
        mult=findViewById(R.id.mult);
        som=findViewById(R.id.som);
        eql=findViewById(R.id.eql);
        naqis=findViewById(R.id.naqis);

        point=findViewById(R.id.pt);
        cl=findViewById(R.id.clr);


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"0");
                arraylist.add('0');
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"1");
                arraylist.add('1');
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"2");
                arraylist.add('2');
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"3");
                arraylist.add('3');
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"4");
                arraylist.add('4');
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"5");
                arraylist.add('5');
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"6");
                arraylist.add('6');
            }
        });
        svn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"7");
                arraylist.add('7');
            }
        });
        egt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"8");
                arraylist.add('8');
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"9");
                arraylist.add('9');
            }
        });


        som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"+");
                arraylist.add('+');
            }
        });
        naqis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"-");
                arraylist.add('-');
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"-");
                arraylist.add('/');
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"*");
                arraylist.add('*');
            }
        });


        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc();
            }
        });




        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
                arraylist.removeAll(arraylist);
                chiffre.removeAll(chiffre);
                numbers.removeAll(numbers);
            }
        });
    }


    public void calc(){
        String str="hhh";
        String str2="";
        String str3="";
        float flt1;
        float flt2;
        for (char val:arraylist){

            if (Character.isDigit(val)){
                numbers.add(val+"");
            }
            else{
                chiffre.add(val+"");

            }
        }
        Object[] chfr = chiffre.toArray();
        Object[] numrs = numbers.toArray();

        int i=1;

        while ( i<numrs.length){


            for (Object o : chfr) {
                flt1= Float.parseFloat(numrs[0].toString());
                flt2= Float.parseFloat(numrs[i].toString());

                switch (o.toString()) {
                    case "+":
                        float somm = flt1 + flt2;
                        numrs[0]=somm;
                        res.setText(somm + "");
                        break;
                    case "/":
                        float divs = flt1 / flt2;
                        numrs[0]=divs;
                        res.setText(divs + "");
                        break;
                    case "*":
                        float mult = flt1 * flt2;
                        numrs[0]=mult;
                        res.setText(mult + "");
                        break;
                    case "-":
                        float nqs = flt1 - flt2;
                        numrs[0]=nqs;
                        res.setText(nqs + "");
                        break;
                }

                numrs= (Object[]) delete(numrs);
                chfr = (Object[]) delete(chfr);
            }

            i++;
        }


    }
    public Object delete(Object[] arr){
        int i;
        int j;


        for (i=1 ; i<arr.length;i++){
            for (j=1 ; j<arr.length-1;j++){
                arr[i]=arr[j];
            }
        }
        return arr;
    }

}


































//package com.example.calculatrice;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//
//
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Vector;
//
//public class MainActivity extends AppCompatActivity {
//
//    Button zero,one,two,three,four,five,six,svn,egt,nine,div,mult,naqis,som,point,cl,eql;
//    EditText res;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        ArrayList<Character> arraylist= new ArrayList<>();
//        String[] string={};
//        String[] string2={};
//
//
//        res=findViewById(R.id.res);
//        zero=findViewById(R.id.zero);
//        one=findViewById(R.id.one);
//        two=findViewById(R.id.two);
//        three=findViewById(R.id.three);
//        four=findViewById(R.id.four);
//        five=findViewById(R.id.five);
//        six=findViewById(R.id.six);
//        svn=findViewById(R.id.svn);
//        egt=findViewById(R.id.egt);
//        nine=findViewById(R.id.nine);
//        div=findViewById(R.id.div);
//        mult=findViewById(R.id.mult);
//        som=findViewById(R.id.som);
//        eql=findViewById(R.id.eql);
//        naqis=findViewById(R.id.naqis);
//
//        point=findViewById(R.id.pt);
//        cl=findViewById(R.id.clr);
//
//
//        zero.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"0");
//                arraylist.add('0');
//            }
//        });
//        one.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"1");
//                arraylist.add('1');
//            }
//        });
//        two.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"2");
//                arraylist.add('2');
//            }
//        });
//        three.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"3");
//                arraylist.add('3');
//            }
//        });
//        four.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"4");
//                arraylist.add('4');
//            }
//        });
//        five.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"5");
//                arraylist.add('5');
//            }
//        });
//        six.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"6");
//                arraylist.add('6');
//            }
//        });
//        svn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"7");
//                arraylist.add('7');
//            }
//        });
//        egt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"8");
//                arraylist.add('8');
//            }
//        });
//        nine.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"9");
//                arraylist.add('9');
//            }
//        });
//
//
//        som.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"+");
//                arraylist.add('+');
//            }
//        });
//        naqis.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"-");
//                arraylist.add('-');
//            }
//        });
//        div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"-");
//                arraylist.add('/');
//            }
//        });
//        mult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText(res.getText().toString()+"*");
//                arraylist.add('*');
//            }
//        });
//
//        eql.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String str="";
//                String str2="";
//                for (char val:arraylist){
//                    float flt1;
//                    float flt2;
//                    if (Character.isDigit(val)) {
//                        str = val+"";
//
//                    }
//                    else{
//
//
//                    }
////                    else {
////                        flt1= Float.parseFloat(str);
////                        flt2=flt1;
////                        switch (val){
////                            case '+':
////                                float somm=flt1+flt2;
////                                res.setText(somm+"");
////                                break;
////                            case '/':
////                                float divs=flt1/flt2;
////                                res.setText(divs+"");
////                                break;
////                            case '*':
////                                float mult=flt1*flt2;
////                                res.setText(mult+"");
////                                break;
////                            case '-':
////                                float nqs=flt1-flt2;
////                                res.setText(nqs+"");
////                                break;
////                        }
////                    }
//                }
//                if (str.isEmpty()){
//                    Toast.makeText(MainActivity.this,"saisir un nombre",Toast.LENGTH_LONG).show();
//                }
//
//
//
//            }
//        });
//
//
//        cl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res.setText("");
//                arraylist.removeAll(arraylist);
//            }
//        });
//
//    }
//}
//
//
//
//
////                for (char val:arraylist){
////                    float flt1;
////                    float flt2;
////                    if (Character.isDigit(val)){
////                        str+=val;
////                        res.setText(str);
////                    }
////
////                    else{
////
////                        flt1= Float.parseFloat(str);
////                        flt2=flt1;
////                        switch (val){
////                            case '+':
////                                float somm=flt1+flt2;
////                                res.setText(somm+"");
////                                break;
////                            case '/':
////                                float divs=flt1/flt2;
////                                res.setText(divs+"");
////                                break;
////                            case '*':
////                                float mult=flt1*flt2;
////                                res.setText(mult+"");
////                                break;
////                            case '-':
////                                float nqs=flt1-flt2;
////                                res.setText(nqs+"");
////                                break;
////                        }
////
//////                        str="";
////
//                    }