# spark-codegen-error

This error reproduction creates a large "wide" and "nested" Java Bean of over 2250 fields, and attempts to encode several instantiations of this object as a Dataset<WideNestedBean>.

This triggers an error in code generation: 
```
org.codehaus.janino.JaninoRuntimeException: Code of method
     "(Lorg/apache/spark/sql/catalyst/expressions/GeneratedClass;[Ljava/lang/Object;)V"
     of class "org.apache.spark.sql.catalyst.expressions.GeneratedClass$SpecificUnsafeProjection"
     grows beyond 64 KB
```

If currently commented fields of the WideNestedBean are uncommented, an additional error can be reproduced:
```
org.codehaus.janino.JaninoRuntimeException: Constant pool has grown past JVM limit of 0xFFFF
```
