(ns hangman-game.core
  (:gen-class))

(def total-lives 6)

(defn you-lose [] (print "You lose :/"))

(defn winner [] (print "You win =)"))

(defn you-got-a-whole-word? [word hits] true)

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
