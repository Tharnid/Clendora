(ns LConjMaps)

(count [1 2 3 4])

;; conj will add elements to the end of a collection

(conj [:toast :butter] :jam)

(conj [:toast :butter] :jam :honey)

;; conj will add things to the beginning of a list

(conj '(:toast :butter :egg) :jelly)

(conj '(:muffin :toast :jelly) :honey :grits)

{:jam1 "Peach" :jam2 "Strawberry"}

;; get something from the map
(get{:jam1 "Strawberry" :jam2 "Raspberry"} :jam2)

;; key not found
(get {:jam1 "strawberry" :jam2 "blackberry"} :jam3 "not found")

;; get the keys
(keys {:jam1 "strawberry" :jam2 "blackberry" :jam3 "marmalade"})

;; get the vals
(vals {:jam1 "strawberry" :jam2 "blackberry" :jam3 "marmalade"})

