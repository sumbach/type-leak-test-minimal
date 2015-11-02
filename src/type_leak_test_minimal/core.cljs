(ns type-leak-test-minimal.core)

(defprotocol Foo
  (foo [x]))

(defprotocol Bar
  (bar [x]))

(extend-protocol Foo
  nil
  (foo [_] "nil")

  number
  (foo [_] "number")

  string
  (foo [_] "string")

  boolean
  (foo [_] "boolean")

  function
  (foo [_] "function")

  object
  (foo [_] "object")

  array
  (foo [_] "array"))

(enable-console-print!)

(defn ^:export -main []
 (prn "(foo nil)          => " (foo nil))
 (prn "(foo js/undefined) => " (foo js/undefined))
 (prn "(foo 0)            => " (foo 0))
 (prn "(foo \"\")         => " (foo ""))
 (prn "(foo true)         => " (foo true))
 (prn "(foo false)        => " (foo false))
 (prn "(foo identity)     => " (foo identity))
 (prn "(foo (fn [x] x))   => " (foo (fn [x] x)))
 (prn "(foo #js {})       => " (foo #js {}))
 (prn "(foo $js [])       => " (foo #js []))

 (prn "(bar nil)          => " (bar nil))
 (prn "(bar js/undefined) => " (bar js/undefined))
 (prn "(bar 0)            => " (bar 0))
 (prn "(bar \"\")         => " (bar ""))
 (prn "(bar true)         => " (bar true))
 (prn "(bar false)        => " (bar false))
 (prn "(bar identity)     => " (bar identity))
 (prn "(bar (fn [x] x))   => " (bar (fn [x] x)))
 (prn "(bar #js {})       => " (bar #js {}))
 (prn "(bar $js [])       => " (bar #js [])))
