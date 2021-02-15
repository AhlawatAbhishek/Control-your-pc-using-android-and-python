package com.example.controlyourpcusingandroidandpython;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends AsyncTask<Void, Void, Void> {
    String type = "";
    String ip_adress = "192.168.1.9";
    Client(String t){
       type = t;
    }
    protected Void doInBackground(Void... arg0){
        if(type == "shutdown"){
           try {
               Socket cli = new Socket(ip_adress, 9999);
               OutputStream toserver = cli.getOutputStream();
               DataOutputStream out = new DataOutputStream(toserver);
               out.writeBytes("shutdown");
           }catch (IOException e){
               e.printStackTrace();
           }
        }else if(type == "restart"){
            try {
                Socket cli = new Socket(ip_adress, 9999);
                OutputStream toserver = cli.getOutputStream();
                DataOutputStream out = new DataOutputStream(toserver);
                out.writeBytes("restart");
            }catch (IOException e){
                e.printStackTrace();
            }
        }else if(type == "music"){
            try {
                Socket cli = new Socket(ip_adress, 9999);
                OutputStream toserver = cli.getOutputStream();
                DataOutputStream out = new DataOutputStream(toserver);
                out.writeBytes("music");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
      return null;
  }
}
