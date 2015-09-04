(ns LC.FunctShapeDataTrans)

(def animals [:mouse :duck :dodo :lory :eaglet])

(#(str %) :mouse)

(map #(str %) animals)

(class (map #(str %) animals))

;; lazy sequences mean that we can deal with infinite sequences if we like

(take 3 (map #(str %) (range)))

(take 10 (map #(str %) (range)))

