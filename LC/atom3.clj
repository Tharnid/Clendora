(ns LC.atom3)

(def counter (atom 0))

(defn inc-print [val]
  (println val)
  (inc val))

(let [n 2]
  (future (dotimes [_ n] (swap! counter inc-print)))
  (future (dotimes [_ n] (swap! counter inc-print)))
  (future (dotimes [_ n] (swap! counter inc-print))))

@counter
@counter

(def alice-height (ref 3))

(def right-hand-bites (ref 10))

@right-hand-bites

@alice-height