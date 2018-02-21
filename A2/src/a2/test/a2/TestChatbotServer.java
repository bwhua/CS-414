//Brandon Hua
package a2;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestChatbotServer {

  @Mock private Chatbot chat;
  @Mock private ServerSocket serverSocket;
  @Mock private Socket socket;
  private ChatbotServer server;

  @Before
  public void setup(){
    server = new ChatbotServer(chat, serverSocket);
  }


  @Test
  public void testMultipleLines() throws Exception {
    when(serverSocket.accept()).thenReturn(socket);

    InputStream input = new ByteArrayInputStream("Hello\n How are you?".getBytes());
    when(socket.getInputStream()).thenReturn(input);

    OutputStream output = new ByteArrayOutputStream();
    when(socket.getOutputStream()).thenReturn(output);

    when(chat.getResponse("Hello\n How are you?\n")).thenReturn("Hello Human");

    server.handleOneClient();

    assertEquals("Hello Human\n", output.toString());

  }

  @Test
  public void testAIException() throws Exception{
    when(serverSocket.accept()).thenReturn(socket);

    InputStream input = new ByteArrayInputStream("Throw a2.AIException".getBytes());
    when(socket.getInputStream()).thenReturn(input);

    OutputStream output = new ByteArrayOutputStream();
    when(socket.getOutputStream()).thenReturn(output);
    server.handleOneClient();

    //test a2.AIException
    when(chat.getResponse("Throw a2.AIException")).thenThrow(new AIException("Got a2.AIException: Broken AI"));
    try
    {
      chat.getResponse("Throw a2.AIException");
      server.handleOneClient();
    }
    catch( AIException e ){
      assertEquals("Got a2.AIException: Broken AI", e.getMessage());
    }
  }


}
