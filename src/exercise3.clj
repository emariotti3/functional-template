(ns exercise3)

(defn fibonacci 
	"Receives a positive integer. Returns the fibonacci number corresponding to that position in the sequence."
	[n]
	(if (<= n 0) 0 
		(if (== n 1) 1 (+ (fibonacci (- n 1)) (fibonacci (- n 2))) 
		)
	)
)
