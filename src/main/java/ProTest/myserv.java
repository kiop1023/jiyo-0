package ProTest;

import java.io.IOException;
import java.net.Socket;

public class myserv {
    public static class MySocketClient {
        @SuppressWarnings("resource")
        public static void main(String[] args) {


            try {
                Socket socket = new Socket("192.168.0.72", 1234); // 소켓 서버에 접속
                System.out.println("서버에 접속 성공");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}