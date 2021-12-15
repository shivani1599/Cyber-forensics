package cyberforensic.Prac1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Aman
 */
import java.io.*;
import java.util.*;
import java.net.*;
public class sender{
public static void main(String[] args)throws Exception{
String s="";
String ct="";
String key="";
Socket sc=new Socket("localhost",6017);
Random r=new Random();
int i=0,k=0;
System.out.println("Enterthestring");
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
s=br.readLine();
int j[]=new
int[s.length()];
for(i=0;i<s.length();i++)
{
j[k]=r.nextInt(50);
key+=Integer.valueOf(j[k])+","
; System.out.println("j="+j[k]);
ct+=(char)(s.charAt(i)+j[k]);
k++;
}
System.out.println("Key="+key);
System.out.println("Encryptedmessage:"+ct); bw.write(ct+","+key);
bw.flush();
bw.close();
}
}