/**
 * Gears Log is a logger class that allows for all log messages to be turned off using the enable_log variable
 * @author Olaoye Joseph
 * 
 **/

package com.kits.gears;

public class Log{
public static boolean ENABLE_LOG = true;
	


	public static void v(String strTag, String strMessage) {
		if (ENABLE_LOG)
			Log.v(strTag, strMessage==null?"null":strMessage);
	}

	public static void d(String strtag, String strMessage) {
		if (ENABLE_LOG)
			Log.d(strtag, strMessage==null?"null":strMessage);
	}

	public static void e(String strtag, String strMessage) {
		if (ENABLE_LOG)
			Log.e(strtag, strMessage==null?"null":strMessage);
	}

	public static void w(String strtag, String strMessage) {
		if (ENABLE_LOG)
			Log.w(strtag, strMessage==null?"null":strMessage);
	}

	public static void i(String strtag, String strMessage) {
		if (ENABLE_LOG)
			Log.i(strtag, strMessage==null?"null":strMessage);
	}

	/************************* Exception *********************************/

	public static void v(String strTag, String msg, Throwable e) {
		if (ENABLE_LOG) {
			if (e == null)
				Log.v(strTag, msg==null?"null":msg);
			else
				Log.v(strTag, msg==null?"null":msg, e);
		}
	}

	public static void d(String strTag, String msg, Throwable e) {
		if (ENABLE_LOG) {
			if (e == null)
				Log.d(strTag, msg==null?"null":msg);
			else
				Log.d(strTag, msg==null?"null":msg, e);
		}
	}

	public static void e(String strTag, String msg, Throwable e) {
		if (ENABLE_LOG) {
			if (e == null)
				Log.e(strTag, msg==null?"null":msg);
			else
				Log.e(strTag, msg==null?"null":msg, e);
		}
	}

	public static void w(String strTag, String msg, Throwable e) {
		if (ENABLE_LOG) {
			if (e == null)
				Log.w(strTag, msg==null?"null":msg);
			else
				Log.w(strTag, msg==null?"null":msg, e);
		}
	}

	public static void i(String strTag, String msg, Throwable e) {
		if (ENABLE_LOG) {
			if (e == null)
				Log.i(strTag, msg==null?"null":msg);
			else
				Log.i(strTag, msg==null?"null":msg, e);
		}
	}

}
