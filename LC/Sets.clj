(ns LCSets)

;; sets are useful when you have no duplicates

#{:red :blue :white :pink}

;; no duplicates allowed in sets
#{:red :blue :white :pink}

;; union funtion takes and combines two sets
(clojure.set/union #{:r :b :w} #{ :w :p :y})

;; difference subtracts elements away
(clojure.set/difference #{:r :b :w} #{:w :p :y})

;; intersection returns shared elements between sets
(clojure.set/intersection #{:r :b :w} #{:w :p :y})

;; you can convert another type of collection to a set using the set function
(set [:rabbit :rabbit :watch :door])

(set {:a 1 :b 2 :c 3})

;; contains? examples
(contains? #{:rabbit :door :watch} :rabbit)

(contains? #{:rabbit :door :watch} :jam)

;; conj adds elements to sets, disj removes them
(conj #{:rabbit :door } :jam)
(disj #{:rabbit :door} :door)

