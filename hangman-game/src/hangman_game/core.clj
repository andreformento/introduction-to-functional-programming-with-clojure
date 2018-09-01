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

;; (require '[hangman-game.core :as hangman-game] :reload)
;; (hangman-game/game 5 "BANANA" #{})
(defn game [lives word hits]
  (cond
    (= lives 0) (you-lose)
    (you-got-a-whole-word? word hits) (you-win)
    :else
    (let [letter (read-letter!)]
      (if (is-right? letter word)
        (do
          (println "YEAH! The letter is right :)")
          (recur lives word (conj hits letter))
        )
        (do
          (println "Oops... the letter is wrong!")
          (recur (dec lives) word hits)
        )
      )
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
