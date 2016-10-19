import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
     * Attempts to create a Dataset from a `wide` and `nested` Java Bean object,
     * of some 250 * 3 * 3 * 3 total fields.
     * Will cause failure in SpecificUnsafeProjection,
     * org.codehaus.janino.JaninoRuntimeException: Code of method
     *     "(Lorg/apache/spark/sql/catalyst/expressions/GeneratedClass;[Ljava/lang/Object;)V"
     *     of class "org.apache.spark.sql.catalyst.expressions.GeneratedClass$SpecificUnsafeProjection"
     *     grows beyond 64 KB
     * If lines are in WideNestedBean are uncommented such that all
     * 400 * 3 * 3 fields are included, the error instead will be
     * org.codehaus.janino.JaninoRuntimeException:
     *     Constant pool has grown past JVM limit of 0xFFFF
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
