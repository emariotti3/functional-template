(ns exercise10)

(defn square_dist [x y] 
	"Receives two numbers x and y.
	Returns the square of the distance between x and y."
	(* (- x y) (- x y))
)

(defn faverage 
	"Receives a list of numbers l. Returns the average of the numbers contained in l.
	If l is an empty list, the value 0 will be returned."
	[l f]
	(def tot (reduce (fn [[sum freq] v] [(+ sum (f v)) (inc freq)]) [0 0] l ) )
	(def freq (get tot 1))
	(if (not= freq 0)
	  	(/ (get tot 0) freq)
	  	(0)
	)
)

(defn fvariance 
	"Receives a list of numbers l. Returns the variance of the numbers contained in l.
	If l is an empty list, the value 0 will be returned."
	[l]
	(def avg (faverage l (fn [x] x)) )
  	(faverage l (fn [v] (square_dist v avg) ) )
)
