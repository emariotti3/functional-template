(ns exercise8)

(defn fderive [f delta]
	(fn [x] (/ (- (f (+ x delta)) (f (- x delta)) ) (* 2 delta)))
)	

