(ns hangman-game.core
  (:gen-class))

(def total-lives 6)

(defn you-lose [] (print "You lose"))

(defn game [lives]
  (if (= lives 0)
    (you-lose) ;; true
    (do ;; else
      (print lives)
      (game (dec lives))
    )
  )

)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
