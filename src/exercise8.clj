(ns exercise8)

(defn fderive 
	"Receives a function 'f' and a differential value 'delta'.
	Returns a function to aproximate f's first derivative. It is assumed that Dom(f):R -> R."
	[f delta]
	(fn [x] (/ (- (f (+ x delta)) (f (- x delta)) ) (* 2 delta)))
)	

