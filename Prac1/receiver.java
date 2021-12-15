/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cyberforensic.Prac1;

/**
 *
 * @author Aman
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
import java.net.*;
import java.util.Random;
public class receiver{
public static void main(String[] args)throws Exception{
String ct="";
String pt="";
ServerSocket skt=new ServerSocket(6017);
Socket sc =skt.accept();
Random r=new Random();
int i=0,k=0;
System.out.println("Enterthestring");
BufferedReader br= new BufferedReader(new InputStreamReader(sc.getInputStream()));
ct=br.readLine();
String[]s=new
String[ct.length()];
s=ct.split(",");
int[] j=new int[s[0].length()];
System.out.println("message"+s[0]);
for(i=0;i<s[0].length();i++)
{
j[i]=Integer.parseInt(s[i+1]);
System.out.println(" key="+j[i]);
}
for(i=0;i<s[0].length();i++)
{
System.out.println("j="+j[i]
); pt+=(char)(s[0].charAt(i)-
j[i]);
}
System.out.println("messagefromSender:"+pt);
}
}
