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