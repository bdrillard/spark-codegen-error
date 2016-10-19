public class Nesting3 {
    private Integer field3_1;
    private Double field3_2;
    private String field3_3;

    public Nesting3() {
    }

    public Nesting3(Integer field3_1, Double field3_2, String field3_3) {
        this.field3_1 = field3_1;
        this.field3_2 = field3_2;
        this.field3_3 = field3_3;
    }

    private Nesting3(Builder builder) {
        setField3_1(builder.field3_1);
        setField3_2(builder.field3_2);
        setField3_3(builder.field3_3);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getField3_1() {
        return field3_1;
    }

    public void setField3_1(Integer field3_1) {
        this.field3_1 = field3_1;
    }

    public Double getField3_2() {
        return field3_2;
    }

    public void setField3_2(Double field3_2) {
        this.field3_2 = field3_2;
    }

    public String getField3_3() {
        return field3_3;
    }

    public void setField3_3(String field3_3) {
        this.field3_3 = field3_3;
    }

    public static final class Builder {
        private Integer field3_1 = 0;
        private Double field3_2 = 0.0;
        private String field3_3 = "value";

        private Builder() {
        }

        public Builder field3_1(Integer field3_1) {
            this.field3_1 = field3_1;
            return this;
        }

        public Builder field3_2(Double field3_2) {
            this.field3_2 = field3_2;
            return this;
        }

        public Builder field3_3(String field3_3) {
            this.field3_3 = field3_3;
            return this;
        }

        public Nesting3 build() {
            return new Nesting3(this);
        }
    }
}
