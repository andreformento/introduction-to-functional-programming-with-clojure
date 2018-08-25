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

Functions
```clojure
(defn mult2 [x] (* x 2))

(defn mult-square [x]
  (* x (+ 2 x)))

(defn pow3 [x] (* x (Math/pow 2 x)))
```
