package q29.p2;

public class DefenceInDepth {
    public enum March {LEFT, RIGHT;                 // (2)
        public String toString() {
            return "Static enum";
        }
    }
    public enum Military { INFANTRY, AIRFORCE;
        public static enum March {LEFT, RIGHT;        // (3)
            public String toString() {
                return "Statically nested enum";
            }
        }
    }
}