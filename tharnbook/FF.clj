(ns jeff.favfoods)

*ns*

(def fav-food "Blackberry Jam")

fav-food

;; accessed by namespace
jeff.favfoods/fav-food

(def follow-again (fn [] (str "Off we go" "!!!")))

(follow-again)

(clojure.set/union #{:r :b :w} #{:w :p :y})

(require 'clojure.set)

;; alias
(:require '[jeff.favfoods :as jf]))