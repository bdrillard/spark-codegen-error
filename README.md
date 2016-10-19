# spark-codegen-error

This error reproduction creates a large "wide" and "nested" Java Bean of 3600 fields, and attempts to encode several instantiations of this object as a Dataset<WideNestedBean>.

This triggers an error in code generation: 
```
Caused by: org.codehaus.janino.JaninoRuntimeException:
    Constant pool for class org.apache.spark.sql.catalyst.expressions.GeneratedClass$SpecificUnsafeProjection
    has grown past JVM limit of 0xFFFF
```
