(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll) (product (rest coll)))))

(defn singleton? [coll]
  (cond
    (empty? coll) false
    (second coll) false
    :else true))

(defn my-last [coll]
  (let [value (first coll)]
    (if (nil? (second coll))
      value
      (my-last (rest coll)))))

(defn max-element [a-seq]
  (let [a (first a-seq)
        b (second a-seq)
        max-value (fn [a b] (max a b))]
    (cond
      (empty? a-seq) nil
      (nil? a) max-value
      (nil? b) a
      :else (max-element (rest a-seq)))))
      

(defn seq-max [seq-1 seq-2]
  (if (> (count seq-1) (count seq-2))
    seq-1
    seq-2))


(defn longest-sequence [a-seq]
  (cond 
    (empty? a-seq) nil
    (= (count a-seq) 1) (first a-seq)
    (= (count a-seq) 2) (seq-max (first a-seq) (second a-seq))
    :else (longest-sequence (rest a-seq))))

;Exercise 8
(defn my-filter [pred? a-seq]
  (if (empty? a-seq) 
    a-seq
    (let [new-seq '()
          first-el (first a-seq)]
      (if (pred? first-el)
        (cons first-el (my-filter pred? (rest a-seq)))
        (my-filter pred? (rest a-seq))))))


;Exercise 9
(defn sequence-contains? [elem a-seq]
  (cond 
    (empty? a-seq) false
     (= elem (first a-seq)) true
    :else (sequence-contains? elem (rest a-seq))))


;Exercise 10
(defn my-take-while [pred? a-seq]
   (if (empty? a-seq) 
    a-seq
    (let [new-seq '()
          first-el (first a-seq)]
      (if (pred? first-el)
        (cons first-el (my-take-while pred? (rest a-seq)))
        new-seq))))
    

;Exercise 11
(defn my-drop-while [pred? a-seq]
   (cond 
     (empty? a-seq) a-seq
     (pred? (first a-seq)) (my-drop-while pred? (rest a-seq))
     :else a-seq)) 


;Exercise 12
(defn seq= [a-seq b-seq]
  (cond
    (and (empty? a-seq) (empty? b-seq)) true
    (= (first a-seq) (first b-seq)) (seq= (rest a-seq) (rest b-seq))
    :else false))


;Exercise 13
(defn my-map [f seq-1 seq-2]
  (if (or (empty? seq-1) (empty? seq-2))
    '()
    (cons (+ (first seq-1) (first seq-2)) (my-map f (rest seq-1) (rest seq-2)))))


;Exercise 14
(defn power [n k]
  (cond 
    (zero? n) 0
    (zero? k) 1
    :else (* n (power n (dec k)))))
    

;Exercise 15
(defn fib [n]
  (cond
    (zero? n) 0
    (= 1 n) 1
    (> n 1) (+ (fib (dec n)) (fib (- n 2)))))


;Exercise 16
(defn my-repeat [how-many-times what-to-repeat]
  (if (< how-many-times 1)
    '()
    (cons what-to-repeat (my-repeat (dec how-many-times) what-to-repeat))))


;Exercise 17
(defn my-range [up-to]
  (if (zero? up-to)
    '()
    (cons (dec up-to) (my-range (dec up-to)))))


;Exercise 18
(defn tails [a-seq]
  (if (empty? a-seq) (cons '() a-seq)
    (cons (apply list a-seq) (tails (rest a-seq)))))

(tails [1 2 3 4]) ;=> ((1 2 3 4) (2 3 4) (3 4) (4) ())


;Exercise 18
(defn inits [a-seq]
  ((let [values (tails a-seq)]
     (reverse values))))

(inits [1 2 3 4]) ;=> (() (1) (1 2) (1 2 3) (1 2 3 4))
; You can output the tails and inits in any order you like.
(inits [1 2 3 4]) ;=> ((1 2) () (1 2 3) (1) (1 2 3 4))

;Exercise 19
(defn rotations [a-seq]
  [:-])

;Exercise 20
(defn my-frequencies-helper [freqs a-seq]
  [:-])

;Exercise 21
(defn my-frequencies [a-seq]
  [:-])

;Exercise 22
(defn un-frequencies [a-map]
  [:-])

;Exercise 23
(defn my-take [n coll]
  [:-])

;Exercise 24
(defn my-drop [n coll]
  [:-])

;Exercise 25
(defn halve [a-seq]
  [:-])

;Exercise 26
(defn seq-merge [a-seq b-seq]
  [:-])

;Exercise 27
(defn merge-sort [a-seq]
  [:-])

;Exercise 28
(defn split-into-monotonics [a-seq]
  [:-])

;Exercise 29
(defn permutations [a-set]
  [:-])

;Exercise 30
(defn powerset [a-set]
  [:-])

