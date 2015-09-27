(ns LC.Concurrency2)

(def alice-height (ref 3))
(def right-hand-bites (ref 10))

@alice-height

@right-hand-bites

(defn eat-from-right-hand []
  (when (pos? @right-hand-bites)
    (alter right-hand-bites dec)
    (alter alice-height #(+ % 24))))

(eat-from-right-hand)

(dosync (eat-from-right-hand))

@alice-height

@right-hand-bites

(def alice-height (ref 3))
(def right-hand-bites (ref 10))

(defn eat-from-right-hand []
  (dosync (when (pos? @right-hand-bites)
            (alter right-hand-bites dec)
            (alter alice-height #(+ % 24)))))

(let [n 2]
  (future (dotimes [_ n] (eat-from-right-hand)))
  (future (dotimes [_ n] (eat-from-right-hand)))
  (future (dotimes [_ n] (eat-from-right-hand))))

@alice-height

(def x (ref 1))
(def y (ref 1))

(defn new-values []
  (dosync  2
   (alter x inc)
   (ref-set y  (+ 2 @x))))

(let [n 2]
  (future (dotimes [_ n] (new-values)))
  (future (dotimes [_ n] (new-values))))

@x

@y

(def who-agent (agent :caterpillar))

@who-agent

(def who-agent (agent :caterpillar))

(defn change [state]
  (case state
    :caterpillar :chrysalis
    :chrysalis :butterfly
    :butterfly))

@who-agent

(send-off who-agent change)

@who-agent

(def who-agent (agent :caterpillar))

(defn change [state]
  (case state
    :caterpillar :chrysalis
    :chrysalis :butterfly
    :butterfly))

(defn change-error [state]
  (throw (Exception. "Boom!")))

(send who-agent change-error)

@who-agent

(send-off who-agent change)

(agent-errors who-agent)

(restart-agent who-agent :caterpillar)