(ns LC.Flow2)

(let [need-to-rest (> 2 1)]
  (if need-to-rest
    "drink bottle!!!"
    "Don't drink bottle!!!"))

;; this is very confusing

;; function

(defn drink [need-to-grow-small]
  (when need-to-grow-small "drink elixir!!!"))

(defn low [need-to-grow-smart]
  (when need-to-grow-smart "drink coffee!!!"))

(drink true)

(low false)

(when-let [need-an-out true]
  "Strikeout!!!")

(when-let [need-an-out false]
  "Strikeout!!!")

(let [pitch "Fastball"]
  (cond
   (= pitch "Slider") "Groundball"
   (= pitch "Curveball") "Fly ball to Left field"
   (= pitch "Changeup") "Homerun!!!"
   (= pitch "Fastball") "Strike!!!"))

(let [pitch "Curveball"]
  (cond
   (= pitch "Slider") "Groundball"
   (= pitch "Curveball") "Fly ball to Left field"
   (= pitch "Changeup") "Homerun!!!"
   (= pitch "Fastball") "Strike!!!"))

;; once logical test returns true the expression is evaluated

(let [x 6]
  (cond
   (> x 5) "bigger than 5"
   (> x 14) "bigger than 14"
   (> x 13) "bigger than 13"))

;; default result that does not meet logical test requirements
(let [pitch "Curveball"]
  (cond
   (= pitch "Slider") "Groundball"
   (= pitch "Curveball") "Fly ball to Left field"
   (= pitch "Changeup") "Homerun!!!"
   (= pitch "Fastball") "Strike!!!"
    :else "Foul Ball!!!"))

  ;; case is shortcut for cond

  (let [bottle "mystery"]
  (case bottle
   "poison" "don't touch"
   "drinkme" "grow smaller"
   "empty" "all gone"
   "fubar"))

  ;; Use if for branch control
  ;; User when for evaluating expressions
  ;; Use cond for testing multiple expressions
  ;; use case for a nice shortcut for single-value cond tests

  (defn toggle-grow [direction]
  (if (= direction :small) :big :small))

  (toggle-grow :big)

  (toggle-grow :small)

  ;; what direction is it growing

  (defn oh-my [direction]
  (str "Oh My! You are growing " direction))

  (oh-my (toggle-grow :small))

  ;; combine the two functions comp

  (defn suprise [direction]
    ((comp oh-my toggle-grow) direction))

  (suprise :big)

  (suprise :small)



