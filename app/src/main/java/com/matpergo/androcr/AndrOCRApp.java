

package com.matpergo.androcr;

import android.app.Application;
import android.content.Context;

public class AndrOCRApp extends Application{
	
	private static AndrOCRApp s_instance;

    public AndrOCRApp ()
    {
        s_instance = this;
    }

    public static Context getContext()
    {
        return s_instance;
    }
    
    public static String myGetString(int resId)
    {
        return getContext().getString(resId);       
    }


}
