(ns FlowTrans)

(+ 2 2)

;; destructuring -- allows you to assign named bindings for the elements

(let [[color size] ["blue" "small"]]
  (str "The " color " door is " size))

;; could have used a let

(let [x ["blue" "small"]
      color (first x)
      size (last x)]
    (str "The " color " door is " size))

;; destructuring with maps

(let [{flower1 :flower1 flower2 :flower2}
      {:flower1 "red" :flower2 "blue"}]
  (str "The flowers are " flower1 " and " flower2))

(let [{flower1 :flower1 flower2 :flower2 :or {flower2 "missing"}}
      {:flower1 "red"}]
  (str "The flowers are " flower1 " and " flower2))


(= "HELLO WORLD"(.toUpperCase "hello world"))

(= (list :a :b :c) '(:a :b :c))

;; sprinkling in 4clojure and clojure koans problems

(= 2 (not (= 1 nil)))

(= '(1 2 3 4)(conj '(2 3 4) 1)) ;; #5

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)) ;; #6

(= [1 2 3 4] (conj [1 2 3] 4));; #7

(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}));; #8
