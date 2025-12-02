package Example;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args)  throws IOException {
        ServerSocket serverSocket = new ServerSocket(500);
        Socket socket = serverSocket.accept();
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("Hi Client");
        dos.close();
    }
}
