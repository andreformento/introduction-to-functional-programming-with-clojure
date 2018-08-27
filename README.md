# Introduction to functional programming with Clojure

Install clojure:
```shell
mkdir -p ~/bin
curl 'https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein' > ~/bin/lein
chmod +x ~/bin/lein
echo 'export PATH=~/bin/lein:$PATH' >> ~/.zshrc
```

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
(hangman-game/game 5)
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
(require '[hangman-game.exercises :as exercises] :reload)
exercises/fibonacci(3)
```
