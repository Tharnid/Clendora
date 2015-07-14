(ns LCAssocDissocMerge)

;; assoc associates new key-value pairs to a map
(assoc {:jam1 "red" :jam2 "blue" } :jam3 "yellow")

;; dissoc returns a new map with a key-pair removed
(dissoc {:jam1 "Peach" :jam2 "Strawberry"} :jam1)

;; merges key-value pairs
(merge {:jam1 "red" :jam2 "black"}
       {:jam1 "orange" :jam3 "red"}
       {:jam4 "blue"})
