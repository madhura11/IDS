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
 * This class represents the client
 * @author madhura phatak
 * version 1.0
 */
public class Client {
    private String IPAddr;
    /**
     * 
     * @param IP IP Address of the Server
     */
    void estbConnection(String IP)
    {
        IPAddr = IP;
    }
    
    /**
     * 
     * @param inp1
     * @param inp2
     * @param inp3
     * @param inp4
     * @param inp5
     * @param inp6
     * @param inp7
     * @param inp8
     * @param inp9
     * @param inp10
     * @param inp11
     * @param inp12
     * @param inp13
     * @param inp14
     * @param inp15
     * @param inp16
     * @param inp17
     * @param inp18
     * @param inp19
     * @param inp20
     * @param inp21
     * @param inp22
     * @param inp23
     * @param inp24
     * @param inp25
     * @param inp26
     * @param inp27
     * @param inp28
     * @param inp29
     * @param inp30
     * @param inp31
     * @param inp32
     * @param inp33
     * @param inp34
     * @param inp35
     * @param inp36
     * @param inp37
     * @param inp38
     * @param inp39
     * @param inp40
     * @param inp41
     * 
     * inp1 to inp41 are attributes of packet
     * @return object of class Packet
     */
    Packet createPacket(long inp1,String inp2,String inp3,String inp4,long inp5,long inp6,int inp7,int inp8,int inp9,int inp10,
        int inp11,int inp12,int inp13,int inp14,int inp15,int inp16,int inp17,int inp18,int inp19,int inp20,
        int inp21,int inp22,int inp23,int inp24,float inp25,float inp26,float inp27,float inp28,float inp29,
        float inp30,float inp31,int inp32,int inp33,float inp34,float inp35,float inp36,float inp37,float inp38,
       float inp39,float inp40,float inp41)
    {
        Packet p = new Packet(inp1,inp2,inp3,inp4,inp5,inp6,inp7,inp8,inp9,inp10,inp11,inp12,inp13,inp14,inp15,inp16,inp17,inp18,
                              inp19,inp20,inp21,inp22,inp23,inp24,inp25,inp26,inp27,inp28,inp29,inp30,inp31,inp32,inp33,inp34,
                              inp35,inp36,inp37,inp38,inp39,inp40,inp41);
        return p;
    }
   /**
    * This method will send the packet to server
    * @param p This is the packet created by client
    */
    void sendPacket(Packet p)throws Exception
    {
        Socket s1 = new Socket(IPAddr,6789);
        OutputStream s1out = s1.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(s1out);
        oos.writeObject(p);
	oos.close();
        s1out.close();
 	s1.close();
    }
}
