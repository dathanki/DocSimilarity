;; namespace and requirements
(ns tester.core
  (:require [clojure.string :as str]
            [clojure.java.io :as io]))
(load "Utils")


(defn -main [& args]
  
;; Algo #1 - Jaccard Index
;; Sample data test 
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #0. Matching Words on sample dataset #" x ": " (Jaccard-Similarity (nth sample_docs 0) (nth sample_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth sample_docs 0) (nth sample_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #1. Matching Words on sample dataset #" x ": " (Jaccard-Similarity (nth sample_docs 1) (nth sample_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth sample_docs 1) (nth sample_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #2. Matching Words on sample dataset #" x ": " (Jaccard-Similarity (nth sample_docs 2) (nth sample_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth sample_docs 2) (nth sample_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #3. Matching Words on sample dataset #" x ": " (Jaccard-Similarity (nth sample_docs 3) (nth sample_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth sample_docs 3) (nth sample_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #4. Matching Words on sample dataset #" x ": " (Jaccard-Similarity (nth sample_docs 4) (nth sample_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth sample_docs 4) (nth sample_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #5. Matching Words on sample dataset #" x ": " (Jaccard-Similarity (nth sample_docs 5) (nth sample_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth sample_docs 5) (nth sample_docs x)))))
    (recur (+ x 1))))

;; Algo #1 - Jaccard Index
;; larger data test 

(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #0. Matching Words on larger dataset #" x ": " (Jaccard-Similarity (nth larger_docs 0) (nth larger_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth larger_docs 0) (nth larger_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #1. Matching Words on larger dataset #" x ": " (Jaccard-Similarity (nth larger_docs 1) (nth larger_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth larger_docs 1) (nth larger_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #2. Matching Words on larger dataset #" x ": " (Jaccard-Similarity (nth larger_docs 2) (nth larger_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth larger_docs 2) (nth larger_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #3. Matching Words on larger dataset #" x ": " (Jaccard-Similarity (nth larger_docs 3) (nth larger_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth larger_docs 3) (nth larger_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #4. Matching Words on larger dataset #" x ": " (Jaccard-Similarity (nth larger_docs 4) (nth larger_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth larger_docs 4) (nth larger_docs x)))))
    (recur (+ x 1))))
(println "\n")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #5. Matching Words on larger dataset #" x ": " (Jaccard-Similarity (nth larger_docs 5) (nth larger_docs x))))
    (println (str "Number of matching words on Test #" x " --> " (count (Jaccard-Similarity (nth larger_docs 5) (nth larger_docs x)))))
    (recur (+ x 1))))


;; Algo #2 - Hamming distance
;; sample data test 

(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #0. Hamming distance on sample dataset #" x ": " (hammingdistance (nth sample_docs 0) (nth sample_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #1. Hamming distance on sample dataset #" x ": " (hammingdistance (nth sample_docs 1) (nth sample_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #2. Hamming distance on sample dataset #" x ": " (hammingdistance (nth sample_docs 2) (nth sample_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #3. Hamming distance on sample dataset #" x ": " (hammingdistance (nth sample_docs 3) (nth sample_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #4. Hamming distance on sample dataset #" x ": " (hammingdistance (nth sample_docs 4) (nth sample_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #5. Hamming distance on sample dataset #" x ": " (hammingdistance (nth sample_docs 5) (nth sample_docs x))))
    (recur (+ x 1))))



;; Algo #2 - Hamming distance
;; larger data test 
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #0. Hamming distance on larger dataset #" x ": " (hammingdistance (nth larger_docs 0) (nth larger_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #1. Hamming distance on larger dataset #" x ": " (hammingdistance (nth larger_docs 1) (nth larger_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #2. Hamming distance on larger dataset #" x ": " (hammingdistance (nth larger_docs 2) (nth larger_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #3. Hamming distance on larger dataset #" x ": " (hammingdistance (nth larger_docs 3) (nth larger_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #4. Hamming distance on larger dataset #" x ": " (hammingdistance (nth larger_docs 4) (nth larger_docs x))))
    (recur (+ x 1))))
(println  "")
(loop [x 0]
  (when (< x 6)
    (println  (str "Base document #5. Hamming distance on larger dataset #" x ": " (hammingdistance (nth larger_docs 5) (nth larger_docs x))))
    (recur (+ x 1))))
  )

