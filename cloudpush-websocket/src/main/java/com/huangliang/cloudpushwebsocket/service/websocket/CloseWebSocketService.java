package com.huangliang.cloudpushwebsocket.service.websocket;

import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import org.springframework.stereotype.Service;

@Service
public class CloseWebSocketService implements IWebSocketService {
    @Override
    public void handler(WebSocketFrame frame) {

    }
}
