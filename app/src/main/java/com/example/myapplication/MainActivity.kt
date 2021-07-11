package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity
import org.mozilla.javascript.Context;
import  org.mozilla.javascript.Scriptable;

class MainActivity : AppCompatActivity() {
    private lateinit var bt0:Button;
    private lateinit var bt1:Button;
    private lateinit var bt2:Button;
    private lateinit var bt3:Button;
    private lateinit var bt4:Button;
    private lateinit var bt5:Button;
    private lateinit var bt6:Button;
    private lateinit var bt7:Button;
    private lateinit var bt8:Button;
    private lateinit var bt9:Button;
    private lateinit var btDot:Button;
    private lateinit var cong:Button;
    private lateinit var tru:Button;
    private lateinit var nhan:Button;
    private lateinit var chia:Button;
    private lateinit var clear:Button;
    private lateinit var kq:Button;
    private  lateinit var proocess:String;
    private  lateinit var textIO:EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bt0=findViewById(R.id.bt0);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        btDot=findViewById(R.id.btdot);
        kq=findViewById(R.id.kq);
        cong=findViewById(R.id.cong);
        tru=findViewById(R.id.tru);
        nhan=findViewById(R.id.nhan);
        chia=findViewById(R.id.chia);
        clear=findViewById(R.id.xoa);

        textIO=findViewById(R.id.text);


        bt0.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"0")
        }
        bt1.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"1")
        }
        bt2.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"2")
        }
        bt3.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"3")
        }
        bt4.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"4")
        }
        bt5.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"5")
        }
        bt6.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"6")
        }
        bt7.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"7")
        }
        bt8.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"8")
        }
        bt9.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText(proocess+"9")
        }
        clear.setOnClickListener {
            textIO.setText("");
        }
        btDot.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText("$proocess.")
        }

        cong.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText("$proocess+")
        }

        tru.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText("$proocess-")
        }
        nhan.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText("$proocess*")
        }
        chia.setOnClickListener {
            proocess=textIO.text.toString();
            textIO.setText("$proocess/")
        }
        kq.setOnClickListener {

            proocess=textIO.text.toString();
            val temp=Context.enter();

            temp.optimizationLevel=-1;

            var result="";
            result=try {
                val scriptable: Scriptable = temp.initStandardObjects()
                temp.evaluateString(scriptable, proocess, "javascript", 1, null).toString()
            }catch (e:Exception){
                "0"
            }

            textIO.setText("");
            textIO.setText(result);


        }

    }


}

