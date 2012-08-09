package zmq;


public class ZException  {


    public static class AddrInUse extends RuntimeException {

        private static final long serialVersionUID = 8574207129098333986L;

    }
    public static class NoFreeSlot extends RuntimeException {
        private static final long serialVersionUID = -8599234879594535002L;
    }
    public static class ConnectionRefused extends RuntimeException {
        private static final long serialVersionUID = 2962118056167320315L;
    }
    
    public static class IOException extends RuntimeException {
        private static final long serialVersionUID = 9202470691157986262L;

        public IOException(java.io.IOException e) {
            super(e);
        }
    }

}
