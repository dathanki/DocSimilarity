;; namespace and requirements
(ns Utils.core
  (:require [clojure.string :as str]
            [clojure.java.io :as io]))

;; Defining our textual documents 
    ;; control Test string
(def Tester ["This is a test."
             "This is a test."])

    ;; Sample docs
(def sample_docs ["This is a textual English document. The quick brown fox jumps over the lazy dog. Ths is a document."
                  "This is a textual English document. The quick white wolf eats the lazy sheep."
                  "This is a textual English document. The slow brown fox jumps into the quizzical dog."
                  "This is a textual English document. The slow white wolf lays next to the lazy dog."
                  "This is a textual English document. The quick brown fox jumps over the laz cat."
                  "This is a textual English document. The quick brown fox jumps over the lazy dog. This is a document."])

    ;; Larger Varied docs
(def larger_docs ["Mayor Bill de Blasio’s counsel and chief legal adviser, Maya Wiley, is resigning next month from her City Hall position to become the chairwoman of the Civilian Complaint Review Board, New York City’s independent oversight agency for the Police Department"
                  "In the early morning hours of Labor Day last year, a group of gunmen from the 8-Trey street gang made their way through a crowd of revelers gathered near a Brooklyn public housing project to celebrate J’ouvert, a pre-dawn party that precedes the annual West Indian American Day Parade. The housing project was “enemy territory,” the authorities said, the stronghold of a rival gang, the Folk Nation."
                  "Londoners will decide whether to elect Sadiq Khan, the Labour front-runner, as their first Muslim mayor on Thursday, but in elections being held across Britain the wider results will pose a bigger test for the party as a whole — especially for Jeremy Corbyn, its left-wing leader"
                  "Federal prosecutors in Manhattan asked a judge on Wednesday to deny bail to Reza Zarrab, a prominent gold trader based in Turkey who has been jailed in New York pending trial on charges that he conspired to violate United States sanctions on Iran."
                  "The book, Bible Emoji: Scripture 4 Millenials, is based on a Twitter feed that has been posting emojified Bible verses for almost a year. (The author intentionally misspelled “millennial,” he said, to thumb his nose at critics who might dismiss the project as the work of the young and foolish.)"
                  "Peter Parker, a.k.a. Spider-Man, grew up in Queens, and several superheroes have lived in Manhattan, including Captain America, a son of the Lower East Side. But this Saturday and Sunday, Brooklyn will pack the most kapow of any borough, producing dozens of its own young challengers, ready to vanquish evil and soar to great heights (at least in their imaginations)."])

    ; Take input, make uppercase, split by omitting all except numerical and alphabet characters 
(defn split-words [input]
  (str/split (str/upper-case input) #"\W+"))


  ;; ALGO 1 - Jaccard index 
(defn Jaccard-Similarity [string1 string2]
  (let [string1 (set (split-words string1))
        string2 (set (split-words string2))]
    (clojure.set/intersection string1 string2)))


  ;; Testing using Jaccard index
(println  (str "TEST CASE - To see if it works if identical string is compared\n"))
(println (str "Jaccard index = " (Jaccard-Similarity (nth Tester 0) (nth Tester 1))))


;; The function below is for addressing unequal strings within the context of the hamming distance algo. 
;; The function adds characters in to the string that is less to then match the length of the max string.
(defn balance [a b]
  (if (< (count a) (count b))
    (do (let [x (- (- (count b) (count a)) 1)]
          (str a (dotimes [i x])))
        (count (filter true? (map = a b))))
    (do (let [x (- (- (count a) (count b)) 1)]
          (str b (dotimes [i x])))
        (count (filter true? (map = a b))))))


;; ALGO 2 - HAMMING DISTANCE 
;; The standard algorithm, typicaly assumes that strings comared are of equal lenght. 
(defn hammingdistance [string1 string2]
  (if (= (count string1) (count string2))
    (count (filter true? (map = string1 string2)))
    (balance string1 string2)))
