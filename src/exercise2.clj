(ns exercise2)


(defn only-greater-than-five
	"Receives a list of numbers. Returns a new list with only those elements that are greater than 5."
	[l]
	(filter (fn [x] (> x 5)) l)
)
