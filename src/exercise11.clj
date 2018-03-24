(ns exercise11)

(defn fmap-nil 
	"Receives a hash-map 'm' and a key 'k'. 
	Returns true if the value mapped to 'k' is nil, otherwise returns false."
	[m k]
	(nil? (get m k))
)
