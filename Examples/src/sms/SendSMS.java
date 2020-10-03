package sms;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;


public class SendSMS{
    public static void main(String[] args)
    {
        //Your authentication key
        String authkey = "yourauthkey";

        //Multiple mobiles numbers separated by comma
        String mobiles = "9989801125";

        //Sender ID,While using route4 sender id should be 6 characters long.
        String senderId = "DEMOOS";

        //Your message to send, Add URL encoding here.
        String message = "Test message";

        //define route
        String route="1";

        //Prepare Url
        URLConnection myURLConnection=null;
        URL myURL=null;
        BufferedReader reader=null;
        //encoding message
        String encoded_message=URLEncoder.encode(message);

        //Send SMS API

        String mainUrl="http://msg.msgclub.net/rest/services/sendSMS/sendGroupSms?AUTH_KEY=yourauthkey&message=message&senderId=DEMOOS&routeId=1&mobileNos=9999999999&smsContentType=english";
        //Prepare parameter string
        StringBuilder sbPostData= new StringBuilder(mainUrl);
        sbPostData.append("authkey="+authkey);
        sbPostData.append("&mobiles="+mobiles);
        sbPostData.append("&message="+encoded_message);
        sbPostData.append("&route="+route);
        sbPostData.append("&sender="+senderId);
        //final string
        mainUrl = sbPostData.toString();
        try
        {
            //prepare connection

            myURL = new URL(mainUrl);
            myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            reader= new BufferedReader(new java.io.InputStreamReader(myURLConnection.getInputStream()));

            //reading response
            String response;
            while ((response = reader.readLine()) != null)

            //print response
            System.out.println(response);

            //finally close connection
            reader.close();
        }
        catch (IOException e)
        {
                e.printStackTrace();
        }

}
   
}