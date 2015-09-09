(ns LC.reduce)

(reduce + [1 2 3 4 5])

(reduce * [10 20 30 40 50])

(reduce (fn [r x] (+ r (* x x))) [1 2 3])

;; complement returns the opposite truth variable

((complement nil?) nil)

((complement nil?) 2)

;; iterating over collections

(for [animal [:ox :mouse :fox :grouse]]
      (str (name animal)))

(for [animal [:mouse :duck :lory]
      color  [:red :blue]]
  (str (name color) (name animal)))

;; let allows us to specify let bindings

(for [animal [:mouse :duck :lory]
      color  [:red :blue]
      :let  [animal-str (str "animal-"(name animal))
             color-str (str "color-"(name color))
             display-str (str animal-str "-" color-str)]]
  display-str)

;; :when allows expression to evaluated only

(for [animal [:mouse :duck :lory]
      color  [:red :blue]
      :let  [animal-str (str "animal-"(name animal))
             color-str (str "color-"(name color))
             display-str (str animal-str "-" color-str)]
      :when (= color :blue)]
  display-str)

;; flatten takes any nested collection and return the contents in a single flattened sequence

(flatten [ [:duck [:mouse] [[:lory]]]])

(vec '(1 2 3)) ;; list to vector

(into [] '(1 2 3))  ;; into takes a new collection and returns all values

(sorted-map :b 2 :a 5 :c 8 :z 6)

(into (sorted-map) {:b 2 :c 3 :a 1})

(into (sorted-map) { :x 93 :u 106 :i 45 :d 990})

;; vectors of pairs into maps

(into {} [[:a 1] [:b 3] [:c 5]])
