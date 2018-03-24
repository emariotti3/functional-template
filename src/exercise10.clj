(ns exercise10)

(defn dist_to_avg [x avg] 
	(* (- x avg) (- x avg))
)

(defn faverage [l f]
	(def tot (reduce (fn [[sum freq] v] [(+ sum (f v)) (inc freq)]) [0 0] l ) )
	(def freq (get tot 1))
	(if (not= freq 0)
	  	(/ (get tot 0) freq)
	  	(0)
	)
)

(defn fvariance [l]
	(def avg (faverage l (fn [x] x)) )
  	(faverage l (fn [v] (dist_to_avg v avg) ) )
)
