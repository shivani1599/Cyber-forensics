/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aman
 */
import java.io.*;
import java.util.logging.*; 
public class logfile
{
public static void main(String args[])
{
Logger
l=Logger.getLogger(logfile.class.getName());
FileHandler fh;
try
{
fh=new FileHandler("c:/mylogfile.log",true);
l.addHandler(fh);
l.setLevel(Level.ALL);
SimpleFormatter sf=new
SimpleFormatter();
fh.setFormatter(sf);
l.info("Myfirstlog");
}
catch(SecurityException e)
{
e.printStackTrace();
}
catch(IOException e)
{
e.printStackTrace();
}
l.info("HiHowru?");
}
}
