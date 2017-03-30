/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlmd.simpleneuralnetwork.example;

import java.lang.reflect.Method;
 
public class MethodCall 
{
	public findValue MethodCall() throws Exception 
	{
		findValue p=new findValue();
		Method m = p.getClass().getDeclaredMethod("findValue", null);	
		m.setAccessible(true);
		System.out.println(m.invoke(p));
                return p;
	}
}