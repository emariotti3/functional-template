(ns exercise6)

(defn faverage [l]
	"Receives a list of numbers l. Returns the average of the numbers contained in l.
	If l is an empty list, the value 0 will be returned."
	(def tot (reduce (fn [[sum freq] v] [(+ sum v) (inc freq)]) [0 0] l ) )
	(def freq (get tot 1))
	(if (not= freq 0)
	  	(/ (get tot 0) freq)
	  	(0)
	)
)

