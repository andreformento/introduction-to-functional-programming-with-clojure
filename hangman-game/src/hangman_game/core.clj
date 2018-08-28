(ns hangman-game.core
  (:gen-class))

(def total-lives 6)

(defn you-lose [] print "You lose")
(defn you-win [] print "You win!")

(defn missing-letters [word hits]
  (remove (fn [letter] (contains? hits (str letter))) word)
)

(defn you-got-a-whole-word? [word hits]
  (empty? (missing-letters word hits))
)

(defn read-letter! [] (read-line))

(defn is-right? [letter word] (.contains word letter))

(defn game [lives word hits])

(defn check [letter lives word hits]
    (if (is-right? letter word)
        (game lives word (conj hits letter))
        (game (dec lives) word hits)
    )
)

;; (require '[hangman-game.core :as hangman-game] :reload)
;; (hangman-game/game 5 "BANANA" #{})
(defn game [lives word hits]
    (if (= lives 0)
        (you-lose)
        (if (you-got-a-whole-word? word hits)
            (you-win)
            (check (read-letter!) lives word hits)
        )
    )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
