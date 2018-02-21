package a2;//Brandon Hua


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Allow the a2.Chatbot to be accessible over the network.  <br />
 * This class only handles one client at a time.  Multiple instances of a2.ChatbotServer
 * will be run on different ports with a port-based load balancer to handle multiple clients.
 * 
 * @author <Your Name Here>
 */
public class ChatbotServer {

	/**
	 * The instance of the {@link Chatbot}.
	 */
	private Chatbot chatbot;

	/**
	 * The instance of the {@link ServerSocket}.
	 */
	private ServerSocket serversocket;


	/**
	 * Constructor for a2.ChatbotServer.
	 * 
	 * @param chatbot The chatbot to use.
	 * @param serversocket The pre-configured ServerSocket to use.
	 */
	public ChatbotServer(Chatbot chatbot, ServerSocket serversocket) {
		this.chatbot = chatbot;
		this.serversocket = serversocket;
	}
	
	/**
	 * Start the a2.Chatbot server.  Does not return.
	 */
	public void startServer() {
		while(true) handleOneClient();
	}

	/**
	 * Handle interaction with a single client.  See assignment description.
	 */
	public void handleOneClient() {
		// TODO: Your code here.
		try {
			Socket socket = serversocket.accept();
			PrintWriter write = new PrintWriter(socket.getOutputStream(), true);
      BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String input = "";
			String next;
      while((next = read.readLine()) != null){
        input += next + "\n";
      }
      write.print(chatbot.getResponse(input) + "\n");


      socket.close();
      write.close();
      read.close();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (AIException o){
      o.printStackTrace();
    }
	}
}
