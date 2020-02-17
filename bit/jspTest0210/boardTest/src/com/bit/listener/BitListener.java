package com.bit.listener;

import java.io.FileWriter;
import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Application Lifecycle Listener implementation class BitListener
 *
 */
@WebListener
public class BitListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public BitListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	String uri = ((HttpServletRequest) sre.getServletRequest()).getRequestURI();
    	String ip = ((HttpServletRequest) sre.getServletRequest()).getRemoteAddr();
    	Date today = new Date();
    	String str = uri + "/" + ip + "/" + today;
    	System.out.println(str);
    	
    	try {
//			FileWriter fw = new FileWriter("c:/bit/bitlog.txt");
			FileWriter fw = new FileWriter("c:/bit/bitlog.txt", true);
			fw.write(str + "\n");
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
