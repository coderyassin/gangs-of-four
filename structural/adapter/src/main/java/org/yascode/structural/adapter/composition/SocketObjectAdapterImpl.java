package org.yascode.structural.adapter.composition;

import org.yascode.structural.adapter.Socket;
import org.yascode.structural.adapter.SocketAdapter;
import org.yascode.structural.adapter.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter {

    //Using Composition for adapter pattern
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt= socket.getVolt();
        return convertVolt(volt,10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
