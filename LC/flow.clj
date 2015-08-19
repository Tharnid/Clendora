(ns LC.Flow)

(= :drinkme :drinkme)

(= :drinkme 4)

(empty? [:table :door :key])

(empty? [])

(empty? {})

(empty? '())

;; not-any? every?

(not-any? #( % :drinkme) [:drinkme :poison])

(not-any? #( % :drinkme) [:poison :poison])

;; some

(some #(> % 3) [1 2 3 4 5])

(some #(> % 3) [1 2 3])

(some #(> % 3) [1 2 3 2 4 6])

(some #{4 5} [1 2 3 4 5])

(some #{3} [1 2 3 4 5])

(if true "it is true" "it is false")

(if nil "it is true" "it is false")

(if false "it is true" "it is false")

(if (= :drinkme :drinkme)
  "Try it"
  "Don't try it")

(if (= :drinkme :poison)
  "Try it"
  "Don't try it")

