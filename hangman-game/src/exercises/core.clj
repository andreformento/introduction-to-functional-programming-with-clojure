(ns exercises.core
  (:gen-class))

; fib(0) = 0
; fib(1) = 1
; fib(n) = fib(n-1) + fib(n-2), se n >= 2

(defn fibonacci [n]
  (if (= n 0)
    0
    (if (= n 1)
      1
      (+ (fibonacci(- n 1)) (fibonacci(- n 2)))
    )
  )
)

; (exercises/fibonacci-rec 3)
(defn fibonacci-rec [x]
  (loop [a 1 b 1 index 2]
    (if
      (= index x) b
      (recur b (+ a b) (inc index))
    )
  )
)

; (exercises/factorial 5)
; when n = 5, then result = 15
(defn factorial [n]
  (loop [accumulator 0 index 1]
    (if
      (> index n) accumulator
      (recur (+ accumulator index) (inc index))
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
