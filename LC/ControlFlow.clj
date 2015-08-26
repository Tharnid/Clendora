(ns LC.ControlFlow)

(def x "Hello")

(if (empty? x)
  "X is empty!!!"
  "X is not empty!!!")

;; falsy values

;; false nil

(if (empty? x)
  nil
  (do
    (println "OK!!!")
    :ok))

