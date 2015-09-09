(ns LC.FunctShapeDataTrans)

(def animals [:mouse :duck :dodo :lory :eaglet])

(#(str %) :mouse)

(map #(str %) animals)

(class (map #(str %) animals))

;; lazy sequences mean that we can deal with infinite sequences if we like

(take 3 (map #(str %) (range)))

(take 10 (map #(str %) (range)))

(def animals [:mouse :duck :dodo :lory :eaglet])

(def animal-print (map #(println %) animals))

(def animal-print  (map #(println %) animals))

animal-print

(def animal-print  (doall (map #(println %) animals)))

animal-print

(def animals
  ["mouse" "duck" "dodo" "lory" "eaglet"])

(def colors
  ["brown" "black"])

;; combine the two items

(map gen-animal-string animals colors)

(map gen-animal-string animals (cycle ["brown" "black"]))
