(ns LC.Flow3)

(defn adder [x y z]
  (+ x y z))

(adder 34 56 72)

;; destructuring allows you to assign named bindings for the elements in things like vectors or maps

(let [[color size] ["blue" "small"]]
  (str "The " color " door is " size))
