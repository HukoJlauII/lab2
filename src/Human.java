public class Human {
    private Leg l1,l2;
    private Head h;
    private Arm a1,a2;
    public Human(Leg l1,Leg l2,Arm a1,Arm a2,Head h){
        this.l1=l1;
        this.l2=l2;
        this.a1=a1;
        this.a2=a2;
        this.h=h;
    }
    @Override
    public String toString() {
        return "This human consists of {" +
                "First leg: " + l1 +
                ", Second leg: " + l2 +
                ", Head: " + h +
                ", First arm: " + a1 +
                ", Second arm: " + a2 +
                '}';
    }
    public static class Leg{
        private char pos;
        public Leg(char p) {
            pos = p;
        }
        public void setPos(char pos) {
            this.pos = pos;
        }


        public char getPos() {
            return pos;
        }

        @Override
        public String toString() {
            return "Leg{ pos=" + pos +
                    '}';
        }
    }
    public static class Head{
        private String haircol;
        private String eyecol;

        public Head(String h,String e){
            haircol=h;
            eyecol=e;
        }
        public void setEyecol(String eyecol) {
            this.eyecol = eyecol;
        }

        public void setHaircol(String haircol) {
            this.haircol = haircol;
        }

        public String getEyecol() {
            return eyecol;
        }

        public String getHaircol() {
            return haircol;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "haircol='" + haircol + '\'' +
                    ", eyecol='" + eyecol + '\'' +
                    '}';
        }
    }
    public static class Arm{
        private char pos;

        public Arm(char p) {
            pos = p;
        }

        public void setPos(char pos) {
            this.pos = pos;
        }

        public char getPos() {
            return pos;
        }

        @Override
        public String toString() {
            return "Leg{ pos=" + pos +
                    '}';
        }
    }
}
