import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
     * Attempts to create a Dataset from a `wide` and `nested` Java Bean object.
     * The object contains 3600 total fields and when attempting to encode to a
     * row, triggers an error during code generation:
     * Caused by: org.codehaus.janino.JaninoRuntimeException:
     *     Constant pool for class org.apache.spark.sql.catalyst.expressions.GeneratedClass$SpecificUnsafeProjection
     *     has grown past JVM limit of 0xFFFF
     *
     * Method appears to be composed of too many assignments.
     * Configure IDE for Console logging, then run main.
     */
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder().master("local").getOrCreate();

        spark.conf().set("spark.sql.codegen.wholeStage", false);

        List<WideNestedBean> data = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            data.add(WideNestedBean.newBuilder().build());
        }

        Encoder<WideNestedBean> encoder = Encoders.bean(WideNestedBean.class);
        Dataset<WideNestedBean> ds = spark.createDataset(data, encoder);
        ds.show();
    }
}
