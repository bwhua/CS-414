import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import static org.mockito.Mockito.*;

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
  public void testHandleOneClient() throws Exception {
    when(serverSocket.accept()).thenReturn(socket);

    InputStream input = new ByteArrayInputStream("chatbot".getBytes());
    when(socket.getInputStream()).thenReturn(input);

    OutputStream output = new ByteArrayOutputStream();
    when(socket.getOutputStream()).thenReturn(output);

    server.handleOneClient();
    assertEquals("chatbot response\n", output.toString());
  }
}
