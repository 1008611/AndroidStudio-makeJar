package com.wildwolf.mylibrary;

import android.content.Context;

/**
 * Created by ${wild00wolf} on 2016/8/12.
 */
public class ResourceUtils {
    public ResourceUtils() {
    }

    public static int[] getResourseIdByName(String packageName, String className, String name) {
        Class r = null;
        int[] id = new int[1];

        try {
            r = Class.forName(packageName + ".R");
            Class[] e = r.getClasses();
            Class desireClass = null;

            for(int i = 0; i < e.length; ++i) {
                if(e[i].getName().split("\\$")[1].equals(className)) {
                    desireClass = e[i];
                    break;
                }
            }

            if(desireClass != null) {
                id = (int[])desireClass.getField(name).get(desireClass);
            }
        } catch (ClassNotFoundException var8) {
            var8.printStackTrace();
        } catch (IllegalArgumentException var9) {
            var9.printStackTrace();
        } catch (SecurityException var10) {
            var10.printStackTrace();
        } catch (IllegalAccessException var11) {
            var11.printStackTrace();
        } catch (NoSuchFieldException var12) {
            var12.printStackTrace();
        }

        return id;
    }

    public static int getIdByName(Context context, String className, String resName) {
        context = context.getApplicationContext();
        String packageName = context.getPackageName();
        int indentify = context.getResources().getIdentifier(resName, className, packageName);
        return indentify;
    }
}
