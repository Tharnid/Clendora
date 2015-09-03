(ns FlowTrans)

(= #{1 2 3 4} (conj #{1 4 3} 2))


(let [{flower1 :flower1 flower2 :flower2}
      {:flower1 "red" :flower2 "blue"}]
  (str "The flowers are " flower1 " and " flower2))


(let [{flower1 :flower1 flower2 :flower2 :or {flower2 "missing"}}
      {:flower1 "red"}]
  (str "The flowers are " flower1 " and " flower2))

(let [{flower1 :flower1 :as all-flowers}
      {:flower1 "red" :flower3 "white"}]
  [flower1 all-flowers])

(let [{:keys [flower1 flower2]}
      {:flower1 "red" :flower2 "blue"}]
  (str "The flowers are " flower1 " and " flower2))

