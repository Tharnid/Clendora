(ns Lazy)

(take 5 (range))

(take 10 (range))

(count (take 1000 (range)))

(count (take 100000 (range)))

(repeat 3 "rabbit")

(class (repeat 3 "rabbit"))

(take 5 (repeat "rabbit"))

(count (take 5000 (repeat "rabbit")))

(rand-int 100)

(rand-int 100)

(repeat 5 (rand-int 10))

;; repeatedly takes the function that will be repeated over
;; generates a new random int for every element we ask for (neat)

(repeatedly 10 #(rand-int 10))

(take 10 (repeatedly #(rand-int 10)))

(take 6 (cycle ["big" "small"]))

(take 3 (rest (cycle ["big" "small"])))