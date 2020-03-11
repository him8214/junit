package com.niit.Junit;

public class JUnitMessage {
	String m;
	JUnitMessage(String msg)
	{
		m=msg;
	}
String printMessage()
{
	return m;
}

String printHiMessage()
{
	return "hi"+m;
}
}
