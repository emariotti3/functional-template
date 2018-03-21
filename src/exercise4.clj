(ns exercise4)

(defn summary 
	"Receives a list of numbers. Returns the sum of all the elements in the list."
	[l]
	(reduce + l)
)

