package connection;

import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        
        Logic gl = new Logic();
        
        int portNumber = 8000;
        
        try (
            ServerSocket serverSocket = new ServerSocket(portNumber);
        		
            Socket clientSocket = serverSocket.accept();     
        		
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); 
        		
            BufferedReader in = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));
        		
        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
            	try {
            		out.println(gl.squareReturn(inputLine));
            	} catch (NumberFormatException NF){
            		out.println(gl.stringReverse(inputLine));
            	}
            	
            	
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port " + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}