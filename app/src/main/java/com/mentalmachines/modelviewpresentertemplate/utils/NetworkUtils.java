package com.mentalmachines.modelviewpresentertemplate.utils;

/**
 * Created by CaptofOuterSpace on 12/16/2016.
 */

public class NetworkUtils {
    public  static boolean isServerAvailable(){
        boolean exists = false;
        try {
            SocketAddress sockaddr = new InetSocketAddress("google.com", 80);
            // Create an unbound socket
            Socket sock = new Socket();
            // This method will block no more than timeoutMs.
            // If the timeout occurs, SocketTimeoutException is thrown.
            int timeoutMs = 2000;   // 2 seconds
            sock.connect(sockaddr, timeoutMs);
            exists = true;
        }catch(Exception e){}

        if ( exists == true) {
            Toast.makeText(getApplicationContext(), "Host is reachable!!! =)",

                    Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Host is NOT reachable!!! =(",
                    Toast.LENGTH_LONG).show();
        }
   }

    static public boolean isServerReachable(Context context) {
        ConnectivityManager connMan = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = connMan.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnected()) {
            try {
                URL urlServer = new URL("your server url");
                HttpURLConnection urlConn = (HttpURLConnection) urlServer.openConnection();
                urlConn.setConnectTimeout(3000); //<- 3Seconds Timeout
                urlConn.connect();
                if (urlConn.getResponseCode() == 200) {
                    return true;
                } else {
                    return false;
                }
            } catch (MalformedURLException e1) {
                return false;
            } catch (IOException e) {
                return false;
            }
        }
        return false;
    }

    // exists = InetAddress.getByName(host).isReachable(timeOut);

}
