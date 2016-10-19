public class Nesting2 {
    private Nesting3 field2_1;
    private Nesting3 field2_2;
    private Nesting3 field2_3;

    public Nesting2() {
    }

    public Nesting2(Nesting3 field2_1, Nesting3 field2_2, Nesting3 field2_3) {
        this.field2_1 = field2_1;
        this.field2_2 = field2_2;
        this.field2_3 = field2_3;
    }

    private Nesting2(Builder builder) {
        setField2_1(builder.field2_1);
        setField2_2(builder.field2_2);
        setField2_3(builder.field2_3);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Nesting3 getField2_1() {
        return field2_1;
    }

    public void setField2_1(Nesting3 field2_1) {
        this.field2_1 = field2_1;
    }

    public Nesting3 getField2_2() {
        return field2_2;
    }

    public void setField2_2(Nesting3 field2_2) {
        this.field2_2 = field2_2;
    }

    public Nesting3 getField2_3() {
        return field2_3;
    }

    public void setField2_3(Nesting3 field2_3) {
        this.field2_3 = field2_3;
    }


    public static final class Builder {
        private Nesting3 field2_1 = Nesting3.newBuilder().build();
        private Nesting3 field2_2 = Nesting3.newBuilder().build();
        private Nesting3 field2_3 = Nesting3.newBuilder().build();

        private Builder() {
        }

        public Builder field2_1(Nesting3 field2_1) {
            this.field2_1 = field2_1;
            return this;
        }

        public Builder field2_2(Nesting3 field2_2) {
            this.field2_2 = field2_2;
            return this;
        }

        public Builder field2_3(Nesting3 field2_3) {
            this.field2_3 = field2_3;
            return this;
        }

        public Nesting2 build() {
            return new Nesting2(this);
        }
    }
}
