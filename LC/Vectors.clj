(ns lcVectors)

[:jar1 2 3 :jar2]

(first [:jar1 1 2 3 :jar2])

(last [:jar1 1 2 3 :jar2])

(rest [:jar1 1 2 3 :jar2])

(nth [:jar1 1 2 3 :jar2]0)

(nth [:jar1 1 2 3 :jar2]2)

;; vector can traverse the whole structure to get to your query

