(ns lc)

;; commas are white space :-)

'(1 2 "jam" :marmalade-jar)

(first '(:rabbit :pocket-watch :marmalade :door))

(rest '(:rabbit :pocket-watch :marmalade :door))

;; cons takes two arguments what you want to add and the list you want to add it too

(cons 5 '())

;; buliding a list with nil
(cons 5 nil)

;; adding 3 & 4
(cons 4 (cons 5 nil))

(cons 3 (cons 4 (cons 5 nil)))

(list 1 2 3 4 5)


