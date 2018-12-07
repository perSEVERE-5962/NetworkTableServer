package networktableserver;

import edu.wpi.first.networktables.NetworkTableInstance;


public class NetworkTableServer{

    public static void main(String[] args) {
        NetworkTableInstance inst= NetworkTableInstance.getDefault();
        inst.startServer();
        while (true) {
            try {
              Thread.sleep(1000);
            } catch (InterruptedException ex) {
              System.out.println("interrupted");
              return;
            }
        }
    }
}