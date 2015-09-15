(ns LC.Atoms)

;; Atoms are designed to store the state of something that is independent...we can change the value indep. of changing any other state

(def who-atom (atom :honeybadger))

who_atom
@who-atom

;; defining a change function

(defn change [state]
  (case state
    :ondeck :started
    :troubled :finished
    :delayed))

(swap! who-atom change)

(swap! who-atom change)

@who-atom

(swap! who-atom change)

(swap! who-atom change)

(swap! who-atom change)

(swap! who-atom change)