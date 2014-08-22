/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ids;
import java.util.*;
/**
 * This class represents a packet
 * 
 * @author madhura phatak
 * version 1.0
 */
public class Packet {
    private long duration;
    private String protocol_type;
    private String service;
    private String flag;
    private long src_bytes;
    private long dst_bytes;
    private int	land;
    private int	wrong_fragment;
    private int	urgent;
    private int	hot;
    private int	num_failed_logins;
    private int	logged_in;
    private int	num_compromised;
    private int	root_shell;
    private int	su_attempted;
    private int	num_root;
    private int	num_file_creations;
    private int	num_shells;
    private int	num_access_files;
    private int	num_outbound_cmds;
    private int	is_host_login;
    private int	is_guest_login;
    private int	count;
    private int	srv_count;
    private float serror_rate;
    private float srv_serror_rate;
    private float rerror_rate;
    private float srv_rerror_rate;
    private float same_srv_rate;
    private float diff_srv_rate;
    private float srv_diff_host_rate;
    private int	dst_host_count;
    private int	dst_host_srv_count;
    private float dst_host_same_srv_rate;
    private float dst_host_diff_srv_rate;
    private float dst_host_same_src_port_rate;
    private float dst_host_srv_diff_host_rate;
    private float dst_host_serror_rate;
    private float dst_host_srv_serror_rate;
    private float dst_host_rerror_rate;
    private float dst_host_srv_rerror_rate;
/**
 * Constructor just to initialize object of packet class
 */
    Packet(){}
    
 /**
 *Constructor Creates a new Packet object that represents a packet
 */
 Packet(long inp1,String inp2,String inp3,String inp4,long inp5,long inp6,int inp7,int inp8,int inp9,int inp10,
        int inp11,int inp12,int inp13,int inp14,int inp15,int inp16,int inp17,int inp18,int inp19,int inp20,
        int inp21,int inp22,int inp23,int inp24,float inp25,float inp26,float inp27,float inp28,float inp29,
        float inp30,float inp31,int inp32,int inp33,float inp34,float inp35,float inp36,float inp37,float inp38,
       float inp39,float inp40,float inp41)
   {
    duration = inp1;
    protocol_type = inp2;
    service = inp3;
    flag = inp4;
    src_bytes = inp5;
    dst_bytes = inp6;
    land = inp7;
    wrong_fragment = inp8;
    urgent = inp9;
    hot = inp10;
    num_failed_logins = inp11;
    logged_in = inp12;
    num_compromised = inp13;
    root_shell = inp14;
    su_attempted = inp15;
    num_root = inp16;
    num_file_creations = inp17;
    num_shells = inp18;
    num_access_files = inp19;
    num_outbound_cmds = inp20;
    is_host_login = inp21;
    is_guest_login = inp22;
    count = inp23;
    srv_count = inp24;
    serror_rate = inp25;
    srv_serror_rate = inp26;
    rerror_rate = inp27;
    srv_rerror_rate = inp28;
    same_srv_rate = inp29;
    diff_srv_rate = inp30;
    srv_diff_host_rate = inp31;
    dst_host_count = inp32;
    dst_host_srv_count = inp33;
    dst_host_same_srv_rate = inp34;
    dst_host_diff_srv_rate = inp35;
    dst_host_same_src_port_rate = inp36;
    dst_host_srv_diff_host_rate = inp37;
    dst_host_serror_rate = inp38;
    dst_host_srv_serror_rate = inp39;
    dst_host_rerror_rate = inp40;
    dst_host_srv_rerror_rate = inp41;
   }
 
 /**
  * This method decodes the packet and returns it to the server
  * @param p The packet created by client and sent to server
  * @return Decoded packet to the server in a Linked List
  */
  LinkedList decodePacket()  
  {
     LinkedList l = new LinkedList();
     l.add(this.duration);
     l.add(this.protocol_type);
     l.add(this.service);
     l.add(this.flag);
     l.add(this.src_bytes);
     l.add(this.dst_bytes);
     l.add(this.land);
     l.add(this.wrong_fragment);
     l.add(this.urgent);
     l.add(this.hot);
     l.add(this.num_failed_logins);
     l.add(this.logged_in);
     l.add(this.num_compromised);
     l.add(this.root_shell);
     l.add(this.su_attempted);
     l.add(this.num_root);
     l.add(this.num_file_creations);
     l.add(this.num_shells);
     l.add(this.num_access_files);
     l.add(this.num_outbound_cmds);
     l.add(this.is_host_login);
     l.add(this.is_guest_login);
     l.add(this.count);
     l.add(this.srv_count);
     l.add(this.serror_rate);
     l.add(this.srv_serror_rate);
     l.add(this.rerror_rate);
     l.add(this.srv_rerror_rate);
     l.add(this.same_srv_rate);
     l.add(this.diff_srv_rate);
     l.add(this.srv_diff_host_rate);
     l.add(this.dst_host_count);
     l.add(this.dst_host_srv_count);
     l.add(this.dst_host_same_srv_rate);
     l.add(this.dst_host_diff_srv_rate);
     l.add(this.dst_host_same_src_port_rate);
     l.add(this.dst_host_srv_diff_host_rate);
     l.add(this.dst_host_serror_rate);
     l.add(this.dst_host_srv_serror_rate);
     l.add(this.dst_host_rerror_rate);
     l.add(this.dst_host_srv_rerror_rate);
     return l;
   }

}
