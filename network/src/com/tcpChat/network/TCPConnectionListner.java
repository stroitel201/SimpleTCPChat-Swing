package com.tcpChat.network;

public interface TCPConnectionListner {

    void onConnectionReady(TCPConnection tcpConnection);
    void onRecieveString(TCPConnection tcpConnection, String value);
    void onDisconnect(TCPConnection tcpConnection);
    void onExcpetion(TCPConnection tcpConnection, Exception ex);
}
