// MCPToolClient.java
package dev.wrrulos.mcptool.client;

import net.fabricmc.api.ClientModInitializer;

public class MCPToolClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("MCPTool client mod has been initialized!");
    }
}
