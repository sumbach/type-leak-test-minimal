# Replication Steps

1. Download latest ClojureScript JAR

    ```
    curl -O -L 'https://github.com/clojure/clojurescript/releases/download/r1.7.145/cljs.jar'
    ```

2. Build

    ```
    java -cp cljs.jar:src clojure.main build.clj
    ```

3. Observe compiler warnings

    ```
    WARNING: Use of undeclared Var type-leak-test-minimal.core/clj-nil at line 34 src/type_leak_test_minimal/core.cljs
    WARNING: Use of undeclared Var type-leak-test-minimal.core/number at line 36 src/type_leak_test_minimal/core.cljs
    WARNING: Use of undeclared Var type-leak-test-minimal.core/string at line 37 src/type_leak_test_minimal/core.cljs
    WARNING: Use of undeclared Var type-leak-test-minimal.core/function at line 41 src/type_leak_test_minimal/core.cljs
    WARNING: Use of undeclared Var type-leak-test-minimal.core/object at line 42 src/type_leak_test_minimal/core.cljs
    WARNING: Use of undeclared Var type-leak-test-minimal.core/clj-nil at line 45 src/type_leak_test_minimal/core.cljs
    WARNING: Use of undeclared Var type-leak-test-minimal.core/number at line 47 src/type_leak_test_minimal/core.cljs
    WARNING: Use of undeclared Var type-leak-test-minimal.core/string at line 48 src/type_leak_test_minimal/core.cljs
    WARNING: Use of undeclared Var type-leak-test-minimal.core/function at line 52 src/type_leak_test_minimal/core.cljs
    WARNING: Use of undeclared Var type-leak-test-minimal.core/object at line 53 src/type_leak_test_minimal/core.cljs
    ```

4. Observe correct runtime behavior

   ```
   open index.html
   # view results in browser JavaScript console
   ```
