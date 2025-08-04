package th.mfu;

import java.io.*;
import java.net.*;

// call mockup server at port 8080
public class MockWebClient {
    public static void main(String[] args) {

         try(Socket clientSocket = new Socket("localhost", 8080)){
            // send message to server
            
         BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            String request = "GET / HTTP/1.1\r\nHost: localhost\r\n\r\n";
            out.println(request);
            String userInput;
            while ((userInput = in.readLine())!= null) {
                System.out.println(userInput);
            }
            clientSocket.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        

    }

}
