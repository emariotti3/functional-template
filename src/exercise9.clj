(ns exercise9)

(defmulti multimethod-type-namer (fn [v] (type v)))

(defmethod multimethod-type-namer java.lang.String [v] "String")

(defmethod multimethod-type-namer clojure.lang.PersistentVector [v] "Vector")

(defmethod multimethod-type-namer clojure.lang.PersistentArrayMap [v] "Map")

(defmethod multimethod-type-namer :default [v] "default")


(defn things 
	"Given a structure 'v' returns a string indicating the type name.
	If there is no defined string for type('v') the returned string will indicate type 'default'."
	[v] 
	(str "Soy un " (multimethod-type-namer v))
)

