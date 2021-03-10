package nshak.fabricwebsocket;

import net.fabricmc.api.ModInitializer;
import nshak.fabricwebsocket.websocket.FabricWebSocketServer;

public class FabricWebSocket implements ModInitializer {

    public FabricWebSocketServer server;

    @Override
    public void onInitialize() {
        try {
            this.server = new FabricWebSocketServer(8080);
            this.server.start();
            System.out.println("FabricWebSocketServer started on port: " + server.getPort());
        }
        catch(Exception e) {

        }
    }
}
