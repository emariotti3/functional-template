(ns exercise6)

(defn faverage [l]
	(def tot (reduce (fn [[sum freq] v] [(+ sum v) (inc freq)]) [0 0] l ) )
	(def freq (get tot 1))
	(if (not= freq 0)
	  	(/ (get tot 0) freq)
	  	(0)
	)
)

