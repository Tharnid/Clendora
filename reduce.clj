(ns learnclojure)

(reduce (fn [total vals] (+ total vals)) 0 [0 1 2 3 4])