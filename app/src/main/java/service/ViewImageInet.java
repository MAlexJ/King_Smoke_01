package service;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;


public class ViewImageInet {

    public Bitmap loadImage(URL imageUrl){
        try {
            final URLConnection conn = imageUrl.openConnection();
            conn.connect();
            final BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
            final Bitmap bm = BitmapFactory.decodeStream(bis);
            bis.close();

            return bm;
        } catch (IOException e) {
            Log.d("Your tag here", "Connection error");
        }
        return null;

    }

}
