(ns hangman-game.core
  (:gen-class))

(def total-lives 6)

(defn you-lose [] (print "You lose :/"))

(defn winner [] (print "You win =)"))

;; (hangman-game/missing-letters "BANANA" #{"B" "A"})
(defn missing-letters [word hits]
  (remove (fn [letter] (contains? hits (str letter))) word)
)

(defn you-got-a-whole-word? [word hits]
  (empty? (missing-letters word hits))
)

;; (hangman-game/game 5 "BANANA" #{"B" "A"})
;; (hangman-game/game 4 "BANANA" #{"B" "N" "A"})
(defn game [lives word hits]
  (if (= lives 0)
    (you-lose) ;; true
    (if (you-got-a-whole-word? word hits)
      (winner)
      (print "Try a value")
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
