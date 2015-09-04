(ns LC.recursion)

;; recursion = functions that call themselves...
;; it is the way to iterate through a sequence

(def adjs ["normal"
           "too small"
           "too big"
           "just right"
           "playing guitar"])

(defn alice-is [in out]
  (if (empty? in) ;; check to see if vector is empty
    out ;; if empty we are done processing and we are ready to return the result
    (alice-is ;; if not done we start over
     (rest in) ;; in the first position we give it the original input
     (conj out ;; we provide the string to the element and append the result
           (str "Alice is " (first in))))))

(alice-is adjs [])

;; Basic recursion using a loop

(defn alice-is [input]
  (loop [in input  ;; recur jumps back to the recursion point which is the beginning of the loop..then
         out []]   ;; then rebinds the new parameters
    (if (empty? in)
      out
      (recur (rest in) ;; the loop used recur instead of calling a named function
             (conj out
                   (str "Alice is " (first in)))))))

(alice-is adjs)

;; recur has another important advantage..provides a way of not consuming the stack for recursive calls

(defn countdown [n]
  (if (= n 0)
    n
    (countdown (- n 1))))

(countdown 8)

;; with recur

(defn countdown [n]
  (if (= n 0)
    n
    (recur (- n 1))))

(countdown 10000)