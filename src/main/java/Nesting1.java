public class Nesting1 {
    private Nesting2 field1_1;
    private Nesting2 field1_2;
    private Nesting2 field1_3;

    public Nesting1() {
    }

    public Nesting1(Nesting2 field1_1, Nesting2 field1_2, Nesting2 field1_3) {
        this.field1_1 = field1_1;
        this.field1_2 = field1_2;
        this.field1_3 = field1_3;
    }

    private Nesting1(Builder builder) {
        setField1_1(builder.field1_1);
        setField1_2(builder.field1_2);
        setField1_3(builder.field1_3);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Nesting2 getField1_1() {
        return field1_1;
    }

    public void setField1_1(Nesting2 field1_1) {
        this.field1_1 = field1_1;
    }

    public Nesting2 getField1_2() {
        return field1_2;
    }

    public void setField1_2(Nesting2 field1_2) {
        this.field1_2 = field1_2;
    }

    public Nesting2 getField1_3() {
        return field1_3;
    }

    public void setField1_3(Nesting2 field1_3) {
        this.field1_3 = field1_3;
    }


    public static final class Builder {
        private Nesting2 field1_1 = Nesting2.newBuilder().build();
        private Nesting2 field1_2 = Nesting2.newBuilder().build();
        private Nesting2 field1_3 = Nesting2.newBuilder().build();

        private Builder() {
        }

        public Builder field1_1(Nesting2 field1_1) {
            this.field1_1 = field1_1;
            return this;
        }

        public Builder field1_2(Nesting2 field1_2) {
            this.field1_2 = field1_2;
            return this;
        }

        public Builder field1_3(Nesting2 field1_3) {
            this.field1_3 = field1_3;
            return this;
        }

        public Nesting1 build() {
            return new Nesting1(this);
        }
    }
}
