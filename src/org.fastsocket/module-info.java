import org.fastsocket.org.fastsocket.FastNetworkSocketProvider;

module org.fastsocket {
    requires com.socket;
    provides com.socket.spi.NetworkSocketProvider
            with FastNetworkSocketProvider;
}
