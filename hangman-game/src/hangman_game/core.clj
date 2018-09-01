(ns hangman-game.core
  (:gen-class))

(def total-lives 6)
(def secret-word "BANANA")

(defn you-lose [] println "You lose")
(defn you-win [] println "You win!")

(defn missing-letters [word hits]
  (remove (fn [letter] (contains? hits (str letter))) word))

(defn you-got-a-whole-word? [word hits]
  (empty? (missing-letters word hits)))

(defn read-letter! [] (read-line))

(defn is-right? [letter word] (.contains word letter))

(defn game [lives word hits])

(defn print-hangman [lives word hits]
  (println "Lives " lives)
  ;; LAZY:
  ; (map
  ;   (fn [letter] (if (contains? hits (str letter))
  ;                    (print letter " ")
  ;                    (print "_" " ")))
  ;   word)
  (doseq [letter (seq word)]
    (if (contains? hits (str letter))
      (print letter " ")
      (print "_" " ")))
  (println))

;; (require '[hangman-game.core :as hangman-game] :reload)
;; (hangman-game/game 5 "BANANA" #{})
(defn game [lives word hits]
  (print-hangman lives word hits)
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
          (recur (dec lives) word hits))))))

(defn lets-play-a-game []
  (println "Let's play a game :]")
  (game total-lives secret-word #{}))

(defn -main [& args]
  (lets-play-a-game))
