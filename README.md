# Introduction to functional programming with Clojure

Install clojure:
```shell
mkdir -p ~/bin
curl 'https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein' > ~/bin/lein
chmod +x ~/bin/lein
echo 'export PATH=~/bin/lein:$PATH' >> ~/.zshrc
```

On vscode you can install calva plugin `ext install cospaia.clojure4vscode`

Create project: `lein new app hangman-game`

Repl: `cd hangman-game && lein repl`


### Exercises

Calculate
```clojure
"4 + (1+2)"
(+ 4 (+ 1 2))

"4 + (1+20) - 7"
(- (+ 4 (+ 1 20)) 7)

"5 * (10 / 2) + 1"
(+ (* 5 (/ 10 2)) 1)
```

First Functions
```clojure
(defn mult2 [x] (* x 2))

(defn mult-square [x]
  (* x (+ 2 x)))

(defn pow3 [x] (* x (Math/pow 2 x)))
```

Reload source code
```clojure
(require '[hangman-game.core :as hangman-game] :reload)
"Now you can invoke function:"
(hangman-game/game 5 "BANANA" #{"A"})
```

Equal and not equal exercies
```clojure
"10 = 6"
(= 10 6)

"20 = 20"
(= 20 20)

"15 = 15"
(= 15 15)

"10 not= 10"
(not= 10 10)

"10 not= 20"
(not= 10 20)
```

Fibonacci
```clojure
(require '[exercises.core :as exercises] :reload)
(exercises/fibonacci 3)
```

Lists
```clojure
(def numbers [1 2 3 4 5])
(map (fn [x] (* x 3)) numbers)
(defn mult [x] (* x 2))
(mult 2)
(map mult numbers)

(defn even? [x] (= 0 (rem x 2)))
(even? 1)
(even? 2)

(remove even? numbers)

(defn number-outside-2-and-4? [x] (or (< x 2) (> x 4)))
(filter number-outside-2-and-4? numbers)

(def word #{"B" "N" "A"})
(defn word-contains-letter? [word]
  (and
    (contains? word "A")
    (contains? word "B")
  )
)
(word-contains-letter? word)
```

Read line
```clojure
(defn read-letter! [] (read-line))
(defn calculate [] (* 7 (Integer/parseInt (read-letter!))))
(calculate)
```

Car exercises
```clojure
(def cars [50000.0 60000.0])
(map (fn [x] (* x 2)) cars)
(reduce (fn [accumulator current-value] (+ accumulator current-value)) cars)

; magic! ->>
(->> cars
     (map (fn [x] (* x 2)))
     (reduce (fn [acc n] (+ acc n))))
; or any functions
(->> cars
     (map (fn [x] (* x 2)))
     (map (fn [x] (* x 1.5)))
     (reduce (fn [acc n] (+ acc n))))
; another example
(->> cars
     (map (fn [x] (* x 2)))
     (map (fn [x] (- x 200))))
```

**BEFORE next steps** :
```shell
cd hangman-game
```


Finally, let's play a game:
```shell
lein run
```

Make a jar
```shell
lein uberjar
# and then run like a Java program
java -jar target/uberjar/hangman-game-0.1.0-SNAPSHOT-standalone.jar
```
