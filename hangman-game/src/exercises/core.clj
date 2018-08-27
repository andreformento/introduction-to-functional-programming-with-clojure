(ns exercises.core
  (:gen-class))

;; fib(0) = 0
;; fib(1) = 1
;; fib(n) = fib(n-1) + fib(n-2), se n >= 2

(defn fibonacci [n]
  (if (= n 0)
    0
    (if (= n 1)
      1
      (+ (fibonacci(- n 1)) (fibonacci(- n 2)))
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
