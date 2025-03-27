package com.testing.db_connection;

public class DatabaseConnection {
    private boolean connected = false;

    public void connect() {
        System.out.println("Connecting to the database...");
        connected = true;
    }

    public void disconnect() {
        System.out.println("Disconnecting from the database...");
        connected = false;
    }

    public boolean isConnected() {
        return connected;
    }

    public boolean isConnectedDelayed(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return connected;
    }
}
