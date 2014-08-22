/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ids;
import java.io.*;
import java.util.*;
import java.net.*;
/**
 * This class represents the server
 * @author madhura phatak
 * version 1.0
 */
public class Server {
   
    Packet p = new Packet();
    /**
     * This method starts a server and waits for clients
     */
    void startServer()throws Exception
    {
      ServerSocket s = new ServerSocket(1254); 
      Socket s1=s.accept();
      InputStream s1In = s1.getInputStream();
      ObjectInputStream ois = new ObjectInputStream(s1In);
      p = (Packet)ois.readObject();
      ois.close();
      LinkedList lp = p.decodePacket();
    }
}
