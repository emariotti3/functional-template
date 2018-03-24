(ns exercise7)

(defn fmap [f l] 
	"Receives an iterable structure 'l' and a function 'f'. 
	If l is list/vector, a new list/vector is returned where the function 'f' has been applied to each element.
	If l is a hash-map, a new hash-map is returned where each pre-existing key has been associated to the result
	of having applied 'f' to its associated value."

	(
	    if (map? l)
	      (into {} (for [[k v] l] [k (f v)]))
	      (map inc l)  
  	)
)
