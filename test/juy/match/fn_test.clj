(ns jai.match.fn-test
  (:use midje.sweet)
  (:require  [jai.match [pattern :refer :all] fn]))

(fact "make sure that functions are working properly"
  ((pattern-fn vector?) [])
  => throws

  ((pattern-fn #'vector?) [])
  => true

  ((pattern-fn '^:% vector?) [])
  => true
  
  ((pattern-fn '^:% symbol?) [])
  => false

  ((pattern-fn '[^:% vector?]) [[]])
  => true)
