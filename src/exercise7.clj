(ns exercise7)

(defn fmap [f l] 
  (
    if (map? l)
      (into {} (for [[k v] l] [k (f v)]))
      (map inc l)  
  )
)
