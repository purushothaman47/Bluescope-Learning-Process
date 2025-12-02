package Example;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class  {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",500);
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String msg = dis.readUTF();
        System.out.println("Server Says "+ msg);
        dis.close();
    }
}
