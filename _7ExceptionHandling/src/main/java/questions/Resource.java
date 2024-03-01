package questions;

import java.io.IOException;
public class Resource implements AutoCloseable {
    public void action() throws IOException {
        throw new IOException("action error ");
    }
    public void close() throws Exception {
        throw new Exception("closure error ");
    }
}